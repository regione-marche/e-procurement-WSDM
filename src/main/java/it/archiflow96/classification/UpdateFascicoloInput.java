
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateFascicoloInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateFascicoloInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="CampiTipoFascColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}ArrayOfCampiTipoFascicoloValue" minOccurs="0"/>
 *         &lt;element name="CheckUserWithPrivacy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FascEntity" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}FascicoloEntity" minOccurs="0"/>
 *         &lt;element name="FascVisibility" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseVisibility" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateFascicoloInput", propOrder = {
    "campiTipoFascColl",
    "checkUserWithPrivacy",
    "fascEntity",
    "fascVisibility"
})
public class UpdateFascicoloInput
    extends BaseInput
{

    @XmlElement(name = "CampiTipoFascColl", nillable = true)
    protected ArrayOfCampiTipoFascicoloValue campiTipoFascColl;
    @XmlElement(name = "CheckUserWithPrivacy")
    protected Boolean checkUserWithPrivacy;
    @XmlElement(name = "FascEntity", nillable = true)
    protected FascicoloEntity fascEntity;
    @XmlElement(name = "FascVisibility", nillable = true)
    protected BaseVisibility fascVisibility;

    /**
     * Gets the value of the campiTipoFascColl property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCampiTipoFascicoloValue }
     *     
     */
    public ArrayOfCampiTipoFascicoloValue getCampiTipoFascColl() {
        return campiTipoFascColl;
    }

    /**
     * Sets the value of the campiTipoFascColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCampiTipoFascicoloValue }
     *     
     */
    public void setCampiTipoFascColl(ArrayOfCampiTipoFascicoloValue value) {
        this.campiTipoFascColl = value;
    }

    /**
     * Gets the value of the checkUserWithPrivacy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckUserWithPrivacy() {
        return checkUserWithPrivacy;
    }

    /**
     * Sets the value of the checkUserWithPrivacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckUserWithPrivacy(Boolean value) {
        this.checkUserWithPrivacy = value;
    }

    /**
     * Gets the value of the fascEntity property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloEntity }
     *     
     */
    public FascicoloEntity getFascEntity() {
        return fascEntity;
    }

    /**
     * Sets the value of the fascEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloEntity }
     *     
     */
    public void setFascEntity(FascicoloEntity value) {
        this.fascEntity = value;
    }

    /**
     * Gets the value of the fascVisibility property.
     * 
     * @return
     *     possible object is
     *     {@link BaseVisibility }
     *     
     */
    public BaseVisibility getFascVisibility() {
        return fascVisibility;
    }

    /**
     * Sets the value of the fascVisibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseVisibility }
     *     
     */
    public void setFascVisibility(BaseVisibility value) {
        this.fascVisibility = value;
    }

}
