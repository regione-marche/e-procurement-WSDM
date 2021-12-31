
package org.datacontract.schemas._2004._07.siav_classification_entities_tipofascicolo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.siav_classification_entities_tipofascicolo package. 
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

    private final static QName _CampiTipoFascicoloIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier", "CampiTipoFascicoloIdentifier");
    private final static QName _TipoFascicoloIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier", "TipoFascicoloIdentifier");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.siav_classification_entities_tipofascicolo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoFascicoloIdentifier }
     * 
     */
    public TipoFascicoloIdentifier createTipoFascicoloIdentifier() {
        return new TipoFascicoloIdentifier();
    }

    /**
     * Create an instance of {@link CampiTipoFascicoloIdentifier }
     * 
     */
    public CampiTipoFascicoloIdentifier createCampiTipoFascicoloIdentifier() {
        return new CampiTipoFascicoloIdentifier();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampiTipoFascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier", name = "CampiTipoFascicoloIdentifier")
    public JAXBElement<CampiTipoFascicoloIdentifier> createCampiTipoFascicoloIdentifier(CampiTipoFascicoloIdentifier value) {
        return new JAXBElement<CampiTipoFascicoloIdentifier>(_CampiTipoFascicoloIdentifier_QNAME, CampiTipoFascicoloIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoFascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier", name = "TipoFascicoloIdentifier")
    public JAXBElement<TipoFascicoloIdentifier> createTipoFascicoloIdentifier(TipoFascicoloIdentifier value) {
        return new JAXBElement<TipoFascicoloIdentifier>(_TipoFascicoloIdentifier_QNAME, TipoFascicoloIdentifier.class, null, value);
    }

}
