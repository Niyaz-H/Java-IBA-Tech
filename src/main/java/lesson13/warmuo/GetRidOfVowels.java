package lesson13.warmuo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetRidOfVowels {
  String filter(String origin) {
    List<Character> vowels = Arrays.asList('A', 'E', 'I', 'O', 'U');
//    Stream<String> stream = Arrays.stream(origin.split(""));
    return origin.chars().mapToObj(c -> (char)c)
        .filter(c -> !vowels.contains(Character.toUpperCase(c)))
        .map(String::valueOf)
        .collect(Collectors.joining());
  }
}
