package dan.edu.welcome.controler.rest;

import dan.edu.welcome.dao.group.impls.DaoGroupImpl;
import dan.edu.welcome.model.Group;
import dan.edu.welcome.servises.group.impls.GroupServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/group")
@RestController
public class GroupRestController {

    @Autowired
    GroupServiceImpl groupService;

    @RequestMapping(value = "/list", method= RequestMethod.GET)
    List<Group> getGroups(){
        return groupService.getAll();
    }
}
