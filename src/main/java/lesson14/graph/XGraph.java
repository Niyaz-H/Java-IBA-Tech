package lesson14.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class XGraph {
  private int edge_count;
  private LinkedList<Integer>[] edges;

  public XGraph(int edge_count) {
    this.edge_count = edge_count;
    this.edges = new LinkedList[edge_count];
    for (int i = 0; i < edge_count; i++) {
      edges[i] = new LinkedList<>();
    }
  }

  public void add(int from, int to) {
    edges[from].add(to);
  }

  public void remove(int from, int to) {
    edges[from].remove(Integer.valueOf(to));
  }

  private static String list_to_string(List<Integer> vertices) {
    StringJoiner sj = new StringJoiner(", ", "<", ">");
    vertices.forEach(n -> sj.add(String.valueOf(n)));
    return sj.toString();
  }

  public void printAllUnordered() {
    System.out.printf(
        "Unordered traversal    : %s\n",
        list_to_string(unordered())
    );
  }

  public void printAllBFS() {
    System.out.printf(
        "BFS traversal          : %s\n",
        list_to_string(bfs())
    );
  }

  public void printAllDFSrec() {
    System.out.printf(
        "DFS traversal (rec)    : %s\n",
        list_to_string(dfs_recursive(0))
    );
  }

  public void printAllDFSnr() {
    System.out.printf(
        "DFS traversal (non-rec): %s\n",
        list_to_string(dfs(0))
    );
  }

  public List<Integer> unordered() {
    LinkedList<Integer> result = new LinkedList<>();
    for (int i = 0; i < edge_count ; i++) {
      if (!edges[i].isEmpty()) {
        result.add(i);                          // we need vertice number instead of it index
        edges[i].forEach(to -> result.add(to)); // we need vertice number instead of it index
      }
    }
    return result.stream().distinct().sorted().collect(Collectors.toList());
  }

  // BFS from the root
  public List<Integer> bfs() {
    return bfs(0);
  }

  // BFS from the specified vertice
  public List<Integer> bfs(int source) {
    final List<Integer> result = new LinkedList<>();
    final boolean[] visited = new boolean[edge_count]; // false by default, thankful to Java
    final LinkedList<Integer> process = new LinkedList<>();
    visited[source] = true;
    process.add(source); // add to END
    while (!process.isEmpty()) {
      int current = process.poll(); // pull from START, or pop
      // we need vertice number instead of it index
      result.add(current);
      for (int dst: edges[current]) {
        if (!visited[dst]) {
          visited[dst] = true;
          process.add(dst);
        }
      }
    }
    return result;
  }

  public List<Integer> dfs_recursive(int source) {
    DFSRecursive d = new DFSRecursive();
    d.dfs(0);
    return d.path;
  }

  public List<Integer> dfs(int source) {
    // real path
    final List<Integer> path_ = new LinkedList<>();
    // track the process
    LinkedList<Integer> process = new LinkedList<>();
    // start vertice
    process.add(source);
    // main loop
    while (!process.isEmpty()) {
      int current = process.poll(); // head
      path_.add(current);
      edges[current].descendingIterator().forEachRemaining(process::addFirst); // add to head
    }
    return path_;
  }

  // nested class with real recursive solution
  class DFSRecursive {
    private final List<Integer> path = new LinkedList<>();

    public void dfs(int source) {
      path.add(source);
      edges[source].forEach(v -> dfs(v));
    }
  }
}
