package com.fpoly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpoly.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
