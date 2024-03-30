package springboot.orderstrackingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import springboot.orderstrackingsystem.model.Customer;
import springboot.orderstrackingsystem.model.Orders;

import java.time.LocalDate;
import java.util.List;
import springboot.orderstrackingsystem.dto.OrdersDto;


@Repository
public interface OrdersRepository  extends JpaRepository<Orders,Integer>{
     List<Orders> findByCustomer(Customer customer);

    List<Orders> findByOrderDate(LocalDate orderDate);

    List<Orders> findOrdersByStatus(String status);
}