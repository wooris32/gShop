package com.example.gshop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class GShopTest {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    private String explain;
}
