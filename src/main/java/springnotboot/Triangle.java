package springnotboot;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements InitializingBean,ApplicationContextAware,BeanNameAware,DisposableBean,BeanPostProcessor,BeanFactoryPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("bean before post process");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("bean after post process");

		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	NotInBeanFactory fac;
	Point p;
	public Triangle(Point p, Point p1) {
		super();
		this.p = p;
		this.p1 = p1;
	}
	Point p1;
	public Point getP1() {
		return p1;
	}
	public void setP1(Point p1) {
		this.p1 = p1;
	}
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
		System.out.println("setappcontext");
	}
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("beanname");

	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterpropset");

	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inbuilt destroy method");

	}
	
	public void initCustomMethod()
	{
		System.out.println("custom init method");

	}
	public void destroyCustomMethod()
	{
		System.out.println("custom destroy method");

	}
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("bean factory post processor");
		
	}
}
