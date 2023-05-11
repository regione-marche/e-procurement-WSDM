
package it.dedagroup.ws.protocolla.om.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.dedagroup.ws.protocolla.om.xsd package. 
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

    private final static QName _ErroreCodice_QNAME = new QName("http://om.protocollo.ws.dedagroup.it/xsd", "codice");
    private final static QName _ErroreDescrizione_QNAME = new QName("http://om.protocollo.ws.dedagroup.it/xsd", "descrizione");
    private final static QName _EsitoErrore_QNAME = new QName("http://om.protocollo.ws.dedagroup.it/xsd", "errore");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.dedagroup.ws.protocolla.om.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Errore }
     * 
     */
    public Errore createErrore() {
        return new Errore();
    }

    /**
     * Create an instance of {@link Esito }
     * 
     */
    public Esito createEsito() {
        return new Esito();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://om.protocollo.ws.dedagroup.it/xsd", name = "codice", scope = Errore.class)
    public JAXBElement<String> createErroreCodice(String value) {
        return new JAXBElement<String>(_ErroreCodice_QNAME, String.class, Errore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://om.protocollo.ws.dedagroup.it/xsd", name = "descrizione", scope = Errore.class)
    public JAXBElement<String> createErroreDescrizione(String value) {
        return new JAXBElement<String>(_ErroreDescrizione_QNAME, String.class, Errore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://om.protocollo.ws.dedagroup.it/xsd", name = "codice", scope = Esito.class)
    public JAXBElement<String> createEsitoCodice(String value) {
        return new JAXBElement<String>(_ErroreCodice_QNAME, String.class, Esito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://om.protocollo.ws.dedagroup.it/xsd", name = "descrizione", scope = Esito.class)
    public JAXBElement<String> createEsitoDescrizione(String value) {
        return new JAXBElement<String>(_ErroreDescrizione_QNAME, String.class, Esito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Errore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://om.protocollo.ws.dedagroup.it/xsd", name = "errore", scope = Esito.class)
    public JAXBElement<Errore> createEsitoErrore(Errore value) {
        return new JAXBElement<Errore>(_EsitoErrore_QNAME, Errore.class, Esito.class, value);
    }

}
