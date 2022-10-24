package org.sid;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {

        BanqueService stud=new BanqueWS().getBanqueServicePort();

        System.out.println(stud.convert(1000));

        System.out.println("***********************************************");


        affiche(stud.getCompte(1));

        System.out.println("***********************************************");
        for(Compte c :stud.listComptes()){
            affiche(c);
        }

    }

    public static void affiche(Compte compte) {
        System.out.println("compte ||>> code = "+compte.getCode() + "  -   solde =" + compte.getSolde());
    }
}