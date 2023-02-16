package Com.Merca.Mercarue.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Com.Merca.Mercarue.models.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	//Optional<User> findByUsername(String username);

	Boolean existsByUsername(String username);
    // User findbymail (String email);
	Boolean existsByEmail(String email);
    User findByUsername(String username);

}
