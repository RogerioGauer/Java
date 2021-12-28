/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FileController extends HttpServlet 
{
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void gravarDados (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try
        {      
                 if (request.getParameter("sub") != null) 
                 {
                      //pegar o nome, email e texto
                      String nom = request.getParameter("nom");
                      String ema = request.getParameter("ema");
                      String txt = request.getParameter("txt");

                      String linha = nom + " # " + ema + " # " + txt;

                      String dir = request.getRealPath("/");//Referencia da pasta raiz.
                      String arq = dir + "/txt/dados.txt";
                      FileWriter fw = new FileWriter(arq, true);
                      BufferedWriter bw = new BufferedWriter(fw);
                      PrintWriter pw = new PrintWriter(bw);
                      pw.println(linha); //o metodo println ja coloca "\n" no final.
                      pw.close();
                      bw.close();
                      fw.close();
                }            
        }
        
        finally
        {
            out.close();
        }       
        
        //direcionar para a pagina de visualizaçao.
        response.sendRedirect("jsp/livro_view.jsp");
    }
    
    protected void fazNada (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try
        {
             out.println("metodo sem retorno ainda...");            
        }
        
        finally
        {
             out.close();
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
        fazNada(request, response);
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
        gravarDados(request, response);
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
