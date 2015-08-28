
package br.pucpr.prog4.lojaprodutosOld.controllers;

import br.pucpr.prog4.lojaprodutosOld.models.Produto;
import br.pucpr.prog4.lojaprodutosOld.models.ProdutoManager;
import br.pucpr.prog4.lojaprodutosOld.models.iProdutoManager;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class listaProdutosServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            iProdutoManager manager;
            manager = new ProdutoManager();
            List<Produto> produtos;
            produtos = manager.obterProdutos();
            
            request.setAttribute("produtos", produtos);
            RequestDispatcher rd;
            rd = request.getRequestDispatcher("/WEB-INF/jsp/listaProdutos.jsp");
            rd.forward(request, response);
            
    }
}
