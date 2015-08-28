<%@taglib   prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="br.pucpr.prog4.lojaprodutosOld.models.Produto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0//EN" "http://www.w3.org/TR/REC-html40/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>LISTA DE PRODUTOS </h1>
        
        
        <c:forEach var="produto"
                   items="${produtos}">
            
               <div>
            <p>${produto.nome}
            <a href="detalhe?id=${produto.id}">
                <img src="../Imagens/Imagem0${produto.id}.jpg"
                     alt="produto ${produto.id}" />
            </a>
            <p>R$ ${produto.preço}</p>
        </div>
        </c:forEach>

    </body>
</html>
