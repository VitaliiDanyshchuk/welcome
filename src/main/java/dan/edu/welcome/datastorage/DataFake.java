package dan.edu.welcome.datastorage;

import dan.edu.welcome.model.Cafedra;
import dan.edu.welcome.model.Group;
import dan.edu.welcome.repository.CafedraRepository;
import dan.edu.welcome.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository
public class DataFake {

    @Autowired
    CafedraRepository cafedraRepository;
    @Autowired
    GroupRepository groupRepository;

    List<Cafedra> cafedras = new LinkedList<>(Arrays.asList(
            new Cafedra("IPZ", "Ivanov", "Engineering"),
            new Cafedra("KN", "Petrov", "MSOffice"),
            new Cafedra("IT", "Pshek", "VoitiVIT")
    ));
/*
    List<Cafedra> cafedras = new LinkedList<>(Arrays.asList(
            new Cafedra("IPZ", "Ivanov", "Engineering"),
            new Cafedra("KN", "Petrov", "MSOffice"),
            new Cafedra("IT", "Pshek", "VoitiVIT")
    ));*/

   // @PostConstruct
    public void init(){
        cafedraRepository.deleteAll();
        cafedraRepository.saveAll(cafedras);
        groupRepository.deleteAll();
        groupRepository.saveAll(groups);
    }

    List<Group> groups = new LinkedList<>(Arrays.asList(
            new Group("1","543", "Chernovtsy", cafedras.get(0)),
            new Group("2","KN-42", "Uzhhorod", cafedras.get(1)),
            new Group("3","6.03.532.1", "Kharkov", cafedras.get(2))
    ));

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Cafedra> getCafedras(){
        return cafedras;
    }
    public void setCafedras(List<Cafedra> cafedras){
        this.cafedras = cafedras;
    }


}

