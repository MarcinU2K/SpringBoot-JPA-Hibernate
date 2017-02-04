package example.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import example.domain.User;
@Repository
@Transactional
public interface UserDao extends CrudRepository<User, Long> {

	public User findById(long id);

}