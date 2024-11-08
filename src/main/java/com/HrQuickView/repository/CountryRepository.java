package com.HrQuickView.repository;

import com.HrQuickView.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {

    List<Country> findAllByShowInWebsite(boolean showInWebsite);

    Optional<Country> findByName(String name);

//    List<CountryInfo> findByIsDeletedFalseAndShowInWebsite(boolean showInWebsite);
}
