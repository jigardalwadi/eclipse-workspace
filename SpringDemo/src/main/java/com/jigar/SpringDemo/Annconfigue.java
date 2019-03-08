package com.jigar.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jigar.SpringDemo")
public class Annconfigue {
	// no need of xml or bean annotation if we use the above annotations
	/*@Bean
	public Samsung getphone() {
		return new Samsung();
	}
	@Bean
	public Processor getProc() {
		return new Snapdragon();
	}*/
}
