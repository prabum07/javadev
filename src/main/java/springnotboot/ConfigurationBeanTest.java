package springnotboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class ConfigurationBeanTest {
	
	public dummyBean db;
	
	@Bean
	public void dummay()
	{
		 new dummyBean();
	}

}

@Component("a")
class dummyBean{
	
	public int a;
}
