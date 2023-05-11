
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadFascicoloNotesOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadFascicoloNotesOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="BaseNoteColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}ArrayOfBaseNote" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadFascicoloNotesOutput", propOrder = {
    "baseNoteColl"
})
public class ReadFascicoloNotesOutput
    extends BaseOutput
{

    @XmlElement(name = "BaseNoteColl", nillable = true)
    protected ArrayOfBaseNote baseNoteColl;

    /**
     * Gets the value of the baseNoteColl property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseNote }
     *     
     */
    public ArrayOfBaseNote getBaseNoteColl() {
        return baseNoteColl;
    }

    /**
     * Sets the value of the baseNoteColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseNote }
     *     
     */
    public void setBaseNoteColl(ArrayOfBaseNote value) {
        this.baseNoteColl = value;
    }

}
