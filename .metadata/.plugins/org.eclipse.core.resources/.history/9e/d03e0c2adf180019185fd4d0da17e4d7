package com.jigar.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
	@Qualifier("snapdragon")
	Processor cpu;
	public Processor getCpu() {
		return cpu;
	}
	public void setCpu(Processor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("This is a samsung class");
		cpu.process();
	}
}
