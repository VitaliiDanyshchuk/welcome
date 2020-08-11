package dan.edu.welcome.dao.group.impls;

import dan.edu.welcome.dao.group.interfaces.IDaoGroup;
import dan.edu.welcome.datastorage.DataFake;
import dan.edu.welcome.model.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DaoGroupImpl implements IDaoGroup {

    @Autowired
    DataFake dataFake;

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
        return dataFake.getGroups();
    }
}
