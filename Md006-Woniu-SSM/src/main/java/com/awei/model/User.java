package com.awei.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * tbl_user
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    /**
     * 主键自增
     */
    private Integer id;

    private String name;

    private Integer age;

    /**
     * tbl_computer
     */
    private Integer cid;

    private static final long serialVersionUID = 1L;
}