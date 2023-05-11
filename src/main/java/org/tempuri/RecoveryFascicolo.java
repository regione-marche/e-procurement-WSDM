
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.FascicoloIdentifier;
import org.datacontract.schemas._2004._07.siav_common_baseclass.BaseIdentifier;


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
 *         &lt;element name="UtenteId" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseIdentifier" minOccurs="0"/>
 *         &lt;element name="Pk" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier}FascicoloIdentifier" minOccurs="0"/>
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
    "utenteId",
    "pk"
})
@XmlRootElement(name = "RecoveryFascicolo")
public class RecoveryFascicolo {

    @XmlElementRef(name = "UtenteId", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<BaseIdentifier> utenteId;
    @XmlElementRef(name = "Pk", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<FascicoloIdentifier> pk;

    /**
     * Gets the value of the utenteId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}
     *     
     */
    public JAXBElement<BaseIdentifier> getUtenteId() {
        return utenteId;
    }

    /**
     * Sets the value of the utenteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}
     *     
     */
    public void setUtenteId(JAXBElement<BaseIdentifier> value) {
        this.utenteId = ((JAXBElement<BaseIdentifier> ) value);
    }

    /**
     * Gets the value of the pk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}
     *     
     */
    public JAXBElement<FascicoloIdentifier> getPk() {
        return pk;
    }

    /**
     * Sets the value of the pk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}
     *     
     */
    public void setPk(JAXBElement<FascicoloIdentifier> value) {
        this.pk = ((JAXBElement<FascicoloIdentifier> ) value);
    }

}
