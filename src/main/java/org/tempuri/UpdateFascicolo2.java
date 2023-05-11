
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.ArrayOfCampiTipoFascicoloValue;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.FascicoloEntity;
import org.datacontract.schemas._2004._07.siav_common_baseclass.BaseIdentifier;
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
 *         &lt;element name="UtenteId" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseIdentifier" minOccurs="0"/>
 *         &lt;element name="pFascEntity" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}FascicoloEntity" minOccurs="0"/>
 *         &lt;element name="pBaseVis" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseVisibility" minOccurs="0"/>
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
    "utenteId",
    "pFascEntity",
    "pBaseVis",
    "pCampiTipoFascColl"
})
@XmlRootElement(name = "UpdateFascicolo2")
public class UpdateFascicolo2 {

    @XmlElementRef(name = "UtenteId", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<BaseIdentifier> utenteId;
    @XmlElementRef(name = "pFascEntity", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<FascicoloEntity> pFascEntity;
    @XmlElementRef(name = "pBaseVis", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<BaseVisibility> pBaseVis;
    @XmlElementRef(name = "pCampiTipoFascColl", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCampiTipoFascicoloValue> pCampiTipoFascColl;

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
     * Gets the value of the pFascEntity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FascicoloEntity }{@code >}
     *     
     */
    public JAXBElement<FascicoloEntity> getPFascEntity() {
        return pFascEntity;
    }

    /**
     * Sets the value of the pFascEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FascicoloEntity }{@code >}
     *     
     */
    public void setPFascEntity(JAXBElement<FascicoloEntity> value) {
        this.pFascEntity = ((JAXBElement<FascicoloEntity> ) value);
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
