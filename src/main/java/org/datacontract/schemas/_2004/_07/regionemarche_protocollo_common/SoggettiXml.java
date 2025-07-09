
package org.datacontract.schemas._2004._07.regionemarche_protocollo_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.regionemarche_protocollo_common_tipi.ArrayOfRuoloType;


/**
 * <p>Java class for SoggettiXml complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoggettiXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ruolo" type="{http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi.Digip}ArrayOfRuoloType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoggettiXml", propOrder = {
    "ruolo"
})
public class SoggettiXml {

    @XmlElement(name = "Ruolo", nillable = true)
    protected ArrayOfRuoloType ruolo;

    /**
     * Gets the value of the ruolo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRuoloType }
     *     
     */
    public ArrayOfRuoloType getRuolo() {
        return ruolo;
    }

    /**
     * Sets the value of the ruolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRuoloType }
     *     
     */
    public void setRuolo(ArrayOfRuoloType value) {
        this.ruolo = value;
    }

}
