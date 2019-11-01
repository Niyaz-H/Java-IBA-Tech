package lesson09;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WarmUpApp {
  public static void main(String[] args) throws IOException {
    WarmUpApp app = new WarmUpApp();
    File file1 = new File("file1.txt");
    File file2 = new File("file2.txt");
    List<String> strings = app.random_list(30);
    app.store(strings, file1);
    List<String> strings2 = app.load(file1);
    strings2.sort((o1, o2) -> o1.length() - o2.length());
    app.store(strings2, file2);
  }

  private List<String> load(File file) throws IOException {
    ArrayList<String> readed = new ArrayList<>();
    BufferedReader r = new BufferedReader(new FileReader(file));
    Stream<String> lines = r.lines();
    lines.forEach(s -> readed.add(s));
    r.close();
    return readed;
  }

  private void write_line(String origin, Writer w) {
    try {
      w.write(origin+"\n");
    } catch (IOException ignored) { }
  }

  private void store(List<String> data, File file) throws IOException {
    BufferedWriter w = new BufferedWriter(new FileWriter(file));
    data.forEach(s -> write_line(s, w));
    w.close();
  }

  private String random_string() {
    return Stream.generate(() -> String.valueOf((char)(Math.random()*('Z'-'A'+1)+'A')))
        .limit((int) (Math.random()*20+10))
        .reduce(String::concat).orElse("");
  }

  private List<String> random_list(int count) {
    return Stream.generate(() -> random_string()).limit((30)).collect(Collectors.toList());
  }
}
