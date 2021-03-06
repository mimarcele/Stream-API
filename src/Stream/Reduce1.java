package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList (1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (acum, n) -> acum + n;

        Integer total=  nums.stream ().filter (n -> n > 4).reduce (soma).get ();
        System.out.println (total );
    }
}
