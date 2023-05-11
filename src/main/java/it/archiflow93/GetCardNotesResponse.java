
package it.archiflow93;

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
 *         &lt;element name="GetCardNotesResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oAnnotations" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfAnnotation" minOccurs="0"/>
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
    "getCardNotesResult",
    "oAnnotations"
})
@XmlRootElement(name = "GetCardNotesResponse")
public class GetCardNotesResponse {

    @XmlElement(name = "GetCardNotesResult")
    protected ResultInfo getCardNotesResult;
    @XmlElement(nillable = true)
    protected ArrayOfAnnotation oAnnotations;

    /**
     * Gets the value of the getCardNotesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetCardNotesResult() {
        return getCardNotesResult;
    }

    /**
     * Sets the value of the getCardNotesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetCardNotesResult(ResultInfo value) {
        this.getCardNotesResult = value;
    }

    /**
     * Gets the value of the oAnnotations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnnotation }
     *     
     */
    public ArrayOfAnnotation getOAnnotations() {
        return oAnnotations;
    }

    /**
     * Sets the value of the oAnnotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnnotation }
     *     
     */
    public void setOAnnotations(ArrayOfAnnotation value) {
        this.oAnnotations = value;
    }

}
