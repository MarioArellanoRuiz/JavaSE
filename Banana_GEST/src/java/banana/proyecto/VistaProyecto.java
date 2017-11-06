/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banana.proyecto;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mario
 */
@WebServlet(name = "vistaProyecto", urlPatterns = {"/vistaProyecto"})
public class VistaProyecto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet vistaProyecto</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet vistaProyecto at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        System.out.println("klajsdlajdklajsdlkaj");
        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sakila", "root", "root");
            System.out.println("testing");
            if (conn == null) {
                System.out.println("Fallo de conexion");
            } else {
                System.out.println("Exito!");
            }

            //Statement stmt = conn.createStatement();
            // ResultSet rs = stmt.executeQuery("SELECT * FROM customer");
            //stmt.executeUpdate("INSERT INTO customer  values (602,1,'mario','arellano', 'mario@arellano.com',1,1,'2006-02-14 22:04:36', '2006-02-14 22:04:36')");
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO customer  values (?,?,?,?,?,?,?,?,?)");

            pstm.setInt(1, 603);
            pstm.setInt(2, 1);
            pstm.setString(3, "Mario Arellano");
            pstm.setString(4, "Arellano");
            pstm.setString(5, "m@mario.com");
            pstm.setInt(6, 2);
            pstm.setInt(7, 1);
            pstm.setString(8, LocalDateTime.now().toString());
            pstm.setString(9, LocalDateTime.now().toString());

            pstm.executeUpdate();

            /*while (rs.next()) {                
                System.out.println(rs.getString("first_name"));
            }*/
            conn.close();

        } catch (ClassNotFoundException ex) {
            System.out.println("error de conexion");
            ex.getStackTrace();
        } catch (SQLException ex) {
            System.out.println("error de conexion");
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            System.out.println("error de conexion");
        } catch (IllegalAccessException ex) {
            System.out.println("error de conexion");
            ex.printStackTrace();
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
