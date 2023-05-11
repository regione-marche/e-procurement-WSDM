package it.infor.JProtocolloGenServices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2022-06-15T09:13:09.187+02:00
 * Generated source version: 2.7.10
 * 
 */
@WebService(targetNamespace = "http://infor.arezzo.it/jente/jprotocollo/webservices/gen", name = "JProtocolloGenServices")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface JProtocolloGenServices {

    @WebMethod
    @Action(input = "http://infor.arezzo.it/jente/jprotocollo/webservices/gen/JProtocolloGenServices/gestioneAnagraficaRequest", output = "http://infor.arezzo.it/jente/jprotocollo/webservices/gen/JProtocolloGenServices/gestioneAnagraficaResponse")
    @WebResult(name = "gestioneAnagraficaResponse", targetNamespace = "http://infor.arezzo.it/jente/jprotocollo/webservices/gen", partName = "parameters")
    public GestioneAnagraficaResponse gestioneAnagrafica(
        @WebParam(partName = "parameters", name = "gestioneAnagrafica", targetNamespace = "http://infor.arezzo.it/jente/jprotocollo/webservices/gen")
        GestioneAnagrafica parameters
    );

    @WebMethod
    @Action(input = "http://infor.arezzo.it/jente/jprotocollo/webservices/gen/JProtocolloGenServices/gestioneTabelleRequest", output = "http://infor.arezzo.it/jente/jprotocollo/webservices/gen/JProtocolloGenServices/gestioneTabelleResponse")
    @WebResult(name = "gestioneTabelleResponse", targetNamespace = "http://infor.arezzo.it/jente/jprotocollo/webservices/gen", partName = "parameters")
    public GestioneTabelleResponse gestioneTabelle(
        @WebParam(partName = "parameters", name = "gestioneTabelle", targetNamespace = "http://infor.arezzo.it/jente/jprotocollo/webservices/gen")
        GestioneTabelle parameters
    );

    @WebMethod
    @Action(input = "http://infor.arezzo.it/jente/jprotocollo/webservices/gen/JProtocolloGenServices/allegaProtocolloFascicoloRequest", output = "http://infor.arezzo.it/jente/jprotocollo/webservices/gen/JProtocolloGenServices/allegaProtocolloFascicoloResponse")
    @WebResult(name = "allegaProtocolloFascicoloResponse", targetNamespace = "http://infor.arezzo.it/jente/jprotocollo/webservices/gen", partName = "parameters")
    public AllegaProtocolloFascicoloResponse allegaProtocolloFascicolo(
        @WebParam(partName = "parameters", name = "allegaProtocolloFascicolo", targetNamespace = "http://infor.arezzo.it/jente/jprotocollo/webservices/gen")
        AllegaProtocolloFascicolo parameters
    );

    @WebMethod
    @Action(input = "http://infor.arezzo.it/jente/jprotocollo/webservices/gen/JProtocolloGenServices/gestioneFascicoliRequest", output = "http://infor.arezzo.it/jente/jprotocollo/webservices/gen/JProtocolloGenServices/gestioneFascicoliResponse")
    @WebResult(name = "gestioneFascicoliResponse", targetNamespace = "http://infor.arezzo.it/jente/jprotocollo/webservices/gen", partName = "parameters")
    public GestioneFascicoliResponse gestioneFascicoli(
        @WebParam(partName = "parameters", name = "gestioneFascicoli", targetNamespace = "http://infor.arezzo.it/jente/jprotocollo/webservices/gen")
        GestioneFascicoli parameters
    );
}
