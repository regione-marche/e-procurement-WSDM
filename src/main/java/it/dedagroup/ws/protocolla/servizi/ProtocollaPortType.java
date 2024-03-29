package it.dedagroup.ws.protocolla.servizi;

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
 * 2018-10-01T16:37:05.970+02:00
 * Generated source version: 2.7.10
 * 
 */
@WebService(targetNamespace = "http://servizi.protocollo.ws.dedagroup.it", name = "ProtocollaPortType")
@XmlSeeAlso({it.dedagroup.ws.protocolla.response.xsd.ObjectFactory.class, ObjectFactory.class, it.dedagroup.ws.protocolla.om.xsd.ObjectFactory.class})
public interface ProtocollaPortType {

    @WebResult(name = "return", targetNamespace = "http://servizi.protocollo.ws.dedagroup.it")
    @Action(input = "urn:process", output = "urn:processResponse")
    @RequestWrapper(localName = "process", targetNamespace = "http://servizi.protocollo.ws.dedagroup.it", className = "it.dedagroup.ws.protocolla.servizi.Process")
    @WebMethod(action = "urn:process")
    @ResponseWrapper(localName = "processResponse", targetNamespace = "http://servizi.protocollo.ws.dedagroup.it", className = "it.dedagroup.ws.protocolla.servizi.ProcessResponse")
    public it.dedagroup.ws.protocolla.response.xsd.RispostaProtocolla process(
        @WebParam(name = "id", targetNamespace = "http://servizi.protocollo.ws.dedagroup.it")
        java.lang.String id,
        @WebParam(name = "password", targetNamespace = "http://servizi.protocollo.ws.dedagroup.it")
        java.lang.String password,
        @WebParam(name = "verso", targetNamespace = "http://servizi.protocollo.ws.dedagroup.it")
        java.lang.String verso,
        @WebParam(name = "dataProtocollo", targetNamespace = "http://servizi.protocollo.ws.dedagroup.it")
        java.lang.String dataProtocollo,
        @WebParam(name = "oraProtocollo", targetNamespace = "http://servizi.protocollo.ws.dedagroup.it")
        java.lang.String oraProtocollo,
        @WebParam(name = "anagraficaMittDest", targetNamespace = "http://servizi.protocollo.ws.dedagroup.it")
        java.util.List<java.lang.String> anagraficaMittDest,
        @WebParam(name = "indirizzoMittDest", targetNamespace = "http://servizi.protocollo.ws.dedagroup.it")
        java.util.List<java.lang.String> indirizzoMittDest,
        @WebParam(name = "cfpivaMittDest", targetNamespace = "http://servizi.protocollo.ws.dedagroup.it")
        java.util.List<java.lang.String> cfpivaMittDest,
        @WebParam(name = "oggetto", targetNamespace = "http://servizi.protocollo.ws.dedagroup.it")
        java.lang.String oggetto,
        @WebParam(name = "titolario", targetNamespace = "http://servizi.protocollo.ws.dedagroup.it")
        java.util.List<java.lang.String> titolario,
        @WebParam(name = "ufficioDestProv", targetNamespace = "http://servizi.protocollo.ws.dedagroup.it")
        java.lang.String ufficioDestProv,
        @WebParam(name = "note", targetNamespace = "http://servizi.protocollo.ws.dedagroup.it")
        java.lang.String note,
        @WebParam(name = "protPrecedente", targetNamespace = "http://servizi.protocollo.ws.dedagroup.it")
        java.lang.String protPrecedente,
        @WebParam(name = "codiceResponsabile", targetNamespace = "http://servizi.protocollo.ws.dedagroup.it")
        java.lang.String codiceResponsabile,
        @WebParam(name = "codiceTipoSpedizione", targetNamespace = "http://servizi.protocollo.ws.dedagroup.it")
        java.lang.String codiceTipoSpedizione
    );
}
