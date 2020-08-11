package dan.edu.welcome.repository;

import dan.edu.welcome.model.Group;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GroupRepository extends MongoRepository<Group, String> {
}
