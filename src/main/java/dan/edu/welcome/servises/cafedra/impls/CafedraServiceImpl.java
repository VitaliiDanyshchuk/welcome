package dan.edu.welcome.servises.cafedra.impls;

import dan.edu.welcome.dao.cafedra.impls.DaoCafedraImpl;
import dan.edu.welcome.datastorage.DataFake;
import dan.edu.welcome.model.Cafedra;
import dan.edu.welcome.repository.CafedraRepository;
import dan.edu.welcome.servises.cafedra.interfaces.ICafedraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CafedraServiceImpl implements ICafedraService {

//    @Autowired
//    DaoCafedraImpl daoCafedra;

    @Autowired
    CafedraRepository cafedraRepository;

    @Autowired
    DataFake dataFake;



    @Override
    public Cafedra create(Cafedra cafedra) {
        cafedra.setCreatedAt(LocalDateTime.now());
        cafedra.setModified(LocalDateTime.now());
        return cafedraRepository.save(cafedra);
    }

    @Override
    public Cafedra get(String id) {
        return cafedraRepository.findById(id).orElse(null);
    }

    @Override
    public Cafedra update(Cafedra cafedra) {
        cafedra.setModified(LocalDateTime.now());
        return cafedraRepository.save(cafedra);
    }

    @Override
    public Cafedra delete(String id) {
        Cafedra cafedra = this.get(id);
        cafedraRepository.deleteById(cafedra.getId());
        return cafedra;
    }

    @Override
    public List getAll() {
        return cafedraRepository.findAll();
    }

  public void  reloadDatabase(){
     dataFake.init();

  }

}
