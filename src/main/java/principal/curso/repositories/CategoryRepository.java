package principal.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import principal.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
