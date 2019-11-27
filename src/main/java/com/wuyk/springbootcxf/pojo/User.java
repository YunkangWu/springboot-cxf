package com.wuyk.springbootcxf.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by WUYK on 2019-11-27.
 */
@Data
@NoArgsConstructor
public class User {

    private Long id;

    private String name;

    private String phone;
}
