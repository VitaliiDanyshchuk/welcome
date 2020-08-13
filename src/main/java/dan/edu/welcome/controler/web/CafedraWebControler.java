package dan.edu.welcome.controler.web;
import dan.edu.welcome.form.CafedraForm;
import dan.edu.welcome.model.Cafedra;
import dan.edu.welcome.servises.cafedra.impls.CafedraServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/web/cafedra")
public class CafedraWebControler {

    @Autowired
    CafedraServiceImpl cafedraService;

    @RequestMapping("/list")
    String showAll(Model model) {
        model.addAttribute("list", cafedraService.getAll());


        return "cafedralist";
    }



    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
        String deleteCafedra(@PathVariable("id") String id, Model model){
            cafedraService.delete(id);
            model.addAttribute("list",cafedraService.getAll());
            return "redirect:/web/cafedra/list";

           }
    @RequestMapping(value = "/reloadDB", method = RequestMethod.GET)
    String reloadDataBase()
    {
        cafedraService.reloadDatabase();
        return "redirect:/web/cafedra/list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createCafedra(Model model){
        CafedraForm cafedraForm = new CafedraForm();
        model.addAttribute("cafedraForm", cafedraForm);
        return "addCafedraList";
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createCafedra(Model model, @ModelAttribute("cafedraForm") CafedraForm cafedraForm){
        Cafedra cafedra = new Cafedra();
        cafedra.setName(cafedraForm.getName());
        cafedra.setDescription(cafedraForm.getDescription());
        cafedra.setChief(cafedraForm.getChief());
        cafedraService.create(cafedra);

        model.addAttribute("cafedras", cafedraService.getAll());
        return "redirect:/web/cafedra/list";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateCafedra(@PathVariable("id") String id,Model model) {
        Cafedra cafedra = cafedraService.get(id);
        CafedraForm cafedraForm = new CafedraForm(
                cafedra.getId(),
                cafedra.getName(),
                cafedra.getDescription(),
                cafedra.getChief()
        );
        model.addAttribute("cafedraForm", cafedraForm);
        return "updateCafedraList";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateCafedra(Model model, @PathVariable("id") String id,
                                 @ModelAttribute("cafedraForm") CafedraForm cafedraForm){
        Cafedra cafedra = new Cafedra();
        cafedra.setId(id);
        cafedra.setName(cafedraForm.getName());
        cafedra.setDescription(cafedraForm.getDescription());
        cafedra.setChief(cafedraForm.getChief());
        cafedraService.update(cafedra);

        model.addAttribute("cafedraForm", cafedraService.getAll());
        return "redirect:/web/cafedra/list";
    }

    }




