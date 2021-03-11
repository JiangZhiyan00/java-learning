package String工具类.substring;

public class SubstringTest {
    public static void main(String[] args) {
        String a = "sdjkshJiangZhiyan";
        String b = a.substring(6);
        String c = a.substring(6,11);
        System.out.println(b);//JiangZhiyan
        System.out.println(c);//Jiang
    }
}
