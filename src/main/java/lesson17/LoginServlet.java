package lesson17;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LoginServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    // folder/file
    Path path = Paths.get("./content/login.html");
    ServletOutputStream os = resp.getOutputStream();
    Files.copy(path, os);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String user_name = req.getParameter("user_name");
    String user_paswd = req.getParameter("user_paswd");
    System.out.println(user_name);
    System.out.println(user_paswd);
    try (PrintWriter w = resp.getWriter()) {
      w.println("LoginServlet.POST");
      w.printf("login:%s\n",user_name);
      w.printf("paswd:%s\n",user_paswd);
    };
  }
}
