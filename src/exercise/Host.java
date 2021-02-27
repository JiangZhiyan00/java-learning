package exercise;

public class Host {
	String hostName;
	public Host(String hostName) {
		this.hostName=hostName;
	}
	public void feed(Pet p) {//feed方法形参为Pet类型,在feed方法体中调用eat方法,实参为当前Host对象
		p.eat(this);
	}
	
}
