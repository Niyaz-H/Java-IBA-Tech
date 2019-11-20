package lesson16.warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static lesson16.warmup.Common.list;
import static lesson16.warmup.Common.combine;

public class Task1 {

  private List<String> solution1(List<String> subjects, List<String> verbs,List<String> objects) {
    ArrayList<String> outcome = new ArrayList<>();
    for (int i = 0; i < subjects.size(); i++) {
      for (int j = 0; j < verbs.size(); j++) {
        for (int k = 0; k < objects.size(); k++) {
          outcome.add(combine(subjects.get(i), verbs.get(j), objects.get(k)));
        }
      }
    }
    return outcome;
  }

  private List<String> solution2(List<String> subjects, List<String> verbs,List<String> objects) {
    ArrayList<String> outcome = new ArrayList<>();
    for (String subj: subjects)
      for (String verb: verbs)
        for (String obj: objects)
          outcome.add(combine(subj, verb, obj));
    return outcome;
  }

  private List<String> solution3(List<String> subjects, List<String> verbs,List<String> objects) {
    ArrayList<String> outcome = new ArrayList<>();
    subjects.forEach(subj ->
        verbs.forEach(verb ->
            objects.forEach(obj ->
                outcome.add(combine(subj, verb, obj))
            )));
    return outcome;
  }

  private List<String> solution4(List<String> subjects,
                                 List<String> verbs,
                                 List<String> objects) {

    return subjects.stream().flatMap(subj ->
        verbs.stream().flatMap(verb ->
            objects.stream().map(obj ->
                combine(subj, verb, obj)
    )))

        .collect(Collectors.toList());
  }

  public static void main(String[] args) {
    List<String> subjects = list("Noel", "The cat", "The dog");
    List<String> verbs =    list("wrote", "chased", "slept on");
    List<String> objects =  list("the book","the ball","the bed");
    Task1 app = new Task1();

    app.solution4(subjects, verbs, objects).forEach(System.out::println);
  }
}
