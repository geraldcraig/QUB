package accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

import accessingdatamysql.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
