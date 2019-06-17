package com.iai.cads.finalprojectspringbootsparkstreaming.services;

import com.github.javafaker.Faker;
import com.iai.cads.finalprojectspringbootsparkstreaming.dao.ProductumDao;
import com.iai.cads.finalprojectspringbootsparkstreaming.model.Productum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Evgeny Borisov
 */
@Service
@Transactional
public class ProductumService {

  @Autowired
  private ProductumDao productumDao;

//    @EventListener(ContextRefreshedEvent.class)
    public void fillDB() {
        Faker faker = new Faker();
        productumDao.saveAll(Arrays.asList(
                Productum.builder().name("Sword").price(400).build(),
                Productum.builder().name("Arrow").price(20).build(),
                Productum.builder().name("Bow").price(250).build(),
                Productum.builder().name("Shield").price(400).build()

        ));
        IntStream.range(1,30)
                .mapToObj(i->Productum.builder().price(20).name(faker.beer().name()).build())
                .forEach(productumSolution -> productumDao.save(productumSolution));

    }
}












