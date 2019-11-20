package lesson03.jmm;

public class TaskApp {
  public static void main(String[] args) {
//    Task.subtask3();

    Task task = new Task();
    int result1 = task.subtask1();
    String result2 = task.subtask2();

    BigTask bigTask = new BigTask();
    bigTask.method(task);
  }
}
