package com.fish.study.dataBase.api.user;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * .
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-10-09
 */
@RestController
@Api(value="用户controller",tags={"用户操作接口"})
@RequestMapping("/user")
public class SearchUser {

    @GetMapping("/get")
    @ApiOperation(value = "获取用户信息",notes = "获取用户信息")
    public HashMap getUser(){
        return new HashMap(){{
            put("Hello","Fish");
            put("Hello","Swagger");
        }};
    }
}