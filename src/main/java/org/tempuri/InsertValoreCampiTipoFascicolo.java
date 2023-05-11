
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.ArrayOfCampiTipoFascicoloValue;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.FascicoloIdentifier;
import org.datacontract.schemas._2004._07.siav_classification_entities_tipofascicolo.TipoFascicoloIdentifier;


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
 *         &lt;element name="pTipoFascId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier}TipoFascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="pFascId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier}FascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="pCampiTipoFascColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}ArrayOfCampiTipoFascicoloValue" minOccurs="0"/>
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
    "pTipoFascId",
    "pFascId",
    "pCampiTipoFascColl"
})
@XmlRootElement(name = "InsertValoreCampiTipoFascicolo")
public class InsertValoreCampiTipoFascicolo {

    @XmlElementRef(name = "pTipoFascId", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<TipoFascicoloIdentifier> pTipoFascId;
    @XmlElementRef(name = "pFascId", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<FascicoloIdentifier> pFascId;
    @XmlElementRef(name = "pCampiTipoFascColl", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCampiTipoFascicoloValue> pCampiTipoFascColl;

    /**
     * Gets the value of the pTipoFascId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TipoFascicoloIdentifier }{@code >}
     *     
     */
    public JAXBElement<TipoFascicoloIdentifier> getPTipoFascId() {
        return pTipoFascId;
    }

    /**
     * Sets the value of the pTipoFascId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TipoFascicoloIdentifier }{@code >}
     *     
     */
    public void setPTipoFascId(JAXBElement<TipoFascicoloIdentifier> value) {
        this.pTipoFascId = ((JAXBElement<TipoFascicoloIdentifier> ) value);
    }

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
     * Gets the value of the pCampiTipoFascColl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCampiTipoFascicoloValue }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCampiTipoFascicoloValue> getPCampiTipoFascColl() {
        return pCampiTipoFascColl;
    }

    /**
     * Sets the value of the pCampiTipoFascColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCampiTipoFascicoloValue }{@code >}
     *     
     */
    public void setPCampiTipoFascColl(JAXBElement<ArrayOfCampiTipoFascicoloValue> value) {
        this.pCampiTipoFascColl = ((JAXBElement<ArrayOfCampiTipoFascicoloValue> ) value);
    }

}
