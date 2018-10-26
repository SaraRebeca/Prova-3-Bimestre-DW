/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import DAOs.DAOTipoTratamento;
import Entidades.TipoTratamento;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sara Rebeca
 */
@WebServlet(name = "TipoTratamentoServlet", urlPatterns = {"/tipoTratamento"})
public class TipoTratamentoServlet extends HttpServlet {

    Locale ptBr = new Locale("pt", "BR");

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
        int idTipoTratamento = 0;
        String nomeTipoTratamentocol = "";

        try (PrintWriter out = response.getWriter()) {
            idTipoTratamento = Integer.parseInt(request.getParameter("idTipoTratamento"));
            nomeTipoTratamentocol = request.getParameter("nomeTipoTratamentocol");
            TipoTratamento tipoTratamento = new TipoTratamento();
            tipoTratamento.setIdTipoTratamento(idTipoTratamento);
            tipoTratamento.setNomeTipoTratamentocol(nomeTipoTratamentocol);
            DAOTipoTratamento daoTipoTratamento = new DAOTipoTratamento();
            daoTipoTratamento.inserir(tipoTratamento);

            String resultado = "";
            resultado = listaTipoTratamentoCadastrados();
            request.getSession().setAttribute("resultado", resultado);
            response.sendRedirect(request.getContextPath() + "/paginas/TipoTratamento.jsp");
        }
    }

    protected String listaProdutoNome(String nomeTipoTratamentocol) {
        DAOTipoTratamento daoTipoTratamento = new DAOTipoTratamento();
        String tabela = "";
        List<TipoTratamento> lista = daoTipoTratamento.listByNome(nomeTipoTratamentocol);
        for (TipoTratamento l : lista) {
            tabela += "<tr>"
                    + "<td>" + l.getIdTipoTratamento() + "</td>"
                    + "<td>" + l.getNomeTipoTratamentocol() + "</td>"
                    + "</tr>";
        }

        return tabela;
    }

    protected String listaTipoTratamentoCadastrados() {
        DAOTipoTratamento daoTipoTratamento = new DAOTipoTratamento();
        String tabela = "";
        List<TipoTratamento> lista = daoTipoTratamento.listInOrderNome();
        for (TipoTratamento l : lista) {
            tabela += "<tr>"
                    + "<td>" + l.getIdTipoTratamento() + "</td>"
                    + "<td>" + l.getNomeTipoTratamentocol() + "</td>"
                    + "</tr>";
        }

        return tabela;
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
        System.out.println("teste doget");
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
        processRequest(request, response);
        System.out.println("teste dopost");
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
