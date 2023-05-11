
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadFascicoloVisibilityOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadFascicoloVisibilityOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="BaseVis" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseVisibility" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadFascicoloVisibilityOutput", propOrder = {
    "baseVis"
})
public class ReadFascicoloVisibilityOutput
    extends BaseOutput
{

    @XmlElement(name = "BaseVis", nillable = true)
    protected BaseVisibility baseVis;

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

}
