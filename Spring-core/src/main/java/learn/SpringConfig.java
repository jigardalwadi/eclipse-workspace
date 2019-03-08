package learn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("learn")
public class SpringConfig {
	@Bean
	public ClassA classAobj() {
		return new ClassA();
	}
	
	@Bean(name="Bobj")
	public ClassB classBobj() {
		return new ClassB();
	}
	
}
