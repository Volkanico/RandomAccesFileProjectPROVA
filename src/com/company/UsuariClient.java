package com.company;

import java.io.IOException;
import java.util.Scanner;

public class UsuariClient extends UsuarisGenerals {
    ArticleIO article;
    int menu;
    Scanner sc = new Scanner(System.in);
    public UsuariClient() {
        super.UsuarisGenerals();
    }

    public void llegirArticlePunter (ArticleIO article) throws IOException {
        article.readArticle();
    }
    public void llegirNomesArticlesDisponibles (ArticleIO article) throws  IOException {
        article.displayArticlesDisponibles();
    }

    public void queVolFerElClient () throws IOException {
        System.out.println("Que desitja realitzar? " +
                "\n 1 Llegir l'article seleccionat" +
                "\n 2 Llegir tots els articles disponibles y filtrar" +
                "\n 3 Tornar enrere");
        System.out.println("---");

        menu = sc.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Llegir l'article seleccionat");
                ArticleIO article = new ArticleIO();
                llegirArticlePunter(article);
                System.out.println("---");
                break;
            case 2:
                System.out.println("Llegir tots els articles disponibles o filtrar");
                menuLlegirTotyFiltrar();
                System.out.println("---");
                break;
            case 3:
                System.out.println("Tornar enrere");
                queVolFerElClient();
                System.out.println("---");
                break;
        }
    }
    public void menuLlegirTotyFiltrar () throws IOException {
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
                menuCategories();
                System.out.println("---");
            case 3:
                System.out.println("Tornar enrere");
                queVolFerElClient();
                System.out.println("---");
        }
    }

    public void menuCategories () throws IOException {
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
                queVolFerElClient();
                System.out.println("---");
        }

    }


    @Override
    public ArticleIO getArticle() {
        return article;
    }
}
