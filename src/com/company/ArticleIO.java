package com.company;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ArticleIO {
    private static final int articleSize = 1 + 1 + ((Article.getMaxStringNom()) * 2) +
            ((Article.getMaxStringDesc()) * 2) + 4 + 4 + 4; //94 Bytes

    private RandomAccessFile raf;
    private long articlesCount;
    int id;
    private Scanner sc;
    int index;

    public ArticleIO () throws IOException {
        raf = new RandomAccessFile("Articles.txt", "rw");
    }
    //------------------------------------------INSERT-------------------------------------------------------------//
    //INSERIR ARTICLE
    public void add(Article article) throws IOException {
        for(int i = 0; i < articlesCount; i++) {
            if(!article.isEliminat()) {
                escriureInsercio();
            }else{
                i++;
            }
        }
    }
    public void escriureInsercio() throws IOException {
        Article article = new Article();
        raf.seek(raf.length());
        raf.writeBoolean(article.isDisponible());
        raf.writeBoolean(article.isEliminat());
        raf.writeInt(article.getCategoria());
        raf.writeUTF(article.getAdjustedNom());
        raf.writeUTF(article.getAdjustedDescripcio());
        raf.writeDouble(article.getPreu());
        raf.writeInt(article.getQuantitatStock());
        raf.writeInt(article.getId());
    }
//----------------------------------------------REMOVE------------------------------------------------------------------

    public boolean eliminarArticle(Article article) throws IOException {
        if(!article.isEliminat()){
            return true;
        }
        return false;
    }

    public Article getArticle(int id) throws IOException {
        index = getArticleIndex(id);
        raf.seek(index * articleSize);
        return readArticle();
    }
    //-------------------------------------------MODIFY---------------------------------------------------------------//
    //CANVIAR DISPONIBILITAT DE L'ARTICLE
    public void disponibilitatArticle(int id) throws IOException {
        index = getArticleIndex(id);
        raf.seek((long) index * articleSize);
        raf.writeBoolean(false);
    }
    //CANVIAR ELIMINAT DE L'ARTICLE
    public void eliminatArticle (int id) throws  IOException {
        index = getArticleIndex(id);
        raf.seek((long) index * articleSize);
        raf.writeBoolean(false);
    }
    //CANVIAR CATEGORIA DE L'ARTICLE
    public void categoriaArticle(int id) throws IOException {
        index = getArticleIndex(id);
        raf.seek((long) index * articleSize);
        raf.writeInt(sc.nextInt());
    }
    //CANVIAR NOM DE L'ARTICLE
    public void nomArticle(int id) throws IOException {
        index = getArticleIndex(id);
        raf.seek((long) index * articleSize);
        raf.writeUTF(sc.nextLine());
    }
    //CANVIAR DESCRIPCIO DE L'ARTICLE
    public void descripcioArticle(int id) throws IOException {
        index = getArticleIndex(id);
        raf.seek((long) index * articleSize);
        raf.writeUTF(sc.nextLine());
    }
    //CANVIAR PREU DE L'ARTICLE
    public void preuArticle(int id) throws IOException {
        index = getArticleIndex(id);
        raf.seek((long) index * articleSize);
        raf.writeDouble(sc.nextFloat());
    }
    //CANVIAR QUANTITATSTOCK DE L'ARTICLE
    public void quantitatStockArticle(int id) throws IOException {
        index = getArticleIndex(id);
        raf.seek((long) index * articleSize);
        raf.writeInt(sc.nextInt());
    }
    //CANVIAR ID DE L'ARTICLE
    public void idArticle(int id) throws IOException {
        index = getArticleIndex(id);
        raf.seek((long) index * articleSize);
        raf.writeInt(sc.nextInt());
    }
    //----------------------------------------------------------------------------------------------------------------//
    //INDEX D'ARTICLES
    public int getArticleIndex(int id) throws IOException {
        for (int i = 0; i < getArticlesCount(); i++) {
            raf.seek((long) i * articleSize + 1);
            if (id == raf.readInt()) {
                return i;
            }
        }
        return -1;
    }

    //------------------------------------------READ------------------------------------------------------------------//
    //LLEGIR NOMES L'ARTICLE DEL PUNTER
    public Article readArticle() throws IOException {
        Article article = new Article();
        if (raf.getFilePointer() % articleSize == 0) {
            article.setDisponible(raf.readBoolean());
            article.setEliminat(raf.readBoolean());
            article.setCategoria(raf.readInt());
            article.setNom(raf.readLine());
            article.setDescripcio(raf.readLine());
            article.setPreu(raf.readDouble());
            article.setQuantitatStock(raf.readInt());
            article.setId(raf.readInt());
        }
        return article;
    }
    //MOSTRAR ARTICLES DISPONIBLES
    public void displayArticlesDisponibles() throws IOException {
        Article article;
        for (int i = 0; i < getArticlesCount(); i++) {
            raf.seek((long) i * articleSize);
            article = readArticle();
            if (article.isDisponible()) {
                System.out.println(article);
            }
        }
    }


    //SET & GET ARTICLESCOUNT
    public int getArticlesCount() throws IOException {
        return (int) raf.length() / articleSize;
    }
    public void setArticlesCount(long articlesCount) {
        this.articlesCount = articlesCount;
    }
}
