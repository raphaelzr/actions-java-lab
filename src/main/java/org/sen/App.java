package org.sen;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class App {

    private static final Logger logger = Logger.getLogger(ExemploLog.class.getName());

    public static void main(String[] args) {

        // Configurando o console handler
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);

        // Adicionando o console handler ao logger
        logger.addHandler(consoleHandler);

        // Definindo o nível de log para o logger
        logger.setLevel(Level.ALL);

        // Exemplos de mensagens de log
        logger.info("Isso é uma mensagem de log de severidade 'info'");

        Thread.sleep(1 * 60 * 1000);
        
        // Create a Jetty server that listens on port 10010
        // Server server = new Server(10010);

        // Create a servlet context
        // ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        // context.setContextPath("/");

        // Add a servlet that handles incoming requests
        // context.addServlet(new ServletHolder(new MyServlet()), "/*");

        // server.setHandler(context);

        // try {
        //     // Start the server and wait for 5 minutes
        //     server.start();
        //     server.join();
        //     //Thread.sleep(1 * 60 * 1000); // Sleep for 5 minutes
        //     server.stop(); // Stop the server after 5 minutes
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        //System.out.println(“TESTE”)
    }
}
