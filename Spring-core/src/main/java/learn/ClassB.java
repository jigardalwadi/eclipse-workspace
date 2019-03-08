package learn;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
//@service
//@Repository
@Scope(value="prototype")
public class ClassB {
	
	@Value("1010")
	private int id;
	
	@Autowired
	private ClassA a;
	
	@PostConstruct
	public void init() {
		System.out.println("Init method");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Destroy method B");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ClassA getA() {
		return a;
	}
	public void setA(ClassA a) {
		this.a = a;
	}
	
	
	
}
