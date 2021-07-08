package principal.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import principal.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
