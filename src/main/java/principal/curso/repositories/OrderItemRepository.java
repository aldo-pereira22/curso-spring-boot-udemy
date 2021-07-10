package principal.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import principal.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
