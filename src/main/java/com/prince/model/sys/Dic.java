package com.prince.model.sys;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 测试表
 * </p>
 *
 * @author kyle
 * @since 2020-09-27
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="Dic对象", description="测试表")
public class Dic extends Model<Dic> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "名称")
    private String userName;

    @ApiModelProperty(value = "主键id")
    private String userId;


    public static final String USER_NAME = "user_name";

    public static final String USER_ID = "user_id";

    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

}
