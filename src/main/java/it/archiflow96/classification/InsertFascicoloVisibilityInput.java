
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertFascicoloVisibilityInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertFascicoloVisibilityInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="BaseVis" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseVisibility" minOccurs="0"/>
 *         &lt;element name="FascId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier}FascicoloIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertFascicoloVisibilityInput", propOrder = {
    "baseVis",
    "fascId"
})
public class InsertFascicoloVisibilityInput
    extends BaseInput
{

    @XmlElement(name = "BaseVis", nillable = true)
    protected BaseVisibility baseVis;
    @XmlElement(name = "FascId", nillable = true)
    protected FascicoloIdentifier fascId;

    /**
     * Gets the value of the baseVis property.
     * 
     * @return
     *     possible object is
     *     {@link BaseVisibility }
     *     
     */
    public BaseVisibility getBaseVis() {
        return baseVis;
    }

    /**
     * Sets the value of the baseVis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseVisibility }
     *     
     */
    public void setBaseVis(BaseVisibility value) {
        this.baseVis = value;
    }

    /**
     * Gets the value of the fascId property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public FascicoloIdentifier getFascId() {
        return fascId;
    }

    /**
     * Sets the value of the fascId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public void setFascId(FascicoloIdentifier value) {
        this.fascId = value;
    }

}
