package Com.Merca.Mercarue.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Com.Merca.Mercarue.models.ERole;
import Com.Merca.Mercarue.models.Role;





@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByName(ERole name);
}
