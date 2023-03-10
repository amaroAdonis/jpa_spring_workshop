package com.jpa_spring_course.jpa_spring.repositories;

import com.jpa_spring_course.jpa_spring.entities.Category;
import com.jpa_spring_course.jpa_spring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
