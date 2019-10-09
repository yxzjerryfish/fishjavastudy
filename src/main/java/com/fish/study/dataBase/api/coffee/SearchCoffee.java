package com.fish.study.dataBase.api.coffee;

import com.fish.study.dataBase.annotation.TestAnnotation;
import com.fish.study.dataBase.mapper.CoffeeMapper;
import com.fish.study.dataBase.model.Coffee;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 搜索咖啡
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/10/7 21:55
 */
@RestController
@Api(value="咖啡controller",tags={"咖啡操作接口"})
public class SearchCoffee {

    @Autowired
    CoffeeMapper coffeeMapper;

//    @TestAnnotation  加在这里和加在接口里一样
    @GetMapping(value = "/getCoffee")
    @ApiOperation(value="获取咖啡列表", notes="获取咖啡列表")
    public List<Coffee> getCoffee(){
        return coffeeMapper.findAll();
    }

    @GetMapping("/getCoffeebyid")
    @ApiOperation(value="获取单个咖啡", notes="获取单个咖啡")
    public Coffee getCoffeeById(Integer id){
        return coffeeMapper.findById(id.longValue());
    }
}
