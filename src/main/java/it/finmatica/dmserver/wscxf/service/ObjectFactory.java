
package it.finmatica.dmserver.wscxf.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.finmatica.dmserver.wscxf.service package. 
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

    private final static QName _DeleteAttachResponse_QNAME = new QName("http://service.wscxf.dmServer.finmatica.it/", "deleteAttachResponse");
    private final static QName _UpdateAttachResponse_QNAME = new QName("http://service.wscxf.dmServer.finmatica.it/", "updateAttachResponse");
    private final static QName _DownloadAttach_QNAME = new QName("http://service.wscxf.dmServer.finmatica.it/", "downloadAttach");
    private final static QName _InsertAttach_QNAME = new QName("http://service.wscxf.dmServer.finmatica.it/", "insertAttach");
    private final static QName _InsertAttachResponse_QNAME = new QName("http://service.wscxf.dmServer.finmatica.it/", "insertAttachResponse");
    private final static QName _UpdateAttach_QNAME = new QName("http://service.wscxf.dmServer.finmatica.it/", "updateAttach");
    private final static QName _DownloadAttachResponse_QNAME = new QName("http://service.wscxf.dmServer.finmatica.it/", "downloadAttachResponse");
    private final static QName _DeleteAttach_QNAME = new QName("http://service.wscxf.dmServer.finmatica.it/", "deleteAttach");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.finmatica.dmserver.wscxf.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DownloadAttachResponse2 }
     * 
     */
    public DownloadAttachResponse2 createDownloadAttachResponse2() {
        return new DownloadAttachResponse2();
    }

    /**
     * Create an instance of {@link Acl }
     * 
     */
    public Acl createAcl() {
        return new Acl();
    }

    /**
     * Create an instance of {@link InsertAttach }
     * 
     */
    public InsertAttach createInsertAttach() {
        return new InsertAttach();
    }

    /**
     * Create an instance of {@link DownloadAttach }
     * 
     */
    public DownloadAttach createDownloadAttach() {
        return new DownloadAttach();
    }

    /**
     * Create an instance of {@link DeleteAttach }
     * 
     */
    public DeleteAttach createDeleteAttach() {
        return new DeleteAttach();
    }

    /**
     * Create an instance of {@link BaseResponse }
     * 
     */
    public BaseResponse createBaseResponse() {
        return new BaseResponse();
    }

    /**
     * Create an instance of {@link InsertAttachResponse }
     * 
     */
    public InsertAttachResponse createInsertAttachResponse() {
        return new InsertAttachResponse();
    }

    /**
     * Create an instance of {@link InsertAttachResponse2 }
     * 
     */
    public InsertAttachResponse2 createInsertAttachResponse2() {
        return new InsertAttachResponse2();
    }

    /**
     * Create an instance of {@link UpdateAttach }
     * 
     */
    public UpdateAttach createUpdateAttach() {
        return new UpdateAttach();
    }

    /**
     * Create an instance of {@link UpdateAttachResponse }
     * 
     */
    public UpdateAttachResponse createUpdateAttachResponse() {
        return new UpdateAttachResponse();
    }

    /**
     * Create an instance of {@link DeleteAttachResponse }
     * 
     */
    public DeleteAttachResponse createDeleteAttachResponse() {
        return new DeleteAttachResponse();
    }

    /**
     * Create an instance of {@link DownloadAttachResponse }
     * 
     */
    public DownloadAttachResponse createDownloadAttachResponse() {
        return new DownloadAttachResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAttachResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wscxf.dmServer.finmatica.it/", name = "deleteAttachResponse")
    public JAXBElement<DeleteAttachResponse> createDeleteAttachResponse(DeleteAttachResponse value) {
        return new JAXBElement<DeleteAttachResponse>(_DeleteAttachResponse_QNAME, DeleteAttachResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAttachResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wscxf.dmServer.finmatica.it/", name = "updateAttachResponse")
    public JAXBElement<UpdateAttachResponse> createUpdateAttachResponse(UpdateAttachResponse value) {
        return new JAXBElement<UpdateAttachResponse>(_UpdateAttachResponse_QNAME, UpdateAttachResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadAttach }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wscxf.dmServer.finmatica.it/", name = "downloadAttach")
    public JAXBElement<DownloadAttach> createDownloadAttach(DownloadAttach value) {
        return new JAXBElement<DownloadAttach>(_DownloadAttach_QNAME, DownloadAttach.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertAttach }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wscxf.dmServer.finmatica.it/", name = "insertAttach")
    public JAXBElement<InsertAttach> createInsertAttach(InsertAttach value) {
        return new JAXBElement<InsertAttach>(_InsertAttach_QNAME, InsertAttach.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertAttachResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wscxf.dmServer.finmatica.it/", name = "insertAttachResponse")
    public JAXBElement<InsertAttachResponse> createInsertAttachResponse(InsertAttachResponse value) {
        return new JAXBElement<InsertAttachResponse>(_InsertAttachResponse_QNAME, InsertAttachResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAttach }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wscxf.dmServer.finmatica.it/", name = "updateAttach")
    public JAXBElement<UpdateAttach> createUpdateAttach(UpdateAttach value) {
        return new JAXBElement<UpdateAttach>(_UpdateAttach_QNAME, UpdateAttach.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadAttachResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wscxf.dmServer.finmatica.it/", name = "downloadAttachResponse")
    public JAXBElement<DownloadAttachResponse> createDownloadAttachResponse(DownloadAttachResponse value) {
        return new JAXBElement<DownloadAttachResponse>(_DownloadAttachResponse_QNAME, DownloadAttachResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAttach }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wscxf.dmServer.finmatica.it/", name = "deleteAttach")
    public JAXBElement<DeleteAttach> createDeleteAttach(DeleteAttach value) {
        return new JAXBElement<DeleteAttach>(_DeleteAttach_QNAME, DeleteAttach.class, null, value);
    }

}
