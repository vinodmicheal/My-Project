package com.example.proj1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

    @Id
    private int id ;
    private  String name;
    private String desc;
    private String brand;
    private int price ;
    private String cate;
    private boolean avail;
    private int quan;
    private Date redate;
}
