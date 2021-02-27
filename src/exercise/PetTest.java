package exercise;

public class PetTest {

	public static void main(String[] args) {
		Host h1=new Host("张三");
		Pet p1=new Pet("宠物");
		h1.feed(p1);
		Host h2=new Host("李四");
		Pet p2=new Cat("猫");
		h2.feed(p2);
		Host h3=new Host("Jack");
		Pet p3=new Dog("旺财");
		h3.feed(p3);
		Host h4=new Host("Nick");
		Pet p4=new YinWu("八哥");
		h4.feed(p4);
	}

}
