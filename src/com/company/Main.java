package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int tipoUsuari;
        String article;
        String nomUser;
        Scanner sc = new Scanner(System.in);

        Article article1 = new Article(true,false,1,"jugueta","per infants", 10, 5, 1111);
        Article article2 = new Article(true, false, 2,"boligraf","per escriure", 1.50, 10, 1212);
        Article article3 = new Article(true,false,3,"pilota","de futbol", 5,30,2121);
        Article article4 = new Article(true,false,4,"televisio","4K", 300, 3, 9090);
        UsuariAdministrador admin = new UsuariAdministrador();
        UsuariClient costumer = new UsuariClient();


        System.out.println("WARNING ACCES: Per entrar identificau-vos amb un nom:");
        nomUser = sc.nextLine();

        System.out.println("Benvingut " + nomUser + ". Indica el tipus d'usuari: " +
                "\n 1 Administrador" +
                "\n 2 Client");

        tipoUsuari = sc.nextInt();
        switch (tipoUsuari) {

            case 1:
                System.out.println("Tipus Usuari Administrador");
                admin.queVolFerLadministrador();
                System.out.println("---");
                break;
            case 2:
                System.out.println("Tipus Usuari Client");
                costumer.queVolFerElClient();
                System.out.println("---");
                break;

         /* PROBLEMES:
       1.Com inserir l'enum al producte i fer que els articles es puguin filtrar per categoria.
       2.Com fer per eliminar el registre.
       3.Pregunta sobre si necesita constructor i variables els usuaris fills, en cas de que si quins i perque.
       4. Main: que ha de incluir?
       5.REVISAR METODOLOGIA FINS ARE.
       6.Read article consulta de parametres.
    */

        }
    }
}

