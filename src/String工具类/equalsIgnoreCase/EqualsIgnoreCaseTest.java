package String工具类.equalsIgnoreCase;

public class EqualsIgnoreCaseTest {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "ABC";
        System.out.println(s1.equalsIgnoreCase(s3));//true
        System.out.println(s1.equals(s3));//false
    }
}
