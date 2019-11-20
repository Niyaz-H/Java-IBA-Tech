package lesson17;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class WebApp17 {
  public static void main(String[] args) throws Exception {
    Server server = new Server(8082);
    ServletContextHandler handler = new ServletContextHandler();
/**
 * http://localhost:8082/static/img/total.png
 * http://localhost:8082/static/index.html
 * /static/img/total.png
 */
    handler.addServlet(ServletFile.class, "/static/*");
    handler.addServlet(LoginServlet.class, "/login/*");
    String redirectTo = "/login";

    handler.addServlet(ServletRedirect.class, "/*");



    server.setHandler(handler);
    server.start();
    server.join();
  }
}
