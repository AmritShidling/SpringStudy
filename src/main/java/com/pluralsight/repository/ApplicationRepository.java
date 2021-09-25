package com.pluralsight.repository;

import com.pluralsight.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}
