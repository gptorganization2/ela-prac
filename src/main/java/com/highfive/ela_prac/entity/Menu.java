package com.highfive.ela_prac.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tbl_menu")
@Data
public class Menu {

    @Id
    @Column(name="menu_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int menuCode;

    @Column
    private String menuName;

    @Column
    private int menuPrice;

    @Column
    private int categoryCode;

    @Column
    private String orderableStatus;

}
