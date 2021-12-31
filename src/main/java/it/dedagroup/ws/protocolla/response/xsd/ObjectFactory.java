
package it.dedagroup.ws.protocolla.response.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import it.dedagroup.ws.protocolla.om.xsd.Esito;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.dedagroup.ws.protocolla.response.xsd package. 
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

    private final static QName _RispostaRestituisciProtocolloNumProtocollo_QNAME = new QName("http://response.protocollo.ws.dedagroup.it/xsd", "numProtocollo");
    private final static QName _RispostaRestituisciProtocolloDataProtocollo_QNAME = new QName("http://response.protocollo.ws.dedagroup.it/xsd", "dataProtocollo");
    private final static QName _RispostaRestituisciProtocolloEsito_QNAME = new QName("http://response.protocollo.ws.dedagroup.it/xsd", "esito");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.dedagroup.ws.protocolla.response.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RispostaProtocolla }
     * 
     */
    public RispostaProtocolla createRispostaProtocolla() {
        return new RispostaProtocolla();
    }

    /**
     * Create an instance of {@link RispostaRestituisciProtocollo }
     * 
     */
    public RispostaRestituisciProtocollo createRispostaRestituisciProtocollo() {
        return new RispostaRestituisciProtocollo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.protocollo.ws.dedagroup.it/xsd", name = "numProtocollo", scope = RispostaRestituisciProtocollo.class)
    public JAXBElement<String> createRispostaRestituisciProtocolloNumProtocollo(String value) {
        return new JAXBElement<String>(_RispostaRestituisciProtocolloNumProtocollo_QNAME, String.class, RispostaRestituisciProtocollo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.protocollo.ws.dedagroup.it/xsd", name = "dataProtocollo", scope = RispostaRestituisciProtocollo.class)
    public JAXBElement<XMLGregorianCalendar> createRispostaRestituisciProtocolloDataProtocollo(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RispostaRestituisciProtocolloDataProtocollo_QNAME, XMLGregorianCalendar.class, RispostaRestituisciProtocollo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Esito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.protocollo.ws.dedagroup.it/xsd", name = "esito", scope = RispostaRestituisciProtocollo.class)
    public JAXBElement<Esito> createRispostaRestituisciProtocolloEsito(Esito value) {
        return new JAXBElement<Esito>(_RispostaRestituisciProtocolloEsito_QNAME, Esito.class, RispostaRestituisciProtocollo.class, value);
    }

}
