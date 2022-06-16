package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String textValue_name = request.getParameter("Username");

    String textValue_suggestion = request.getParameter("Suggestions");

    // Print the value so you can see it in the server logs.
    System.out.println("You submitted: " + textValue_name);

    // Write the value to the response so the user can see it.
    response.getWriter().println("Your name is: " + textValue_name + "\n");
    response.getWriter().println("Your name is: " + textValue_suggestion + "\n");
    response.sendRedirect("index.html");
  }
}