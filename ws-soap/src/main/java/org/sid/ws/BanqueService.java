package org.sid.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

//POJO : Plain Old Java Object   :  est un simple class java

@WebService(serviceName = "BanqueWS")
public class BanqueService {

    @WebMethod(operationName = "Convert")
    public double convert(@WebParam(name = "montant") double mt) {
        return mt*10.54;
    }

    @WebMethod()
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte(code ,100*Math.random()+1000,new Date());
    }

    @WebMethod()
    public List<Compte> listComptes() {
        return List.of(
                new Compte(1 ,100*Math.random()+1000,new Date()),
                new Compte(2 ,100*Math.random()+1000,new Date()),
                new Compte(3 ,100*Math.random()+1000,new Date())
        );
    }
}
