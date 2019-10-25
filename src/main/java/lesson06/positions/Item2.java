package lesson06.positions;

import java.util.ArrayList;
import java.util.List;

public class Item2 {
  int count = 0;
  final List<Integer> positions = new ArrayList<>();

  void inc(int pos) {
    this.count++;
    this.positions.add(pos);
  }

}
