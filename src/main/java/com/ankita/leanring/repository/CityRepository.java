package com.ankita.leanring.repository;

import com.ankita.leanring.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by amitshrivastava on 14/01/17.
 */
@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}
