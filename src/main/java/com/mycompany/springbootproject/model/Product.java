package com.mycompany.springbootproject.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "prod_tbl")
public class Product{
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    private String pname;
    private int qty;
    private int price;

}