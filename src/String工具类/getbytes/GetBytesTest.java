package String工具类.getbytes;

public class GetBytesTest {
    public static void main(String[] args) {
        String m = "abcd";
        byte[] mm = m.getBytes();
        for(int i = 0;i<mm.length;i++){
            System.out.println(mm[i]);//97 98 99 100
        }
    }
}
