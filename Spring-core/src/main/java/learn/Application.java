package learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {
	public static void main(String[] args) {
//		ClassB b = new ClassB();
//		ClassA a = new ClassA();
//		
//		System.out.println(b.getA().doSomething());
//		// instead of doing the obj creation hardcode way we'll use annotation
/*//		
		ApplicationContext contex = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		ClassB b = contex.getBean(ClassB.class);
		System.out.println(b.getId());
		ClassB b1 = contex.getBean(ClassB.class);
		
		
		
		b1.setId(2020);
		
		System.out.println(b1.getId());
		contex.close();
		((AbstractApplicationContext) contex).close();
		
		*/
		ApplicationContext contex = new AnnotationConfigApplicationContext(SpringConfig.class);
		ClassB B1 = (ClassB) contex.getBean("Bobj");
		
		
	}
}
