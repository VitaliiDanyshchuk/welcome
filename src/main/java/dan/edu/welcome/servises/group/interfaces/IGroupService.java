package dan.edu.welcome.servises.group.interfaces;


import dan.edu.welcome.model.Cafedra;
import dan.edu.welcome.model.Group;

import java.util.List;

public interface IGroupService {
    Group create (Group cafedra);
    Group get (String id);
    Group update (Group cafedra);
    Group delete (String id);
    List getAll ();
}
