
package it.easydoc.MailManagerService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.easydoc.MailManagerService package. 
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
    private final static QName _GetReceiptContent_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "GetReceiptContent");
    private final static QName _DocumentID_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "Document_ID");
    private final static QName _GetMailStatusResponse_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "GetMailStatusResponse");
    private final static QName _GetReceiptContentResponse_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "GetReceiptContentResponse");
    private final static QName _Login_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "Login");
    private final static QName _EasyDocWSException_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "EasyDocWSException");
    private final static QName _ValidateSessionResponse_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "ValidateSessionResponse");
    private final static QName _LogoutResponse_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "LogoutResponse");
    private final static QName _GetMailStatus_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "GetMailStatus");
    private final static QName _LoginResponse_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "LoginResponse");
    private final static QName _SendMail_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "SendMail");
    private final static QName _ValidateSession_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "ValidateSession");
    private final static QName _SendMailResponse_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "SendMailResponse");
    private final static QName _GenericServiceResponse_QNAME = new QName("http://www.consorziocsa.it/easydoc/ws", "GenericServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.easydoc.MailManagerService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendMailRequestType }
     * 
     */
    public SendMailRequestType createSendMailRequestType() {
        return new SendMailRequestType();
    }

    /**
     * Create an instance of {@link SendMailRequestType.BlindCarbonCopyReceipts }
     * 
     */
    public SendMailRequestType.BlindCarbonCopyReceipts createSendMailRequestTypeBlindCarbonCopyReceipts() {
        return new SendMailRequestType.BlindCarbonCopyReceipts();
    }

    /**
     * Create an instance of {@link SendMailRequestType.Attachments }
     * 
     */
    public SendMailRequestType.Attachments createSendMailRequestTypeAttachments() {
        return new SendMailRequestType.Attachments();
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
     * Create an instance of {@link MailTemplateItem }
     * 
     */
    public MailTemplateItem createMailTemplateItem() {
        return new MailTemplateItem();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link GetReceiptContentRequestType }
     * 
     */
    public GetReceiptContentRequestType createGetReceiptContentRequestType() {
        return new GetReceiptContentRequestType();
    }

    /**
     * Create an instance of {@link SendMailResponse }
     * 
     */
    public SendMailResponse createSendMailResponse() {
        return new SendMailResponse();
    }

    /**
     * Create an instance of {@link SendMail }
     * 
     */
    public SendMail createSendMail() {
        return new SendMail();
    }

    /**
     * Create an instance of {@link GenericServiceResponse }
     * 
     */
    public GenericServiceResponse createGenericServiceResponse() {
        return new GenericServiceResponse();
    }

    /**
     * Create an instance of {@link TemplateParameterItem }
     * 
     */
    public TemplateParameterItem createTemplateParameterItem() {
        return new TemplateParameterItem();
    }

    /**
     * Create an instance of {@link GetMailStatusRequestType }
     * 
     */
    public GetMailStatusRequestType createGetMailStatusRequestType() {
        return new GetMailStatusRequestType();
    }

    /**
     * Create an instance of {@link LoginRequestType }
     * 
     */
    public LoginRequestType createLoginRequestType() {
        return new LoginRequestType();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link MailTemplateItem.Parameters }
     * 
     */
    public MailTemplateItem.Parameters createMailTemplateItemParameters() {
        return new MailTemplateItem.Parameters();
    }

    /**
     * Create an instance of {@link GetMailStatusResponseType }
     * 
     */
    public GetMailStatusResponseType createGetMailStatusResponseType() {
        return new GetMailStatusResponseType();
    }

    /**
     * Create an instance of {@link LoginResponseType }
     * 
     */
    public LoginResponseType createLoginResponseType() {
        return new LoginResponseType();
    }

    /**
     * Create an instance of {@link SendMailRequestType.Receipts }
     * 
     */
    public SendMailRequestType.Receipts createSendMailRequestTypeReceipts() {
        return new SendMailRequestType.Receipts();
    }

    /**
     * Create an instance of {@link SendMailResponseType }
     * 
     */
    public SendMailResponseType createSendMailResponseType() {
        return new SendMailResponseType();
    }

    /**
     * Create an instance of {@link ServiceFaultBean }
     * 
     */
    public ServiceFaultBean createServiceFaultBean() {
        return new ServiceFaultBean();
    }

    /**
     * Create an instance of {@link GetMailStatusResponse }
     * 
     */
    public GetMailStatusResponse createGetMailStatusResponse() {
        return new GetMailStatusResponse();
    }

    /**
     * Create an instance of {@link GetReceiptContentResponse }
     * 
     */
    public GetReceiptContentResponse createGetReceiptContentResponse() {
        return new GetReceiptContentResponse();
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
     * Create an instance of {@link SendMailRequestType.CarbonCopyReceipts }
     * 
     */
    public SendMailRequestType.CarbonCopyReceipts createSendMailRequestTypeCarbonCopyReceipts() {
        return new SendMailRequestType.CarbonCopyReceipts();
    }

    /**
     * Create an instance of {@link ChannelItem }
     * 
     */
    public ChannelItem createChannelItem() {
        return new ChannelItem();
    }

    /**
     * Create an instance of {@link GetMailStatus }
     * 
     */
    public GetMailStatus createGetMailStatus() {
        return new GetMailStatus();
    }

    /**
     * Create an instance of {@link GetReceiptContentResponseType }
     * 
     */
    public GetReceiptContentResponseType createGetReceiptContentResponseType() {
        return new GetReceiptContentResponseType();
    }

    /**
     * Create an instance of {@link GetMailStatusResponseType.Receipts }
     * 
     */
    public GetMailStatusResponseType.Receipts createGetMailStatusResponseTypeReceipts() {
        return new GetMailStatusResponseType.Receipts();
    }

    /**
     * Create an instance of {@link ReceiptType }
     * 
     */
    public ReceiptType createReceiptType() {
        return new ReceiptType();
    }

    /**
     * Create an instance of {@link GetReceiptContent }
     * 
     */
    public GetReceiptContent createGetReceiptContent() {
        return new GetReceiptContent();
    }

    /**
     * Create an instance of {@link BodyContentItem }
     * 
     */
    public BodyContentItem createBodyContentItem() {
        return new BodyContentItem();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReceiptContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.consorziocsa.it/easydoc/ws", name = "GetReceiptContent")
    public JAXBElement<GetReceiptContent> createGetReceiptContent(GetReceiptContent value) {
        return new JAXBElement<GetReceiptContent>(_GetReceiptContent_QNAME, GetReceiptContent.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.consorziocsa.it/easydoc/ws", name = "GetMailStatusResponse")
    public JAXBElement<GetMailStatusResponse> createGetMailStatusResponse(GetMailStatusResponse value) {
        return new JAXBElement<GetMailStatusResponse>(_GetMailStatusResponse_QNAME, GetMailStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReceiptContentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.consorziocsa.it/easydoc/ws", name = "GetReceiptContentResponse")
    public JAXBElement<GetReceiptContentResponse> createGetReceiptContentResponse(GetReceiptContentResponse value) {
        return new JAXBElement<GetReceiptContentResponse>(_GetReceiptContentResponse_QNAME, GetReceiptContentResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFaultBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.consorziocsa.it/easydoc/ws", name = "EasyDocWSException")
    public JAXBElement<ServiceFaultBean> createEasyDocWSException(ServiceFaultBean value) {
        return new JAXBElement<ServiceFaultBean>(_EasyDocWSException_QNAME, ServiceFaultBean.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.consorziocsa.it/easydoc/ws", name = "LogoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.consorziocsa.it/easydoc/ws", name = "GetMailStatus")
    public JAXBElement<GetMailStatus> createGetMailStatus(GetMailStatus value) {
        return new JAXBElement<GetMailStatus>(_GetMailStatus_QNAME, GetMailStatus.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.consorziocsa.it/easydoc/ws", name = "SendMail")
    public JAXBElement<SendMail> createSendMail(SendMail value) {
        return new JAXBElement<SendMail>(_SendMail_QNAME, SendMail.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.consorziocsa.it/easydoc/ws", name = "SendMailResponse")
    public JAXBElement<SendMailResponse> createSendMailResponse(SendMailResponse value) {
        return new JAXBElement<SendMailResponse>(_SendMailResponse_QNAME, SendMailResponse.class, null, value);
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
