
package it.dedagroup.ws.protocolla.servizi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import it.dedagroup.ws.protocolla.response.xsd.RispostaProtocolla;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.dedagroup.ws.protocolla.servizi package. 
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

    private final static QName _ProcessOggetto_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "oggetto");
    private final static QName _ProcessProtPrecedente_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "protPrecedente");
    private final static QName _ProcessDataProtocollo_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "dataProtocollo");
    private final static QName _ProcessNote_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "note");
    private final static QName _ProcessVerso_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "verso");
    private final static QName _ProcessCodiceTipoSpedizione_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "codiceTipoSpedizione");
    private final static QName _ProcessUfficioDestProv_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "ufficioDestProv");
    private final static QName _ProcessOraProtocollo_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "oraProtocollo");
    private final static QName _ProcessPassword_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "password");
    private final static QName _ProcessId_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "id");
    private final static QName _ProcessCodiceResponsabile_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "codiceResponsabile");
    private final static QName _ProcessResponseReturn_QNAME = new QName("http://servizi.protocollo.ws.dedagroup.it", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.dedagroup.ws.protocolla.servizi
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
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "oggetto", scope = Process.class)
    public JAXBElement<String> createProcessOggetto(String value) {
        return new JAXBElement<String>(_ProcessOggetto_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "protPrecedente", scope = Process.class)
    public JAXBElement<String> createProcessProtPrecedente(String value) {
        return new JAXBElement<String>(_ProcessProtPrecedente_QNAME, String.class, Process.class, value);
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
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "note", scope = Process.class)
    public JAXBElement<String> createProcessNote(String value) {
        return new JAXBElement<String>(_ProcessNote_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "verso", scope = Process.class)
    public JAXBElement<String> createProcessVerso(String value) {
        return new JAXBElement<String>(_ProcessVerso_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "codiceTipoSpedizione", scope = Process.class)
    public JAXBElement<String> createProcessCodiceTipoSpedizione(String value) {
        return new JAXBElement<String>(_ProcessCodiceTipoSpedizione_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "ufficioDestProv", scope = Process.class)
    public JAXBElement<String> createProcessUfficioDestProv(String value) {
        return new JAXBElement<String>(_ProcessUfficioDestProv_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "oraProtocollo", scope = Process.class)
    public JAXBElement<String> createProcessOraProtocollo(String value) {
        return new JAXBElement<String>(_ProcessOraProtocollo_QNAME, String.class, Process.class, value);
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
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "codiceResponsabile", scope = Process.class)
    public JAXBElement<String> createProcessCodiceResponsabile(String value) {
        return new JAXBElement<String>(_ProcessCodiceResponsabile_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RispostaProtocolla }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servizi.protocollo.ws.dedagroup.it", name = "return", scope = ProcessResponse.class)
    public JAXBElement<RispostaProtocolla> createProcessResponseReturn(RispostaProtocolla value) {
        return new JAXBElement<RispostaProtocolla>(_ProcessResponseReturn_QNAME, RispostaProtocolla.class, ProcessResponse.class, value);
    }

}
