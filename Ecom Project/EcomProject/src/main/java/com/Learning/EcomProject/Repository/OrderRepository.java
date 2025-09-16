package com.Learning.EcomProject.Repository;

import com.Learning.EcomProject.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    Optional<Order> findByOrderId(String orderId);
}
