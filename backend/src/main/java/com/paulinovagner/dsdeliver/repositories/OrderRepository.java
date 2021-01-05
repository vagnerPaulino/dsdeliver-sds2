package com.paulinovagner.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulinovagner.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
