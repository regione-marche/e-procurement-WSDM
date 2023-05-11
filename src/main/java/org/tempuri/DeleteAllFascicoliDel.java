
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="pUtenteId" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseIdentifier" minOccurs="0"/>
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
    "pUtenteId"
})
@XmlRootElement(name = "DeleteAllFascicoliDel")
public class DeleteAllFascicoliDel {

    @XmlElementRef(name = "pUtenteId", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<BaseIdentifier> pUtenteId;

    /**
     * Gets the value of the pUtenteId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}
     *     
     */
    public JAXBElement<BaseIdentifier> getPUtenteId() {
        return pUtenteId;
    }

    /**
     * Sets the value of the pUtenteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}
     *     
     */
    public void setPUtenteId(JAXBElement<BaseIdentifier> value) {
        this.pUtenteId = ((JAXBElement<BaseIdentifier> ) value);
    }

}
