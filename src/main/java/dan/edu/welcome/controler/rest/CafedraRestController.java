package dan.edu.welcome.controler.rest;

import dan.edu.welcome.model.Cafedra;
import dan.edu.welcome.servises.cafedra.impls.CafedraServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@RequestMapping("/api/cafedra")
@RestController
class CafedraRestController {

    public CafedraRestController(CafedraServiceImpl cafedraServiceImpl) {
        this.cafedraServiceImpl = cafedraServiceImpl;
    }

    @Autowired
    CafedraServiceImpl cafedraServiceImpl;

    @RequestMapping("")
    String getIndex(){
        return "<h1>Index Web Controller</h1>";
    }

    @GetMapping("/hello")
    String getHello() {
        return "<h1>Hello from Cafedra Controller</h1>";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List getCafedrasList() {
        return cafedraServiceImpl.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    Cafedra getCafedra(@PathVariable("id") String id) {
        return cafedraServiceImpl.get(id);
    }



}
