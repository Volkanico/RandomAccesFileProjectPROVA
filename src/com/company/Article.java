package com.company;

public class Article {
    private boolean disponible;//1 byte
    private boolean eliminat;//1 byte
    private int categoria;//4 Bytes
    private String nom; //MAX_STRING *2 = 40 bytes
    private String descripcio; //MAX_STRING *2 = 40 bytes
    private double preu; //4 bytes
    private int quantitatStock; //4 bytes
    private int id; //4 bytes


    private static final int MAX_STRING_NOM = 20; // màxima longitud d'un String nom
    private static final int MAX_STRING_DESC = 20; // màxima longitud d'un String descripcio


    public Article(boolean disponible, boolean eliminat,int categoria, String nom, String descripcio, double preu, int quantitatStock, int id) {
        this.disponible = disponible;
        this.eliminat = eliminat;
        this.categoria = categoria;
        this.nom = nom;
        this.descripcio = descripcio;
        this.preu = preu;
        this.quantitatStock = quantitatStock;
        this.id = id;
    }

    public Article() {}

    //AJUSTAR NOM
    public String getAdjustedNom() {
        String adjustedNom = this.nom;
        if (adjustedNom.length() > MAX_STRING_NOM) {
            adjustedNom = adjustedNom.substring(0, MAX_STRING_NOM);
            return adjustedNom;
        }
        for (int i = this.nom.length(); i < MAX_STRING_NOM; i++) {
            adjustedNom += " ";
        }
        return adjustedNom;
    }
    public static int getMaxStringNom() {
        return MAX_STRING_NOM;
    }
    //AJUSTAR DESCRIPCIO
    public String getAdjustedDescripcio() {
        String adjustedDescripcio = this.descripcio;
        if (adjustedDescripcio.length() > MAX_STRING_DESC) {
            adjustedDescripcio = adjustedDescripcio.substring(0, MAX_STRING_DESC);
            return adjustedDescripcio;
        }
        for (int i = this.descripcio.length(); i < MAX_STRING_DESC; i++) {
            adjustedDescripcio += " ";
        }
        return adjustedDescripcio;
    }
    public static int getMaxStringDesc() {
        return MAX_STRING_DESC;
    }

    //IS & SET DISPONIBLE
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    //IS & SET ELIMINAT
    public boolean isEliminat() {
        return eliminat;
    }
    public void setEliminat(boolean eliminat) {
        this.eliminat = eliminat;
    }
    //SET & GET CATEGORIA
    public int getCategoria() {
        return categoria;
    }
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    //SET & GET NOM
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    //SET & GET DESCRIPCIO
    public String getDescripcio() {
        return descripcio;
    }
    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }
    //SET & GET PREU
    public double getPreu() {
        return preu;
    }
    public void setPreu(double preu) {
        this.preu = preu;
    }
    //SET & GET QUANTITATSTOCK
    public int getQuantitatStock() {
        return quantitatStock;
    }
    public void setQuantitatStock(int quantitatStock) {
        this.quantitatStock = quantitatStock;
    }
    //SET & GET ID
    public int getId() { return id; }
    public void setId(int id) { this.id = id;
    }


    @Override
    public String toString() {
        return "Article.-" + "Nom: " + getAdjustedNom() + ", Descripcio: " + getAdjustedDescripcio() +
                ", Preu: " + preu + ", Quantitat en Stock: " + quantitatStock + ". Esta disponible: "+ disponible + '}';
    }
}
