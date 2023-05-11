
package it.dedagroup.ws.salvadocumento.response.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import it.dedagroup.ws.salvadocumento.om.xsd.Esito;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.dedagroup.ws.salvadocumento.response.xsd package. 
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

    private final static QName _RispostaSalvaDocumentoIdDocumentale_QNAME = new QName("http://response.protocollo.ws.dedagroup.it/xsd", "idDocumentale");
    private final static QName _RispostaSalvaDocumentoEsito_QNAME = new QName("http://response.protocollo.ws.dedagroup.it/xsd", "esito");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.dedagroup.ws.salvadocumento.response.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RispostaSalvaDocumento }
     * 
     */
    public RispostaSalvaDocumento createRispostaSalvaDocumento() {
        return new RispostaSalvaDocumento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.protocollo.ws.dedagroup.it/xsd", name = "idDocumentale", scope = RispostaSalvaDocumento.class)
    public JAXBElement<String> createRispostaSalvaDocumentoIdDocumentale(String value) {
        return new JAXBElement<String>(_RispostaSalvaDocumentoIdDocumentale_QNAME, String.class, RispostaSalvaDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Esito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.protocollo.ws.dedagroup.it/xsd", name = "esito", scope = RispostaSalvaDocumento.class)
    public JAXBElement<Esito> createRispostaSalvaDocumentoEsito(Esito value) {
        return new JAXBElement<Esito>(_RispostaSalvaDocumentoEsito_QNAME, Esito.class, RispostaSalvaDocumento.class, value);
    }

}
