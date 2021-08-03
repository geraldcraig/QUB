package dwarfwebsitedynamic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DwarfRepository extends CrudRepository<Dwarf, Long> {

}
