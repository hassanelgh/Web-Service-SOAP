package org.sid.ws;

import java.util.Date;
import java.util.List;

//POJO : Plain Old Java Object   :  est un simple class java

public class BanqueService {

    public double convert(double mt) {
        return mt*10.54;
    }

    public Compte getCompte(int code) {
        return new Compte(code ,100*Math.random()+1000,new Date());
    }


    public List<Compte> listComptes() {
        return List.of(
                new Compte(1 ,100*Math.random()+1000,new Date()),
                new Compte(2 ,100*Math.random()+1000,new Date()),
                new Compte(3 ,100*Math.random()+1000,new Date())
        );
    }
}
