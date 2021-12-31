
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadTitolarioItemOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadTitolarioItemOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="ReturnValue" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.ValueObject}TitolarioItemEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadTitolarioItemOutput", propOrder = {
    "returnValue"
})
public class ReadTitolarioItemOutput
    extends BaseOutput
{

    @XmlElement(name = "ReturnValue", nillable = true)
    protected TitolarioItemEntity returnValue;

    /**
     * Gets the value of the returnValue property.
     * 
     * @return
     *     possible object is
     *     {@link TitolarioItemEntity }
     *     
     */
    public TitolarioItemEntity getReturnValue() {
        return returnValue;
    }

    /**
     * Sets the value of the returnValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitolarioItemEntity }
     *     
     */
    public void setReturnValue(TitolarioItemEntity value) {
        this.returnValue = value;
    }

}
