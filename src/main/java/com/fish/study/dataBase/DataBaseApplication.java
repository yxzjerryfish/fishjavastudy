package com.fish.study.dataBase;

import com.fish.study.dataBase.mapper.CoffeeMapper;
import com.fish.study.dataBase.model.Coffee;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@SpringBootApplication
@MapperScan("com.fish.study.dataBase.mapper")
public class DataBaseApplication implements ApplicationRunner {

	@Autowired
	private CoffeeMapper coffeeMapper;

	public static void main(String[] args) {
		SpringApplication.run(DataBaseApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Coffee c = Coffee.builder().name("espresso")
				.price(20).build();

		int count = coffeeMapper.save(c);

		c = Coffee.builder().name("latte")
				.price(25).build();

		count = coffeeMapper.save(c);
		log.info("count Coffee: {},{}", count,c);

		c = coffeeMapper.findById(1L);
		log.info("Find Coffee: {}", c);
	}


}
