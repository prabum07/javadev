package springnotboot;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,BeanNameAware {

	NotInBeanFactory fac;
	Point p;
	public Point getP() {
		return p;
	}
	public void setP(Point p) {
		this.p = p;
	}
	public NotInBeanFactory getFac() {
		return fac;
	}
	public void setFac(NotInBeanFactory fac) {
		this.fac = fac;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Triangle( String name) {
		super();
		
		this.name = name;
	}
	String name;
	
	public void print()
	{
		System.out.println("triangle");
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		
	}
}
