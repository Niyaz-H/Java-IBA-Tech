package lesson17;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class WebApp17 {
  public static void main(String[] args) throws Exception {
    Server server = new Server(8082);
    ServletContextHandler handler = new ServletContextHandler();

    handler.addServlet(ServletFile.class, "/file/*");

    server.setHandler(handler);
    server.start();
    server.join();
  }
}
