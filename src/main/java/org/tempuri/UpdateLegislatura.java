
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.Legislatura;


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
 *         &lt;element name="pLegis" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}Legislatura" minOccurs="0"/>
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
    "pLegis"
})
@XmlRootElement(name = "UpdateLegislatura")
public class UpdateLegislatura {

    @XmlElementRef(name = "pLegis", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<Legislatura> pLegis;

    /**
     * Gets the value of the pLegis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Legislatura }{@code >}
     *     
     */
    public JAXBElement<Legislatura> getPLegis() {
        return pLegis;
    }

    /**
     * Sets the value of the pLegis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Legislatura }{@code >}
     *     
     */
    public void setPLegis(JAXBElement<Legislatura> value) {
        this.pLegis = ((JAXBElement<Legislatura> ) value);
    }

}
