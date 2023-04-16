package springnotboot;

public class Triangle {

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
}
