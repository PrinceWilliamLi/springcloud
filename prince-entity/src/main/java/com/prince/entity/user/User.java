package com.prince.entity.user;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户实体
 *
 * @author lixin
 * @since 2020-09-17
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    @ApiModelProperty("主键id")
    private String id;

    @ApiModelProperty("姓名")
    private String name;

}
