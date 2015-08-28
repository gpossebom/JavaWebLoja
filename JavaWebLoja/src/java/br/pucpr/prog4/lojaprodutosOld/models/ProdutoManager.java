
package br.pucpr.prog4.lojaprodutosOld.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



public class ProdutoManager implements iProdutoManager{

    private static List<Produto> produtos;
    
    
    static
    {
            produtos = new ArrayList<>();
            Produto p1 = new Produto();
            p1.setId(1);
            p1.setNome("Processador");
            p1.setPreço(new BigDecimal(550.0f));
            
            produtos.add(p1);
            
            Produto p2 = new Produto();
            p2.setId(2);
            p2.setNome("Celular");
            p2.setPreço(new BigDecimal(1050.0f));

            produtos.add(p2);
            
            Produto p3 = new Produto();
            p3.setId(3);
            p3.setNome("Cartucho");
            p3.setPreço(new BigDecimal(75.0f));
            
            produtos.add(p3);            
    }
    
    @Override
    public List<Produto> obterProdutos() {
        return produtos;
        
    }


    @Override
    public Produto obterPorId(int id) {
              for (Produto produto : produtos)
        {
                if(produto.getId()== id )
                    return produto;
        }
        return null;
    }
    


    
    
    
}
