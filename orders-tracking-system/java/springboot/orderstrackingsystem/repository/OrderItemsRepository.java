package springboot.orderstrackingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.orderstrackingsystem.model.OrderItems;
import springboot.orderstrackingsystem.model.Orders;
import springboot.orderstrackingsystem.model.Product;

@Repository
public interface OrderItemsRepository extends JpaRepository<OrderItems, Integer> {
    List<OrderItems> findByProduct(Product product);

    List<OrderItems> findByOrders(Orders orders);

}
