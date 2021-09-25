package com.awei.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * tbl_user
 *
 * @author
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 2475416363990106383L;
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

}