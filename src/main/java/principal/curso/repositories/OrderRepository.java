package principal.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import principal.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
