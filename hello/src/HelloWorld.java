import java.util.ArrayList;
import java.util.List;

/**
 * @author lingtong
 * @create 2020-01-02 17:09
 */
public class HelloWorld {
    public static void main(String[] args) {
        String str = "zhangsan";

        List<String> list = new ArrayList<>();
        list.add(str);
        for (String s : list) {
            System.out.println("s = " + s);
        }
    }
}
