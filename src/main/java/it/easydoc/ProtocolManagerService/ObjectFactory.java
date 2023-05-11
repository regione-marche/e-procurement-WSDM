
package it.easydoc.ProtocolManagerService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.easydoc.ProtocolManagerService package. 
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

    private final static QName _Logout_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "Logout");
    private final static QName _DocumentID_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "Document_ID");
    private final static QName _LoginResponse_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "LoginResponse");
    private final static QName _Protocol_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "Protocol");
    private final static QName _ProtocolResponse_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "ProtocolResponse");
    private final static QName _Login_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "Login");
    private final static QName _ValidateSession_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "ValidateSession");
    private final static QName _ValidateSessionResponse_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "ValidateSessionResponse");
    private final static QName _EasyDocWSException_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "EasyDocWSException");
    private final static QName _LogoutResponse_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "LogoutResponse");
    private final static QName _GenericServiceResponse_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "GenericServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.easydoc.ProtocolManagerService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProtocolResponse }
     * 
     */
    public ProtocolResponse createProtocolResponse() {
        return new ProtocolResponse();
    }

    /**
     * Create an instance of {@link Folder }
     * 
     */
    public Folder createFolder() {
        return new Folder();
    }

    /**
     * Create an instance of {@link ExternalSenderRecipientItem }
     * 
     */
    public ExternalSenderRecipientItem createExternalSenderRecipientItem() {
        return new ExternalSenderRecipientItem();
    }

    /**
     * Create an instance of {@link LoginRequestType }
     * 
     */
    public LoginRequestType createLoginRequestType() {
        return new LoginRequestType();
    }

    /**
     * Create an instance of {@link MetadataItemType }
     * 
     */
    public MetadataItemType createMetadataItemType() {
        return new MetadataItemType();
    }

    /**
     * Create an instance of {@link LoginResponseType }
     * 
     */
    public LoginResponseType createLoginResponseType() {
        return new LoginResponseType();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link ValidateSessionResponse }
     * 
     */
    public ValidateSessionResponse createValidateSessionResponse() {
        return new ValidateSessionResponse();
    }

    /**
     * Create an instance of {@link ChannelItem }
     * 
     */
    public ChannelItem createChannelItem() {
        return new ChannelItem();
    }

    /**
     * Create an instance of {@link InternalSenderRecipientItem }
     * 
     */
    public InternalSenderRecipientItem createInternalSenderRecipientItem() {
        return new InternalSenderRecipientItem();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link RecordDocumentRequestType }
     * 
     */
    public RecordDocumentRequestType createRecordDocumentRequestType() {
        return new RecordDocumentRequestType();
    }

    /**
     * Create an instance of {@link RecordDocumentResponseType }
     * 
     */
    public RecordDocumentResponseType createRecordDocumentResponseType() {
        return new RecordDocumentResponseType();
    }

    /**
     * Create an instance of {@link ServiceFaultBean }
     * 
     */
    public ServiceFaultBean createServiceFaultBean() {
        return new ServiceFaultBean();
    }

    /**
     * Create an instance of {@link ClassificationItem }
     * 
     */
    public ClassificationItem createClassificationItem() {
        return new ClassificationItem();
    }

    /**
     * Create an instance of {@link DocumentID }
     * 
     */
    public DocumentID createDocumentID() {
        return new DocumentID();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link ValidateSession }
     * 
     */
    public ValidateSession createValidateSession() {
        return new ValidateSession();
    }

    /**
     * Create an instance of {@link MessageResponse }
     * 
     */
    public MessageResponse createMessageResponse() {
        return new MessageResponse();
    }

    /**
     * Create an instance of {@link GenericServiceResponse }
     * 
     */
    public GenericServiceResponse createGenericServiceResponse() {
        return new GenericServiceResponse();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link Protocol }
     * 
     */
    public Protocol createProtocol() {
        return new Protocol();
    }

    /**
     * Create an instance of {@link Attached }
     * 
     */
    public Attached createAttached() {
        return new Attached();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.consorziocsa.it/easydoc/ws", name = "Logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.consorziocsa.it/easydoc/ws", name = "Document_ID")
    public JAXBElement<DocumentID> createDocumentID(DocumentID value) {
        return new JAXBElement<DocumentID>(_DocumentID_QNAME, DocumentID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.consorziocsa.it/easydoc/ws", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Protocol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.consorziocsa.it/easydoc/ws", name = "Protocol")
    public JAXBElement<Protocol> createProtocol(Protocol value) {
        return new JAXBElement<Protocol>(_Protocol_QNAME, Protocol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProtocolResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.consorziocsa.it/easydoc/ws", name = "ProtocolResponse")
    public JAXBElement<ProtocolResponse> createProtocolResponse(ProtocolResponse value) {
        return new JAXBElement<ProtocolResponse>(_ProtocolResponse_QNAME, ProtocolResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.consorziocsa.it/easydoc/ws", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.consorziocsa.it/easydoc/ws", name = "ValidateSession")
    public JAXBElement<ValidateSession> createValidateSession(ValidateSession value) {
        return new JAXBElement<ValidateSession>(_ValidateSession_QNAME, ValidateSession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateSessionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.consorziocsa.it/easydoc/ws", name = "ValidateSessionResponse")
    public JAXBElement<ValidateSessionResponse> createValidateSessionResponse(ValidateSessionResponse value) {
        return new JAXBElement<ValidateSessionResponse>(_ValidateSessionResponse_QNAME, ValidateSessionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFaultBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.consorziocsa.it/easydoc/ws", name = "EasyDocWSException")
    public JAXBElement<ServiceFaultBean> createEasyDocWSException(ServiceFaultBean value) {
        return new JAXBElement<ServiceFaultBean>(_EasyDocWSException_QNAME, ServiceFaultBean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.consorziocsa.it/easydoc/ws", name = "LogoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.consorziocsa.it/easydoc/ws", name = "GenericServiceResponse")
    public JAXBElement<GenericServiceResponse> createGenericServiceResponse(GenericServiceResponse value) {
        return new JAXBElement<GenericServiceResponse>(_GenericServiceResponse_QNAME, GenericServiceResponse.class, null, value);
    }

}
