package dan.edu.welcome.repository;

import dan.edu.welcome.model.Cafedra;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CafedraRepository extends MongoRepository<Cafedra, String> {
}
