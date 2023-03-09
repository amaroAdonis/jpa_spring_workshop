package com.jpa_spring_course.jpa_spring.repositories;

import com.jpa_spring_course.jpa_spring.entities.Order;
import com.jpa_spring_course.jpa_spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
