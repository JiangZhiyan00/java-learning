package String工具类.compareTo;

public class CompareToTest {
    public static void main(String[] args) {
        int result0="abcd".compareTo("abcd");
        int result1="abcd".compareTo("abce");
        int result2="abcd".compareTo("abcc");
        int result3="abcd".compareTo("abcf");
        System.out.println(result0);//0
        System.out.println(result1);//-1
        System.out.println(result2);//1
        System.out.println(result3);//-2
    }
}
