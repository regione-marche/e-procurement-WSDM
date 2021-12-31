
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassificazioneBaseSearcher complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassificazioneBaseSearcher">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseSearcher">
 *       &lt;sequence>
 *         &lt;element name="AOOKey" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}CoupleIdentifier" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}StatusType" minOccurs="0"/>
 *         &lt;element name="UserKey" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}CoupleIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificazioneBaseSearcher", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass", propOrder = {
    "aooKey",
    "status",
    "userKey"
})
@XmlSeeAlso({
    FascicoloDocumentoSearcher.class,
    TipoFascicoloSearcher.class,
    CampiTipoFascicoloSearcher.class,
    ClassificaDocumentoSearcher.class,
    TitolarioSearcher.class,
    TitolarioTemplateSearcher.class
})
public class ClassificazioneBaseSearcher
    extends BaseSearcher
{

    @XmlElement(name = "AOOKey", nillable = true)
    protected CoupleIdentifier aooKey;
    @XmlElement(name = "Status")
    protected StatusType status;
    @XmlElement(name = "UserKey", nillable = true)
    protected CoupleIdentifier userKey;

    /**
     * Gets the value of the aooKey property.
     * 
     * @return
     *     possible object is
     *     {@link CoupleIdentifier }
     *     
     */
    public CoupleIdentifier getAOOKey() {
        return aooKey;
    }

    /**
     * Sets the value of the aooKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoupleIdentifier }
     *     
     */
    public void setAOOKey(CoupleIdentifier value) {
        this.aooKey = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the userKey property.
     * 
     * @return
     *     possible object is
     *     {@link CoupleIdentifier }
     *     
     */
    public CoupleIdentifier getUserKey() {
        return userKey;
    }

    /**
     * Sets the value of the userKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoupleIdentifier }
     *     
     */
    public void setUserKey(CoupleIdentifier value) {
        this.userKey = value;
    }

}
