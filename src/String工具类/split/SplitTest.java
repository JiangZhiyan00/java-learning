package String工具类.split;

public class SplitTest {
    public static void main(String[] args) {
        String a = "2021-03-11";
        String[] b = a.split("-");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);//2021 03 11
        }
    }
}
