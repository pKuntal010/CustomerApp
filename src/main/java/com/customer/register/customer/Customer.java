package com.customer.register.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Customer {
    @Id
    private Integer id;
    private String name;
    private Integer age;
    private String email;
    private Long phNumber;
}
