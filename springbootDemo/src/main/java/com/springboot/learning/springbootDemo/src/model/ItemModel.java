package com.springboot.learning.springbootDemo.src.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@Table(name = "item_info_master")
public class ItemModel {
    @Id
    @Column(name = "productCode")
    private String productCode;
    @Column(name = "itemId")
    private String itemId;
    @Column(name = "description")
    private String description;
    @Column(name = "typeOfItem")
    private String typeOfItem;
}
