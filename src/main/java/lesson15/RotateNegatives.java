package lesson15;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RotateNegatives {

  public int[] rotate(int[] origin) {
    int[] data = origin.clone();

    List<Integer> neg_normal = IntStream.range(0, origin.length)
        .filter(idx -> data[idx] < 0)
        .boxed()
        .collect(Collectors.toList());

    LinkedList<Integer> neg_shifted = new LinkedList<>(neg_normal);
    neg_shifted.addLast(neg_shifted.pollFirst());

    IntStream.range(0, neg_normal.size())
        .forEach(idx ->
            data[neg_shifted.get(idx)] = origin[neg_normal.get(idx)]);
    return data;
  }
}
