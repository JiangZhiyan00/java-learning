package exercise;

public class YinWu extends Pet{
	String petName;
	public YinWu() {
		
	}
	public YinWu(String petName) {
		this.petName=petName;
	}
	public void eat(Host h) {
		System.out.println(h.hostName+"喂养"+petName+"吃东西.");
	}
}

