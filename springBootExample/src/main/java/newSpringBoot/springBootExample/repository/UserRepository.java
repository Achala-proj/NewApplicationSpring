package newSpringBoot.springBootExample.repository;
	
import org.springframework.data.jpa.repository.JpaRepository;

import newSpringBoot.springBootExample.model.User	;


public interface UserRepository extends JpaRepository<User, Long>{

	User findOne(Long userId);
	
}