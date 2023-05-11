package com.jprotocol.webservices;

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
 * 2020-03-24T08:41:12.015+01:00
 * Generated source version: 2.7.10
 * 
 */
@WebService(targetNamespace = "http://WebServices.jprotocol.com/", name = "WsProtocollaSilente")
@XmlSeeAlso({ObjectFactory.class})
public interface WsProtocollaSilente {

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://WebServices.jprotocol.com/WsProtocollaSilente/impostaRiservatezzaRequest", output = "http://WebServices.jprotocol.com/WsProtocollaSilente/impostaRiservatezzaResponse")
    @RequestWrapper(localName = "impostaRiservatezza", targetNamespace = "http://WebServices.jprotocol.com/", className = "com.jprotocol.webservices.ImpostaRiservatezza")
    @WebMethod
    @ResponseWrapper(localName = "impostaRiservatezzaResponse", targetNamespace = "http://WebServices.jprotocol.com/", className = "com.jprotocol.webservices.ImpostaRiservatezzaResponse")
    public int impostaRiservatezza(
        @WebParam(name = "token", targetNamespace = "")
        java.lang.String token,
        @WebParam(name = "annoProtocolloDaImpostare", targetNamespace = "")
        java.lang.String annoProtocolloDaImpostare,
        @WebParam(name = "numeroProtocolloDaImpostare", targetNamespace = "")
        java.lang.String numeroProtocolloDaImpostare,
        @WebParam(name = "gradoRiservatezza", targetNamespace = "")
        java.lang.Integer gradoRiservatezza
    );

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://WebServices.jprotocol.com/WsProtocollaSilente/ProtocollaRequest", output = "http://WebServices.jprotocol.com/WsProtocollaSilente/ProtocollaResponse")
    @RequestWrapper(localName = "Protocolla", targetNamespace = "http://WebServices.jprotocol.com/", className = "com.jprotocol.webservices.Protocolla")
    @WebMethod(operationName = "Protocolla")
    @ResponseWrapper(localName = "ProtocollaResponse", targetNamespace = "http://WebServices.jprotocol.com/", className = "com.jprotocol.webservices.ProtocollaResponse")
    public com.jprotocol.webservices.ProtSilenteResult protocolla(
        @WebParam(name = "NuovoRecord", targetNamespace = "")
        com.jprotocol.webservices.ProtocolloDaRegistrare nuovoRecord
    );

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://WebServices.jprotocol.com/WsProtocollaSilente/ProtocollaV2Request", output = "http://WebServices.jprotocol.com/WsProtocollaSilente/ProtocollaV2Response")
    @RequestWrapper(localName = "ProtocollaV2", targetNamespace = "http://WebServices.jprotocol.com/", className = "com.jprotocol.webservices.ProtocollaV2")
    @WebMethod(operationName = "ProtocollaV2")
    @ResponseWrapper(localName = "ProtocollaV2Response", targetNamespace = "http://WebServices.jprotocol.com/", className = "com.jprotocol.webservices.ProtocollaV2Response")
    public com.jprotocol.webservices.ProtSilenteResult protocollaV2(
        @WebParam(name = "NuovoRecord", targetNamespace = "")
        com.jprotocol.webservices.ProtocolloDaRegistrareV2 nuovoRecord
    );
}
