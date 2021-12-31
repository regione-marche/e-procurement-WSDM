
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadBaseTitolarioItemCollOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadBaseTitolarioItemCollOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="ReturnValue" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.ValueObject}ArrayOfBaseTitolarioItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadBaseTitolarioItemCollOutput", propOrder = {
    "returnValue"
})
public class ReadBaseTitolarioItemCollOutput
    extends BaseOutput
{

    @XmlElement(name = "ReturnValue", nillable = true)
    protected ArrayOfBaseTitolarioItem returnValue;

    /**
     * Gets the value of the returnValue property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseTitolarioItem }
     *     
     */
    public ArrayOfBaseTitolarioItem getReturnValue() {
        return returnValue;
    }

    /**
     * Sets the value of the returnValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseTitolarioItem }
     *     
     */
    public void setReturnValue(ArrayOfBaseTitolarioItem value) {
        this.returnValue = value;
    }

}
