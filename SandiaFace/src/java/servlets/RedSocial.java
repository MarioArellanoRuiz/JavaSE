/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Classes.JSONPost;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import controlador.Publicacion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Document;
import sun.awt.X11.XConstants;

/**
 *
 * @author mario
 */
@WebServlet(name = "RedSocial", urlPatterns = {"/RedSocial"})
public class RedSocial extends HttpServlet {

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
            out.println("<title>Servlet RedSocial</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RedSocial at " + request.getContextPath() + "</h1>");
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

        response.setContentType("application/json");

        try (PrintWriter out = response.getWriter()) {
            //out.println("{\"dato\":\"hola\"}");

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sandia", "root", "root");

            JsonObject myJson = JSONPost.getJsonObject(request.getReader());
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO  san_post (pst_content, pst_control)  values (?,?)");

            pstm.setString(1, myJson.get("contenido").getAsString());
            pstm.setString(2, "1");
            pstm.executeUpdate();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM san_post ORDER BY pst_id DESC LIMIT 1");

            int rsId = 0;
            String rsContent = "";
            int rsControl = 0;
            Publicacion publicacion = new Publicacion();
            while (rs.next()) {
                rsId = rs.getInt("pst_id");
                publicacion.setRsId(rs.getInt("pst_id"));
                publicacion.setRsContent(rs.getString("pst_content"));
                publicacion.setRsControl(1);

            }

            String jsonResult = "{\"id\":\"" + rsId + "\","
                    + "\"content\":\"" + rsContent + "\","
                    + "\"status\":\"" + rsControl + "\"}";

           // out.println("{\"dato\":\"hola\"}");
            Gson gson = new Gson();
            out.print(gson.toJson(publicacion));
            System.out.println(gson.toJson(publicacion));

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {

        }
        System.out.println("fin");

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
