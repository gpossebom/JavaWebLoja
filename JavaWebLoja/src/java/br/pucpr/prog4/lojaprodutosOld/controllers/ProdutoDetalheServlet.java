
package br.pucpr.prog4.lojaprodutosOld.controllers;

import br.pucpr.prog4.lojaprodutosOld.models.Produto;
import br.pucpr.prog4.lojaprodutosOld.models.ProdutoManager;
import br.pucpr.prog4.lojaprodutosOld.models.iProdutoManager;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ProdutoDetalheServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

        }
    

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
                int id;
        String idParam;
        idParam = request.getParameter("id");
        id = Integer.parseInt(idParam);
        
        
        iProdutoManager manager;
        manager = new ProdutoManager();
        
        Produto produto;
        produto = manager.obterPorId(id);
        
    }


}
