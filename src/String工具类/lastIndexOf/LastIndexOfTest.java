package String工具类.lastIndexOf;

public class LastIndexOfTest {
    public static void main(String[] args) {
        String a = "abcdcba";
        String aa = "b";
        int lastIndex = a.lastIndexOf(aa);
        System.out.println(lastIndex);//5
    }
}
