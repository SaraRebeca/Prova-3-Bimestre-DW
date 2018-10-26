/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import DAOs.DAOTipoTratamento;
import DAOs.DAOTratamento;
import Entidades.TipoTratamento;
import Entidades.Tratamento;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sara
 */
@WebServlet(name = "TratamentosServlet", urlPatterns = {"/tratamento"})
public class TratamentosServlet extends HttpServlet {

//   Locale ptBr = new Locale("pt", "BR");
//   NumberFormat formatoDinheiro = NumberFormat.getCurrencyInstance(ptBr);
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    DAOTipoTratamento daoTipoTratamento = new DAOTipoTratamento();
    DAOTratamento daoTratamento = new DAOTratamento();
    Tratamento tratamento = new Tratamento();
    TipoTratamento tipoTratamento = new TipoTratamento();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int idTratamento = 0;
        int idTipoTratamento = 0;
        String nomeTratamento = "";
        int tipoTratamentoIdTipoTratamento = 0;

        try (PrintWriter out = response.getWriter()) {
            idTratamento = Integer.parseInt(request.getParameter("idTratamento"));
            nomeTratamento = request.getParameter("nomeTratamento");

            tratamento.setIdTratamento(idTratamento);
            tratamento.setNomeTratamento(nomeTratamento);

            idTipoTratamento = Integer.parseInt(request.getParameter("tipo"));
            TipoTratamento tipoTratamento = daoTipoTratamento.listById(idTipoTratamento).get(0);
            tratamento.setTipoTratamentoIdTipoTratamento(tipoTratamento);

            daoTratamento.inserir(tratamento);
          /*  String tabelaTratamento = "";

            tabelaTratamento = listaTratamentosCadastrados();
            System.out.println(tabelaTratamento);
            request.getSession().setAttribute("tabelaTratamento", tabelaTratamento);*/
            response.sendRedirect(request.getContextPath() + "/paginas/Tratamentos.jsp");
        }
    }

  /*  protected String listaTratamentoNome(String nomeTratamento) {
        DAOTratamento tratamento = new DAOTratamento();
        String tabelaTratamento = "";
        List<Tratamento> lista = tratamento.listByNome(nomeTratamento);
        for (Tratamento l : lista) {
            tabelaTratamento += "<tr>"
                    + "<td>" + l.getIdTratamento() + "</td>"
                    + "<td>" + l.getNomeTratamento() + "</td>"
                    + "<td>" + l.getTipoTratamentoIdTipoTratamento().getNomeTipoTratamentocol() + "</td>"
                    + "</tr>";
        }

        return tabelaTratamento;
    }

    protected String listaTratamentosCadastrados() {
        DAOTratamento tratamento = new DAOTratamento();
        String tabelaTratamento = "";
        List<Tratamento> lista = tratamento.listInOrderNome();
        for (Tratamento l : lista) {
            tabelaTratamento += "<tr>"
                    + "<td>" + l.getIdTratamento() + "</td>"
                    + "<td>" + l.getNomeTratamento() + "</td>"
                    + "<td>" + l.getTipoTratamentoIdTipoTratamento().getNomeTipoTratamentocol() + "</td>"
                    + "</tr>";
        }

        return tabelaTratamento;
    }
*/
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
