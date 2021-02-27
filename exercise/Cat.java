package exercise;

public class Cat extends Pet{
	String petName;
	public Cat() {
		
	}
	public Cat(String petName) {
		this.petName=petName;
	}
	public void eat(Host h) {
		System.out.println(h.hostName+"喂养"+petName+"吃东西.");
	}
}

