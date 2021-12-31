
package com.jprotocol.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jprotocol.webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SendDocumentResponse_QNAME = new QName("http://WebServices.jprotocol.com/", "sendDocumentResponse");
    private final static QName _SendDocument_QNAME = new QName("http://WebServices.jprotocol.com/", "sendDocument");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jprotocol.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendDocument }
     * 
     */
    public SendDocument createSendDocument() {
        return new SendDocument();
    }

    /**
     * Create an instance of {@link MailServiceResponse }
     * 
     */
    public MailServiceResponse createMailServiceResponse() {
        return new MailServiceResponse();
    }

    /**
     * Create an instance of {@link SendDocumentResponse }
     * 
     */
    public SendDocumentResponse createSendDocumentResponse() {
        return new SendDocumentResponse();
    }

    /**
     * Create an instance of {@link MailServiceRequest }
     * 
     */
    public MailServiceRequest createMailServiceRequest() {
        return new MailServiceRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices.jprotocol.com/", name = "sendDocumentResponse")
    public JAXBElement<SendDocumentResponse> createSendDocumentResponse(SendDocumentResponse value) {
        return new JAXBElement<SendDocumentResponse>(_SendDocumentResponse_QNAME, SendDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices.jprotocol.com/", name = "sendDocument")
    public JAXBElement<SendDocument> createSendDocument(SendDocument value) {
        return new JAXBElement<SendDocument>(_SendDocument_QNAME, SendDocument.class, null, value);
    }

}
