package com.abc.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.entity.Plant;
@Repository
public interface PlantRepository<Product> extends JpaRepository<Product,Integer> {
	

}
