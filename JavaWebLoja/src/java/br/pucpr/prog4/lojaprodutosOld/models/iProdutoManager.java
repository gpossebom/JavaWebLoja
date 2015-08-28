/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.lojaprodutosOld.models;

import java.util.List;


public interface iProdutoManager {
    List<Produto> obterProdutos();
    Produto obterPorId(int id);
}
