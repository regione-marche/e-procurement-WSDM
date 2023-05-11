
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertTitolarioItemInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertTitolarioItemInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.ValueObject}TitolarioItemEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertTitolarioItemInput", propOrder = {
    "value"
})
public class InsertTitolarioItemInput
    extends BaseInput
{

    @XmlElement(name = "Value", nillable = true)
    protected TitolarioItemEntity value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link TitolarioItemEntity }
     *     
     */
    public TitolarioItemEntity getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitolarioItemEntity }
     *     
     */
    public void setValue(TitolarioItemEntity value) {
        this.value = value;
    }

}
