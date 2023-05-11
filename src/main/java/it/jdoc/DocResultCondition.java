
package it.jdoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocResultCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocResultCondition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WS_Operazioni}Result">
 *       &lt;sequence>
 *         &lt;element name="Condition" type="{http://schemas.datacontract.org/2004/07/WS_Operazioni}DocCondition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocResultCondition", namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", propOrder = {
    "condition"
})
public class DocResultCondition
    extends Result
{

    @XmlElement(name = "Condition", nillable = true)
    protected DocCondition condition;

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link DocCondition }
     *     
     */
    public DocCondition getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocCondition }
     *     
     */
    public void setCondition(DocCondition value) {
        this.condition = value;
    }

}
