
package it.dedagroup.ws.spediscidocumento.response.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import it.dedagroup.ws.spediscidocumento.om.xsd.Esito;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.dedagroup.ws.spediscidocumento.response.xsd package. 
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

    private final static QName _RispostaSpedisciDocumentoEsito_QNAME = new QName("http://response.protocollo.ws.dedagroup.it/xsd", "esito");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.dedagroup.ws.spediscidocumento.response.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RispostaSpedisciDocumento }
     * 
     */
    public RispostaSpedisciDocumento createRispostaSpedisciDocumento() {
        return new RispostaSpedisciDocumento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Esito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.protocollo.ws.dedagroup.it/xsd", name = "esito", scope = RispostaSpedisciDocumento.class)
    public JAXBElement<Esito> createRispostaSpedisciDocumentoEsito(Esito value) {
        return new JAXBElement<Esito>(_RispostaSpedisciDocumentoEsito_QNAME, Esito.class, RispostaSpedisciDocumento.class, value);
    }

}
