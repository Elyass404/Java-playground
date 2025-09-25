import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<StringBuilder> list = Stream.of("a", "b", "c")
                                         .map(StringBuilder::new)
                                         .collect(Collectors.toList());

        list.add(new StringBuilder("d"));
        list.get(0).append("X");
        System.out.println(list);
    }
}
