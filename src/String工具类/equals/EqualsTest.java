package String工具类.equals;

public class EqualsTest {
    public static void main(String[] args) {
        System.out.println("abc".equals("abc"));//true
        String a =new String("abc");
        System.out.println("abc".equals(a));//true
        System.out.println("abc".equals("ab"));//false
    }
}
