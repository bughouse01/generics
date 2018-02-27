import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class GenericRevision {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,2,3);
        int s = 0;
        for (int n : ints) {
            s += n;
        }
        assert s == 6;

        List<String> strings = Arrays.asList("Hello","World");
        List<String> string2 = new ArrayList<>();

        string2.add("Hello");
        string2.add("World");

        String wholeString = "";

        for (String str : strings) {
            wholeString += str;
        }
        assert "HelloWorld".equals(wholeString);

        wholeString = "";

        for (String str : string2) {
            wholeString += str;
        }

        assert "HelloWorld".equals(wholeString);
    }
}
