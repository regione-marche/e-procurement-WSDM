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
 * 2020-03-24T08:41:12.287+01:00
 * Generated source version: 2.7.10
 * 
 */
@WebService(targetNamespace = "http://WebServices.jprotocol.com/", name = "WsSendMail")
@XmlSeeAlso({ObjectFactory.class})
public interface WsSendMail {

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://WebServices.jprotocol.com/WsSendMail/sendDocumentRequest", output = "http://WebServices.jprotocol.com/WsSendMail/sendDocumentResponse")
    @RequestWrapper(localName = "sendDocument", targetNamespace = "http://WebServices.jprotocol.com/", className = "com.jprotocol.webservices.SendDocument")
    @WebMethod
    @ResponseWrapper(localName = "sendDocumentResponse", targetNamespace = "http://WebServices.jprotocol.com/", className = "com.jprotocol.webservices.SendDocumentResponse")
    public com.jprotocol.webservices.MailServiceResponse sendDocument(
        @WebParam(name = "ServiceRequest", targetNamespace = "")
        com.jprotocol.webservices.MailServiceRequest serviceRequest
    );
}
