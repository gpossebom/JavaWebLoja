/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.lojaprodutosOld.controllers;

import br.pucpr.prog4.lojaprodutosOld.models.Cliente;
import com.sun.istack.internal.logging.Logger;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guilherme.possebom
 */
@WebServlet(name = "ClienteServlet", urlPatterns = {"/Cliente/Cadastro"})
public class ClienteServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/jsp/ClienteForm.jsp");
        
        rd.forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            Cliente cliente = new Cliente();
            
            cliente.setTipo(request.getParameter("Cliente"));
            cliente.setNome(request.getParameter("Nome"));
            String CPFaux;
            CPFaux = request.getParameter("Id");
            int CPF = Integer.parseInt(CPFaux);
            cliente.setCPF(CPF);
            cliente.setSexo(request.getParameter("Sexo"));
            cliente.setComentario(request.getParameter("Comentario"));
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try{
                Date dataNasc;
                dataNasc = sdf.parse(request.getParameter("Data"));
                cliente.setDataNasc(dataNasc);
            }
            catch(){
            
            }
            
            
    }
}
