package edu.czjt.reggie.entity;


import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Setmeal implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Long categoryId;
    private String name;
    private BigDecimal price;
    private Long status;
    private String code;
    private String description;
    private String image;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Long createUser;
    private Long updateUser;
    private Long isDeleted;


}