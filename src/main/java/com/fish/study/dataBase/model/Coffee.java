package com.fish.study.dataBase.model;

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
public class Coffee {
    private Long id;
    private String name;
    private Integer price;
    private Date createTime;
    private Date updateTime;
}
