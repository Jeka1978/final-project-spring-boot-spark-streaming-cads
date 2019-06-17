package com.iai.cads.finalprojectspringbootsparkstreaming.model;

import lombok.*;
import lombok.experimental.Wither;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Evgeny Borisov
 */

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Productum implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private int price;









}
