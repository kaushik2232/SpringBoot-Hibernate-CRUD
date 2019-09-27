package com.spring.hibernate.Springboot.CRUD.Repository;

import com.spring.hibernate.Springboot.CRUD.model.products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<products, Integer> {
}
