
package it.dedagroup.ws.salvadocumento.servizi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import it.dedagroup.ws.salvadocumento.response.xsd.RispostaSalvaDocumento;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.dedagroup.ws.salvadocumento.servizi package. 
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

    private final static QName _ProcessTipope_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "tipope");
    private final static QName _ProcessDataProtocollo_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "dataProtocollo");
    private final static QName _ProcessDocumento_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "documento");
    private final static QName _ProcessPassword_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "password");
    private final static QName _ProcessDaConservare_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "daConservare");
    private final static QName _ProcessId_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "id");
    private final static QName _ProcessNomeFile_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "nomeFile");
    private final static QName _ProcessNumProtocollo_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "numProtocollo");
    private final static QName _ProcessResponseReturn_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.dedagroup.ws.salvadocumento.servizi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Process }
     * 
     */
    public Process createProcess() {
        return new Process();
    }

    /**
     * Create an instance of {@link ProcessResponse }
     * 
     */
    public ProcessResponse createProcessResponse() {
        return new ProcessResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "tipope", scope = Process.class)
    public JAXBElement<String> createProcessTipope(String value) {
        return new JAXBElement<String>(_ProcessTipope_QNAME, String.class, Process.class, value);
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
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "documento", scope = Process.class)
    public JAXBElement<String> createProcessDocumento(String value) {
        return new JAXBElement<String>(_ProcessDocumento_QNAME, String.class, Process.class, value);
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
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "daConservare", scope = Process.class)
    public JAXBElement<String> createProcessDaConservare(String value) {
        return new JAXBElement<String>(_ProcessDaConservare_QNAME, String.class, Process.class, value);
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
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "nomeFile", scope = Process.class)
    public JAXBElement<String> createProcessNomeFile(String value) {
        return new JAXBElement<String>(_ProcessNomeFile_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "numProtocollo", scope = Process.class)
    public JAXBElement<String> createProcessNumProtocollo(String value) {
        return new JAXBElement<String>(_ProcessNumProtocollo_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RispostaSalvaDocumento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "return", scope = ProcessResponse.class)
    public JAXBElement<RispostaSalvaDocumento> createProcessResponseReturn(RispostaSalvaDocumento value) {
        return new JAXBElement<RispostaSalvaDocumento>(_ProcessResponseReturn_QNAME, RispostaSalvaDocumento.class, ProcessResponse.class, value);
    }

}
