/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import DAOs.DAOCliente;
import Entidades.Cliente;
import Entidades.Cliente;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sara
 */
@WebServlet(name = "ClienteServlet", urlPatterns = {"/cliente"})
public class ClienteServlet extends HttpServlet {

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
        int idCliente = 0;
        String nomeCliente = "";
        String telefoneCliente = "";
        String cpfCliente = "";
        String emailCliente = "";
        double numeroCartaoCredito = 0;
        String caminho = "";
        
        try (PrintWriter out = response.getWriter()) {
            idCliente = Integer.parseInt(request.getParameter("idCliente"));
            nomeCliente = request.getParameter("nomeCliente");
            telefoneCliente = request.getParameter("telefoneCliente");
            cpfCliente = request.getParameter("cpfCliente");
            emailCliente = request.getParameter("emailCliente");
            numeroCartaoCredito = Double.parseDouble(request.getParameter("numeroCartaoCredito"));
            caminho = "";
            Cliente cliente = new Cliente();
            cliente.setIdCliente(idCliente);
            cliente.setNomeCliente(nomeCliente);
            cliente.setTelefoneCliente(telefoneCliente);
            cliente.setEmailCliente(emailCliente);
            cliente.setCpfCliente(cpfCliente);
            cliente.setNumeroCartaoCredito(numeroCartaoCredito);
            cliente.setCaminho(caminho);
            DAOCliente daoCliente = new DAOCliente();
            daoCliente.inserir(cliente);
            
            String tabelaCliente = "";
            tabelaCliente = listaClienteCadastrados();
            request.getSession().setAttribute("tabelaCliente", tabelaCliente);
            response.sendRedirect(request.getContextPath() + "/paginas/Cliente.jsp");
        }
    }

    protected String listaClienteNome(String nomeClientecol) {
        DAOCliente daoCliente = new DAOCliente();
        String tabelaCliente = "";
        List<Cliente> lista = daoCliente.listInOrderNome();
        for (Cliente c : lista) {
            tabelaCliente += "<tr>"
                    + "<td>" + c.getIdCliente() + "</td>"
                    + "<td>" + c.getNomeCliente() + "</td>"
                    + "<td>" + c.getTelefoneCliente() + "</td>"
                    + "<td>" + c.getCpfCliente() + "</td>"
                    + "<td>" + c.getEmailCliente() + "</td>"
                    + "<td>" + c.getNumeroCartaoCredito() + "</td>"
                    + "<td>" + c.getCaminho() + "</td>"
                    + "</tr>";
        }
        
        return tabelaCliente;
    }
    
    protected String listaClienteCadastrados() {
        DAOCliente daoCliente = new DAOCliente();
        String tabelaCliente = "";
        List<Cliente> lista = daoCliente.listInOrderNome();
        for (Cliente c : lista) {
            tabelaCliente += "<tr>"
                    + "<td>" + c.getIdCliente() + "</td>"
                    + "<td>" + c.getNomeCliente() + "</td>"
                    + "<td>" + c.getTelefoneCliente() + "</td>"
                    + "<td>" + c.getCpfCliente() + "</td>"
                    + "<td>" + c.getEmailCliente() + "</td>"
                    + "<td>" + c.getNumeroCartaoCredito() + "</td>"
                    + "<td>" + c.getCaminho() + "</td>"
                    + "</tr>";
        }
        
        return tabelaCliente;
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
