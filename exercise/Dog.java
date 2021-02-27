package exercise;

public class Dog extends Pet{
	String petName;
	public Dog() {
		
	}
	public Dog(String petName) {
		this.petName=petName;
	}
	public void eat(Host h) {
		System.out.println(h.hostName+"喂养"+petName+"吃东西.");//重写eat方法,h.hostName获取当前主人名
	}
}
