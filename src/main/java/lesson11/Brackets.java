package lesson11;

public class Brackets {

  int count(String source) {
    int max_level = 0;
    int level = 0;
    for (int i = 0; i < source.length(); i++) {
      char c = source.charAt(i);
      switch (c) {
        case '(': level++; break;
        case ')': level--; break;
        default : throw new IllegalArgumentException("wrong char");
      }
      max_level = Math.max(max_level, level);
      if (level<0) throw new IllegalArgumentException("extra )");
    }
    if (level>0) throw new IllegalArgumentException("extra (");
    return max_level;
  }
}
