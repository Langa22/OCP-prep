package streams;

import java.util.Arrays;
import java.util.List;

public class MapDemo1 {
    public static void main(String[] args) {
        List<String>vehicle= Arrays.asList("bus","car","bicycle","airplane","train");
        vehicle.stream().map(s->s.length()).forEach(System.out::println);
    }
}
