package com.SpringBootHibernate.Repository;

import com.SpringBootHibernate.model.Developer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DeveloperRepository extends JpaRepository<Developer, Integer> {

}
