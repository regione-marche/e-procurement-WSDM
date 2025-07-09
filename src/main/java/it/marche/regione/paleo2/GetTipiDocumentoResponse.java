
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetTipiDocumentoResult" type="{http://paleo.regione.marche.it/services2/}BEListOfTipoDocumentoc14f1rMd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getTipiDocumentoResult"
})
@XmlRootElement(name = "GetTipiDocumentoResponse")
public class GetTipiDocumentoResponse {

    @XmlElement(name = "GetTipiDocumentoResult", nillable = true)
    protected BEListOfTipoDocumentoc14F1RMd getTipiDocumentoResult;

    /**
     * Gets the value of the getTipiDocumentoResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEListOfTipoDocumentoc14F1RMd }
     *     
     */
    public BEListOfTipoDocumentoc14F1RMd getGetTipiDocumentoResult() {
        return getTipiDocumentoResult;
    }

    /**
     * Sets the value of the getTipiDocumentoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEListOfTipoDocumentoc14F1RMd }
     *     
     */
    public void setGetTipiDocumentoResult(BEListOfTipoDocumentoc14F1RMd value) {
        this.getTipiDocumentoResult = value;
    }

}
