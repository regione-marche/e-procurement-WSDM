
package it.easydoc.rest.notify;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.consorziocsa.easydoc.ws package. 
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

    private final static QName _GenericServiceResponse_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "GenericServiceResponse");
    private final static QName _NotifyDocumentIngestRequest_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "NotifyDocumentIngestRequest");
    private final static QName _DocumentID_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "Document_ID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.consorziocsa.easydoc.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DocumentID }
     * 
     */
    public DocumentID createDocumentID() {
        return new DocumentID();
    }

    /**
     * Create an instance of {@link GenericServiceResponse }
     * 
     */
    public GenericServiceResponse createGenericServiceResponse() {
        return new GenericServiceResponse();
    }

    /**
     * Create an instance of {@link NotifyDocumentIngestRequest }
     * 
     */
    public NotifyDocumentIngestRequest createNotifyDocumentIngestRequest() {
        return new NotifyDocumentIngestRequest();
    }

    /**
     * Create an instance of {@link Metadata }
     * 
     */
    public Metadata createMetadata() {
        return new Metadata();
    }

    /**
     * Create an instance of {@link MessageResponse }
     * 
     */
    public MessageResponse createMessageResponse() {
        return new MessageResponse();
    }

    /**
     * Create an instance of {@link MetadataItem }
     * 
     */
    public MetadataItem createMetadataItem() {
        return new MetadataItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.consorziocsa.it/easydoc/ws", name = "GenericServiceResponse")
    public JAXBElement<GenericServiceResponse> createGenericServiceResponse(GenericServiceResponse value) {
        return new JAXBElement<GenericServiceResponse>(_GenericServiceResponse_QNAME, GenericServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyDocumentIngestRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.consorziocsa.it/easydoc/ws", name = "NotifyDocumentIngestRequest")
    public JAXBElement<NotifyDocumentIngestRequest> createNotifyDocumentIngestRequest(NotifyDocumentIngestRequest value) {
        return new JAXBElement<NotifyDocumentIngestRequest>(_NotifyDocumentIngestRequest_QNAME, NotifyDocumentIngestRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.consorziocsa.it/easydoc/ws", name = "Document_ID")
    public JAXBElement<DocumentID> createDocumentID(DocumentID value) {
        return new JAXBElement<DocumentID>(_DocumentID_QNAME, DocumentID.class, null, value);
    }

}
