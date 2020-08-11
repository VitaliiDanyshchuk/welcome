package dan.edu.welcome.servises.cafedra.interfaces;

import dan.edu.welcome.model.Cafedra;

import java.util.List;

public interface ICafedraService {
    Cafedra create (Cafedra cafedra);
    Cafedra get (String id);
    Cafedra update (Cafedra cafedra);
    Cafedra delete (String id);
    List getAll ();
}
