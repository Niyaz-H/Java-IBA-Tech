package lesson17;

import lesson17.service.Auth;
import lesson17.service.AuthService;
import lesson17.servlet.LoginServlet;
import lesson17.servlet.ServletFile;
import lesson17.servlet.ServletRedirect;
import lesson17.servlet.TemplateServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

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
    Auth authService = new AuthService();
    handler.addServlet(new ServletHolder(new LoginServlet(authService)), "/login/*");

    TemplateEngine te = new TemplateEngine("./content/templates");
    handler.addServlet(new ServletHolder(new TemplateServlet(te)), "/te/*");

    handler.addServlet(new ServletHolder(new ServletRedirect("/extra2/*")), "/extra/*");
    handler.addServlet(new ServletHolder(new ServletRedirect("/login")), "/*");

    server.setHandler(handler);
    server.start();
    server.join();
  }
}
