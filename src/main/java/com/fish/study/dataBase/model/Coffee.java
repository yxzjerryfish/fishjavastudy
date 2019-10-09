package com.fish.study.dataBase.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 咖啡模型
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/10/6 20:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(description = "咖啡模型")
public class Coffee {

    @ApiModelProperty(value = "咖啡ID")
    private Long id;

    @ApiModelProperty(value = "咖啡名称")
    private String name;

    @ApiModelProperty(value = "咖啡价格")
    private Integer price;

    @ApiModelProperty(value = "咖啡添加时间")
    private Date createTime;

    @ApiModelProperty(value = "咖啡更新时间")
    private Date updateTime;
}
