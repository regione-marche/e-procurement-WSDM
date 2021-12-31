package it.genova.comune.protocollotest.axis.services.wsprotocollazione;

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
 * 2016-11-18T15:14:34.862+01:00
 * Generated source version: 2.7.10
 * 
 */
@WebService(targetNamespace = "http://protocollotest.comune.genova.it/axis/services/WSProtocollazione", name = "PROTO_WO_test_WSProtocollazionePortType")
@XmlSeeAlso({ObjectFactory.class})
public interface PROTOWOTestWSProtocollazionePortType {

    @WebResult(name = "protocollaReturn", targetNamespace = "")
    @Action(output = "http://protocollotest.comune.genova.it/axis/services/WSProtocollazione/WSProtocollazione/protocollaResponse")
    @RequestWrapper(localName = "protocolla", targetNamespace = "http://protocollotest.comune.genova.it/axis/services/WSProtocollazione", className = "it.genova.comune.protocollotest.axis.services.wsprotocollazione.Protocolla")
    @WebMethod
    @ResponseWrapper(localName = "protocollaResponse", targetNamespace = "http://protocollotest.comune.genova.it/axis/services/WSProtocollazione", className = "it.genova.comune.protocollotest.axis.services.wsprotocollazione.ProtocollaResponse")
    public java.lang.String protocolla(
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
