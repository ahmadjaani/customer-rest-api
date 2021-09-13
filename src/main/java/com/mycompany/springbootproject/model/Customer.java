package com.mycompany.springbootproject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cg_customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Size(min = 2, max = 20)
    @NotNull(message = "Pls Enter First Name!")
    private String firstName;
    @Size(min = 2, max = 20)
    @NotNull(message = "Pls Enter Last Name!")
    private String lastName;
    @NotNull(message = "Pls Enter Full Address!")
    private String address;
    @NotNull(message = "Pls Enter Email")
    @Email
    private String email;
    @NotNull
    private long mobile;

}
