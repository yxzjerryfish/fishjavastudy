package com.fish.study.dataBase.api;

import com.fish.study.dataBase.mapper.CoffeeMapper;
import com.fish.study.dataBase.model.Coffee;
import org.springframework.beans.factory.annotation.Autowired;
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
public class SearchCoffee {

    @Autowired
    CoffeeMapper coffeeMapper;

    @RequestMapping("/getCoffee")
    public List<Coffee> getCoffee(){
        return coffeeMapper.findAll();
    }
}
