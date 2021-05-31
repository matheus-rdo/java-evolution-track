package stream.parallel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Parallel Stream allows parallel executions.
 * This is very helpful while working with huge collections
 */
public class ParallelStreamExample {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) myList.add(i);

        Stream<Integer> sequentialStream = myList.stream();
        Stream<Integer> parallelStream = myList.parallelStream();

        // Notice that parallel processing values are not in order
        Stream<Integer> highNums = parallelStream.filter(p -> p > 500);
        highNums.forEach(p -> System.out.println("High Nums parallel=" + p));

        Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 500);
        highNumsSeq.forEach(p -> System.out.println("High Nums sequential=" + p));
    }

}
