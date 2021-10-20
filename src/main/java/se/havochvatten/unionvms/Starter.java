package se.havochvatten.unionvms;

import se.havochvatten.unionvms.ais.simulator.openapi.Server;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class Starter extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        Server server = new Server();
        System.out.println("Starting server..");
        new Thread(server).start();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
