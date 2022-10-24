
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://ws.sid.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod(operationName = "Convert")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Convert", targetNamespace = "http://ws.sid.org/", className = "proxy.Convert")
    @ResponseWrapper(localName = "ConvertResponse", targetNamespace = "http://ws.sid.org/", className = "proxy.ConvertResponse")
    @Action(input = "http://ws.sid.org/BanqueService/ConvertRequest", output = "http://ws.sid.org/BanqueService/ConvertResponse")
    public double convert(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listComptes", targetNamespace = "http://ws.sid.org/", className = "proxy.ListComptes")
    @ResponseWrapper(localName = "listComptesResponse", targetNamespace = "http://ws.sid.org/", className = "proxy.ListComptesResponse")
    @Action(input = "http://ws.sid.org/BanqueService/listComptesRequest", output = "http://ws.sid.org/BanqueService/listComptesResponse")
    public List<Compte> listComptes();

    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://ws.sid.org/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://ws.sid.org/", className = "proxy.GetCompteResponse")
    @Action(input = "http://ws.sid.org/BanqueService/getCompteRequest", output = "http://ws.sid.org/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

}
