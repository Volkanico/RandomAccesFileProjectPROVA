package com.company;

import java.io.IOException;

public class UsuarisGenerals {
    ArticleIO article;
    Article articleOnly;
    int id;
    protected void UsuarisGenerals() {
    }
    public void llegirArticlePunter (ArticleIO article) throws IOException {
        article.readArticle();
    }
    public void llegirNomesArticlesDisponibles (ArticleIO article) throws  IOException {
        article.displayArticlesDisponibles();
    }
    public void inserirArticle (ArticleIO article) throws IOException {
        article.add(articleOnly);
    }
    //-------------------------------------------ELIMINAR
    public void esborrarArticle (ArticleIO article) throws IOException {
        article.eliminarArticle(articleOnly);
    }
    //-------------------------------------------MODIFICAR
    public void modificacioArticlesDisponibilitat (ArticleIO article) throws IOException {
        article.disponibilitatArticle(id);
    }
    public void modificacioArticlesEliminat (ArticleIO article) throws IOException {
        article.eliminatArticle(id);
    }
    public void modificacioArticlesCategoria (ArticleIO article) throws IOException {
        article.categoriaArticle(id);
    }
    public void modificacioArticlesNom (ArticleIO article) throws IOException {
        article.nomArticle(id);
    }
    public void modificacioArticlesDescripcio (ArticleIO article) throws IOException {
        article.descripcioArticle(id);
    }
    public void modificacioArticlesPreu (ArticleIO article) throws IOException {
        article.preuArticle(id);
    }
    public void modificacioArticlesQStock (ArticleIO article) throws IOException {
        article.quantitatStockArticle(id);
    }
    public void modificacioArticlesID (ArticleIO article) throws IOException {
        article.idArticle(id);
    }


    public ArticleIO getArticle() {
        return article;
    }
}
