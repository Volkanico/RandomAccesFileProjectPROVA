package com.company;

import java.io.IOException;
import java.util.Scanner;

public class UsuariAdministrador extends UsuarisGenerals {
    ArticleIO article;
    Article articleOnly;
    int id;
    int menu;
    int whatChange;
    Scanner sc = new Scanner(System.in);

    public UsuariAdministrador() {
        super.UsuarisGenerals();
    }

    //------------------------------------------LLEGIR
    public void llegirArticlePunter(ArticleIO article) throws IOException {
        article.readArticle();
    }

    public void llegirNomesArticlesDisponibles(ArticleIO article) throws IOException {
        article.displayArticlesDisponibles();
    }

    //-------------------------------------------INSERIR
    public void inserirArticle(ArticleIO article) throws IOException {
        article.add(articleOnly);
    }

    //-------------------------------------------ELIMINAR
    public void esborrarArticle(ArticleIO article) throws IOException {
        article.eliminarArticle(articleOnly);
    }

    //-------------------------------------------MODIFICAR
    public void modificacioArticlesDisponibilitat(ArticleIO article) throws IOException {
        article.disponibilitatArticle(id);
    }

    public void modificacioArticlesEliminat(ArticleIO article) throws IOException {
        article.eliminatArticle(id);
    }

    public void modificacioArticlesCategoria(ArticleIO article) throws IOException {
        article.categoriaArticle(id);
    }

    public void modificacioArticlesNom(ArticleIO article) throws IOException {
        article.nomArticle(id);
    }

    public void modificacioArticlesDescripcio(ArticleIO article) throws IOException {
        article.descripcioArticle(id);
    }

    public void modificacioArticlesPreu(ArticleIO article) throws IOException {
        article.preuArticle(id);
    }

    public void modificacioArticlesQStock(ArticleIO article) throws IOException {
        article.quantitatStockArticle(id);
    }

    public void modificacioArticlesID(ArticleIO article) throws IOException {
        article.idArticle(id);
    }

    public void queVolFerLadministrador() throws IOException {
        System.out.println("Que desitja realitzar? " +
                "\n 1 Llegir l'article seleccionat" +
                "\n 2 Llegir tots els articles disponibles y filtrar" +
                "\n 3 Inserir article" +
                "\n 4 Esborrar article" +
                "\n 5 Modificar tot o parcialment l'article");
        System.out.println("---");

        menu = sc.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Llegir l'article seleccionat");
                llegirArticlePunter(article);
                System.out.println("---");
                break;
            case 2:
                System.out.println("Llegir tots els articles disponibles");
                menuLlegirTotyFiltraradmin();
                System.out.println("---");
                break;
            case 3:
                System.out.println("Inserir article");
                inserirArticle(article);
                System.out.println("---");
                break;
            case 4:
                System.out.println("Esborrar article");
                esborrarArticle(article);
                System.out.println("---");
                break;
            case 5:
                System.out.println("Modificar tot o parcialment l'article");
                quinsCanvisVolRealitzar();
                System.out.println("---");
                break;
            case 6:
                System.out.println("Tornar enrere");
                queVolFerLadministrador();
                System.out.println("---");
                break;
        }


    }

    //----------------------------------REALITZAR MODIFICACIONS
    public void quinsCanvisVolRealitzar() throws IOException {
        System.out.println("Quines modificacions desitja realitzar? " +
                "\n 1 Canviar disponibilitat" +
                "\n 2 Canviar l'estat d'eliminat o no eliminat" +
                "\n 3 Canviar el nom" +
                "\n 4 Canviar la descripcio" +
                "\n 5 Canviar el preu" +
                "\n 6 Canviar la quantitat que hi ha en stock" +
                "\n 7 Canviar la ID" +
                "\n 8 Canviar-ho tot");
        System.out.println("---");

        whatChange = sc.nextInt();
        switch (whatChange) {
            case 1:
                System.out.println("Canviar disponibilitat");
                modificacioArticlesDisponibilitat(article);
                System.out.println("---");
                break;
            case 2:
                System.out.println("Canviar l'estat d'eliminat o no eliminat");
                modificacioArticlesEliminat(article);
                System.out.println("---");
                break;
            case 3:
                System.out.println("Canviar la categoria");
                modificacioArticlesCategoria(article);
                System.out.println("---");
                break;
            case 4:
                System.out.println("Canviar el nom");
                modificacioArticlesNom(article);
                System.out.println("---");
                break;
            case 5:
                System.out.println("Canviar la descripcio");
                modificacioArticlesDescripcio(article);
                System.out.println("---");
                break;
            case 6:
                System.out.println("Canviar el preu");
                modificacioArticlesPreu(article);
                System.out.println("---");
                break;
            case 7:
                System.out.println("Canviar la quantitat en stock");
                modificacioArticlesQStock(article);
                System.out.println("---");
                break;
            case 8:
                System.out.println("Canviar la ID");
                modificacioArticlesID(article);
                System.out.println("---");
                break;
            case 9:
                System.out.println("Canviar-ho tot");
                modificacioArticlesDisponibilitat(article);
                modificacioArticlesEliminat(article);
                modificacioArticlesCategoria(article);
                modificacioArticlesNom(article);
                modificacioArticlesDescripcio(article);
                modificacioArticlesPreu(article);
                modificacioArticlesQStock(article);
                modificacioArticlesID(article);
                System.out.println("---");
                break;
            case 10:
                System.out.println("Tornar enrere");
                queVolFerLadministrador();
                System.out.println("---");
        }

    }
    public void menuLlegirTotyFiltraradmin () throws IOException {
        System.out.println("Vol llegir-los tots o filtrar-los per categoria?" +
                "\n 1 Llegir tots" +
                "\n 2 Filtrar" +
                "\n 3 Tornar enrere");
        menu = sc.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Llegir tots articles disponibles");
                llegirNomesArticlesDisponibles(article);
                System.out.println("---");
                break;
            case 2:
                System.out.println("Filtrar els articles per categoria");
                menuCategoriesadmin();
                System.out.println("---");
            case 3:
                System.out.println("Tornar enrere");
                queVolFerLadministrador();
                System.out.println("---");
        }
    }

    public void menuCategoriesadmin () throws IOException {
        System.out.println("Selecciona la categoria que vol cercar:" +
                "\n 1 Categoria Juguetes" +
                "\n 2 Categoria Ofimatica" +
                "\n 3 Categoria" +
                "\n 4 Categoria" +
                "\n 5 Tornar enrere");

        menu = sc.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Llegir nomes articles disponibles");
                llegirNomesArticlesDisponibles(article);
                System.out.println("---");
                break;
            case 2:
                System.out.println("Filtrar els articles per categoria");

                System.out.println("---");
            case 3:
                System.out.println("Filtrar els articles per categoria");

                System.out.println("---");
            case 4:
                System.out.println("Filtrar els articles per categoria");

                System.out.println("---");
            case 5:
                System.out.println("Tornar enrere");
                queVolFerLadministrador();
                System.out.println("---");
        }

    }





    //---------------------------------------------------------------------------------------
    @Override
    public ArticleIO getArticle() {
        return article;
    }
}
