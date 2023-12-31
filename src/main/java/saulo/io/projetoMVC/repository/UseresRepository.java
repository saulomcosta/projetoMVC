package saulo.io.projetoMVC.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import saulo.io.projetoMVC.config.entity.Useres;

        /*MODEL*/

public interface UseresRepository extends MongoRepository<Useres, Long> {
	
	Useres findByName(String name);
		
	Useres findByNameIgnoreCase(String name);
	
	Useres findByNameIgnoreCaseLike(String name);
	
	Useres findByNameLike(String name);
	
	void deleteByName(String name);
	
	@Query(value = "{ 'name' : ?0 }") 
	List<Useres> findByFirstnameprimeiro(String name);

}
