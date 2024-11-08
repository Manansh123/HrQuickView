package com.HrQuickView.repository;

import com.HrQuickView.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CityRepository extends JpaRepository<City,Long> {

    List<City> findAllByShowInWebsite(boolean showInWebsite);

    Optional<City> findByName(String name);
}
