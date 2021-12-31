
package it.dedagroup.ws.spediscidocumento.servizi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import it.dedagroup.ws.spediscidocumento.response.xsd.RispostaSpedisciDocumento;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.dedagroup.ws.spediscidocumento.servizi package. 
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

    private final static QName _ProcessResponseReturn_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "return");
    private final static QName _ProcessTestoMail_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "testoMail");
    private final static QName _ProcessDestinatarioMail_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "destinatarioMail");
    private final static QName _ProcessDataProtocollo_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "dataProtocollo");
    private final static QName _ProcessOggettoMail_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "oggettoMail");
    private final static QName _ProcessMittenteMail_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "mittenteMail");
    private final static QName _ProcessIdDocumento_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "idDocumento");
    private final static QName _ProcessPassword_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "password");
    private final static QName _ProcessId_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "id");
    private final static QName _ProcessNumProtocollo_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "numProtocollo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.dedagroup.ws.spediscidocumento.servizi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessResponse }
     * 
     */
    public ProcessResponse createProcessResponse() {
        return new ProcessResponse();
    }

    /**
     * Create an instance of {@link Process }
     * 
     */
    public Process createProcess() {
        return new Process();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RispostaSpedisciDocumento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "return", scope = ProcessResponse.class)
    public JAXBElement<RispostaSpedisciDocumento> createProcessResponseReturn(RispostaSpedisciDocumento value) {
        return new JAXBElement<RispostaSpedisciDocumento>(_ProcessResponseReturn_QNAME, RispostaSpedisciDocumento.class, ProcessResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "testoMail", scope = Process.class)
    public JAXBElement<String> createProcessTestoMail(String value) {
        return new JAXBElement<String>(_ProcessTestoMail_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "destinatarioMail", scope = Process.class)
    public JAXBElement<String> createProcessDestinatarioMail(String value) {
        return new JAXBElement<String>(_ProcessDestinatarioMail_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "dataProtocollo", scope = Process.class)
    public JAXBElement<String> createProcessDataProtocollo(String value) {
        return new JAXBElement<String>(_ProcessDataProtocollo_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "oggettoMail", scope = Process.class)
    public JAXBElement<String> createProcessOggettoMail(String value) {
        return new JAXBElement<String>(_ProcessOggettoMail_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "mittenteMail", scope = Process.class)
    public JAXBElement<String> createProcessMittenteMail(String value) {
        return new JAXBElement<String>(_ProcessMittenteMail_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "idDocumento", scope = Process.class)
    public JAXBElement<String> createProcessIdDocumento(String value) {
        return new JAXBElement<String>(_ProcessIdDocumento_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "password", scope = Process.class)
    public JAXBElement<String> createProcessPassword(String value) {
        return new JAXBElement<String>(_ProcessPassword_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "id", scope = Process.class)
    public JAXBElement<String> createProcessId(String value) {
        return new JAXBElement<String>(_ProcessId_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "numProtocollo", scope = Process.class)
    public JAXBElement<String> createProcessNumProtocollo(String value) {
        return new JAXBElement<String>(_ProcessNumProtocollo_QNAME, String.class, Process.class, value);
    }

}
