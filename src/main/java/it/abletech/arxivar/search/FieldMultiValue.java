
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Field_MultiValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Field_MultiValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Field_MultiValueBase">
 *       &lt;sequence>
 *         &lt;element name="Values" type="{http://www.Abletech.it/Arxivar}ArrayOfField_String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field_MultiValue", propOrder = {
    "values"
})
public class FieldMultiValue
    extends FieldMultiValueBase
{

    @XmlElement(name = "Values")
    protected ArrayOfFieldString values;

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFieldString }
     *     
     */
    public ArrayOfFieldString getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFieldString }
     *     
     */
    public void setValues(ArrayOfFieldString value) {
        this.values = value;
    }

}
