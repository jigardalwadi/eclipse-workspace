package learn;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class ClassA {
	
	public String doSomething() {
		return "Hello word";
	}
	@PostConstruct
	public void init() {
		System.out.println("Init method classA");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Destroy method A");
	}
}
