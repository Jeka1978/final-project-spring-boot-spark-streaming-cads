package com.iai.cads.finalprojectspringbootsparkstreaming.dao;

import com.iai.cads.finalprojectspringbootsparkstreaming.model.Productum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface ProductumDao extends JpaRepository<Productum, Integer> {


    @RestResource(path = "/byprice")
    List<Productum> findByPriceGreaterThan(@Param("price") int price);


}
