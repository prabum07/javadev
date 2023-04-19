package springnotboot;

import org.apache.catalina.core.ApplicationContext;
import org.apache.naming.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	@Autowired
	dummyBean dummay;
	
	@Autowired
	ConfigurationBeanTest dummay1 =new ConfigurationBeanTest();
public static void main(String[] args) {
	
	//BeanFactory b=new 	XmlBeanFactory(new FileSystemResource("spring.xml"));
	
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    context.registerShutdownHook();
    System.out.println("check whether bean life cycle call on app intialization or during get reference from getbean function");
  Triangle tri=  (Triangle)context.getBean("triangle");
  //tri.setName("prabu");
 // set(tri);
  DrawingApp app=new DrawingApp();
  System.out.println(app.dummay.a);

  System.out.println(app.dummay1);
 System.out.println( tri.getName());
  tri.print();


  
  parentChildBean(tri);

}

static void parentChildBean(Triangle tri)
{
	System.out.println(tri.getP1());
}

static void set(Triangle tri)
{
	  NotInBeanFactory f=new NotInBeanFactory();
	  f.setFf(true);
	  tri.setFac(f);
	tri.setName("kk");
}
}
