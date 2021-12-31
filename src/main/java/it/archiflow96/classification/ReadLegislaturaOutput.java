
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadLegislaturaOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadLegislaturaOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="LegisColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}ArrayOfLegislatura" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadLegislaturaOutput", propOrder = {
    "legisColl"
})
public class ReadLegislaturaOutput
    extends BaseOutput
{

    @XmlElement(name = "LegisColl", nillable = true)
    protected ArrayOfLegislatura legisColl;

    /**
     * Gets the value of the legisColl property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLegislatura }
     *     
     */
    public ArrayOfLegislatura getLegisColl() {
        return legisColl;
    }

    /**
     * Sets the value of the legisColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLegislatura }
     *     
     */
    public void setLegisColl(ArrayOfLegislatura value) {
        this.legisColl = value;
    }

}
