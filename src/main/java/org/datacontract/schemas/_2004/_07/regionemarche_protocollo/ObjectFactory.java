
package org.datacontract.schemas._2004._07.regionemarche_protocollo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.regionemarche_protocollo package. 
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

    private final static QName _TipoOggettoIPA_QNAME = new QName("http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Providers", "TipoOggettoIPA");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.regionemarche_protocollo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoOggettoIPA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Providers", name = "TipoOggettoIPA")
    public JAXBElement<TipoOggettoIPA> createTipoOggettoIPA(TipoOggettoIPA value) {
        return new JAXBElement<TipoOggettoIPA>(_TipoOggettoIPA_QNAME, TipoOggettoIPA.class, null, value);
    }

}
