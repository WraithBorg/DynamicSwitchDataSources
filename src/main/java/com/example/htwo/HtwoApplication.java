package com.example.htwo;

import com.example.htwo.component.SprDbNameThread;
import com.example.htwo.eum.DbNameEum;
import com.example.htwo.service.DdlService_H2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@MapperScan("com.example.htwo.mapper")
public class HtwoApplication {
	@Resource
	private DdlService_H2 h2DdlService;

	public static void main(String[] args) {
		SpringApplication.run(HtwoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {

		return args -> {
			SprDbNameThread.set(DbNameEum.H2.name());
			h2DdlService.initDataBase();
			SprDbNameThread.remove();
		};
	}
}
