package springnotboot;

import org.apache.catalina.core.ApplicationContext;
import org.apache.naming.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
public static void main(String[] args) {
	
	//BeanFactory b=new 	XmlBeanFactory(new FileSystemResource("spring.xml"));
	
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
  Triangle tri=  (Triangle)context.getBean("triangle");
  //tri.setName("prabu");
  set(tri);

 System.out.println( tri.getP());
  tri.print();
  Triangle tri2=  (Triangle)context.getBean("triangle");
  System.out.println(tri2.getFac());

}

static void set(Triangle tri)
{
	  NotInBeanFactory f=new NotInBeanFactory();
	  f.setFf(true);
	  tri.setFac(f);
	tri.setName("kk");
}
}
