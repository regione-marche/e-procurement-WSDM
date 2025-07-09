
package it.marche.regione.paleo;

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
 *         &lt;element name="AddVersioneDocumentoResult" type="{http://paleo.regione.marche.it/services/}BEBaseOfTupleOfintint5F2dSckg" minOccurs="0"/>
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
    "addVersioneDocumentoResult"
})
@XmlRootElement(name = "AddVersioneDocumentoResponse")
public class AddVersioneDocumentoResponse {

    @XmlElement(name = "AddVersioneDocumentoResult", nillable = true)
    protected BEBaseOfTupleOfintint5F2DSckg addVersioneDocumentoResult;

    /**
     * Gets the value of the addVersioneDocumentoResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEBaseOfTupleOfintint5F2DSckg }
     *     
     */
    public BEBaseOfTupleOfintint5F2DSckg getAddVersioneDocumentoResult() {
        return addVersioneDocumentoResult;
    }

    /**
     * Sets the value of the addVersioneDocumentoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEBaseOfTupleOfintint5F2DSckg }
     *     
     */
    public void setAddVersioneDocumentoResult(BEBaseOfTupleOfintint5F2DSckg value) {
        this.addVersioneDocumentoResult = value;
    }

}
