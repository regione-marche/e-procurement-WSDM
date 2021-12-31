package it.genova.comune.protocollotest.axis.services.wsricercafascicolo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2016-11-18T15:14:35.176+01:00
 * Generated source version: 2.7.10
 * 
 */
@WebService(targetNamespace = "http://protocollotest.comune.genova.it/axis/services/WSRicercaFascicolo", name = "PROTO_WO_test_WSRicercaFascicoloPortType")
@XmlSeeAlso({ObjectFactory.class})
public interface PROTOWOTestWSRicercaFascicoloPortType {

    @WebResult(name = "ricercaReturn", targetNamespace = "")
    @Action(output = "http://protocollotest.comune.genova.it/axis/services/WSRicercaFascicolo/WSRicercaFascicolo/ricercaResponse")
    @RequestWrapper(localName = "ricerca", targetNamespace = "http://protocollotest.comune.genova.it/axis/services/WSRicercaFascicolo", className = "it.genova.comune.protocollotest.axis.services.wsricercafascicolo.Ricerca")
    @WebMethod
    @ResponseWrapper(localName = "ricercaResponse", targetNamespace = "http://protocollotest.comune.genova.it/axis/services/WSRicercaFascicolo", className = "it.genova.comune.protocollotest.axis.services.wsricercafascicolo.RicercaResponse")
    public java.lang.String ricerca(
        @WebParam(name = "codEnte", targetNamespace = "")
        java.lang.String codEnte,
        @WebParam(name = "userid", targetNamespace = "")
        java.lang.String userid,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password,
        @WebParam(name = "indirizzoIP", targetNamespace = "")
        java.lang.String indirizzoIP,
        @WebParam(name = "xml", targetNamespace = "")
        java.lang.String xml,
        @WebParam(name = "hash", targetNamespace = "")
        java.lang.String hash
    );
}