package newSpringBoot.springBootExample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import newSpringBoot.springBootExample.model.User;
import newSpringBoot.springBootExample.repository.UserRepository;

@Service
public class UserDAO {

	@Autowired
	UserRepository userRepository;
	
	/* CREATE AN USER */
	public User create(User user){
		return userRepository.save(user);
	}
	
	
	/*SEARCH USER	 */
	
	public List<User>FindAll() {
		return userRepository.findAll();
	}
	/*GET USER by id*/
	public User findOne(Long userId) {
		return userRepository.findOne(userId);
	}
}
