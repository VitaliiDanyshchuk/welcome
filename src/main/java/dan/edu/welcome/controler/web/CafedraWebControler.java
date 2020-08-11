package dan.edu.welcome.controler.web;
import dan.edu.welcome.form.CafedraForm;
import dan.edu.welcome.model.Cafedra;
import dan.edu.welcome.servises.cafedra.impls.CafedraServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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


    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String AddCafedra(Model model){
        Cafedra cafedra = new Cafedra();
        cafedra.setName(cafedra.getName());
        cafedra.setDesc(cafedra.getDesc());
        cafedra.setChief(cafedra.getChief());

        model.addAttribute("cafedra", cafedra);
        return "addCafedraList";
    }


}



