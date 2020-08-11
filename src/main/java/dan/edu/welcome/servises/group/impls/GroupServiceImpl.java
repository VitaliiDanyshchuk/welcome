package dan.edu.welcome.servises.group.impls;


import dan.edu.welcome.dao.group.impls.DaoGroupImpl;
import dan.edu.welcome.model.Group;
import dan.edu.welcome.servises.group.interfaces.IGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements IGroupService {

    @Autowired
    DaoGroupImpl daoGroup;

    @Override
    public Group create(Group cafedra) {
        return null;
    }

    @Override
    public Group get(String id) {
        return null;
    }

    @Override
    public Group update(Group cafedra) {
        return null;
    }

    @Override
    public Group delete(String id) {
        return null;
    }

    @Override
    public List getAll() {
        return daoGroup.getAll();
    }

}
