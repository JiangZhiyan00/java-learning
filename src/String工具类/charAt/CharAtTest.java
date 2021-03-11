package String工具类.charAt;

public class CharAtTest {
    public static void main(String[] args) {
        String a = "中国人";
        char result0=a.charAt(0);
        char result1=a.charAt(1);
        char result2=a.charAt(2);
        char result3=a.charAt(3);
        System.out.println(result0);//中
        System.out.println(result1);//国
        System.out.println(result2);//人
        System.out.println(result3);//抛出异常java.lang.StringIndexOutOfBoundsException
    }
}
