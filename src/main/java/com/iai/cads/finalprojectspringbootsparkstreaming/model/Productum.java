package com.iai.cads.finalprojectspringbootsparkstreaming.model;

import lombok.*;
import lombok.experimental.Wither;

import javax.persistence.*;

/**
 * @author Evgeny Borisov
 */

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Productum {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private int price;









}
