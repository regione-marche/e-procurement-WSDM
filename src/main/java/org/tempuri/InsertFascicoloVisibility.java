
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.FascicoloIdentifier;
import org.datacontract.schemas._2004._07.siav_common_baseclass.BaseVisibility;


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
 *         &lt;element name="pFascId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier}FascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="pBaseVis" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseVisibility" minOccurs="0"/>
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
    "pFascId",
    "pBaseVis"
})
@XmlRootElement(name = "InsertFascicoloVisibility")
public class InsertFascicoloVisibility {

    @XmlElementRef(name = "pFascId", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<FascicoloIdentifier> pFascId;
    @XmlElementRef(name = "pBaseVis", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<BaseVisibility> pBaseVis;

    /**
     * Gets the value of the pFascId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}
     *     
     */
    public JAXBElement<FascicoloIdentifier> getPFascId() {
        return pFascId;
    }

    /**
     * Sets the value of the pFascId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}
     *     
     */
    public void setPFascId(JAXBElement<FascicoloIdentifier> value) {
        this.pFascId = ((JAXBElement<FascicoloIdentifier> ) value);
    }

    /**
     * Gets the value of the pBaseVis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseVisibility }{@code >}
     *     
     */
    public JAXBElement<BaseVisibility> getPBaseVis() {
        return pBaseVis;
    }

    /**
     * Sets the value of the pBaseVis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseVisibility }{@code >}
     *     
     */
    public void setPBaseVis(JAXBElement<BaseVisibility> value) {
        this.pBaseVis = ((JAXBElement<BaseVisibility> ) value);
    }

}
