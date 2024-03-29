
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadBaseFascicoloOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadBaseFascicoloOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="BaseFascColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}ArrayOfBaseFascicolo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadBaseFascicoloOutput", propOrder = {
    "baseFascColl"
})
public class ReadBaseFascicoloOutput
    extends BaseOutput
{

    @XmlElement(name = "BaseFascColl", nillable = true)
    protected ArrayOfBaseFascicolo baseFascColl;

    /**
     * Gets the value of the baseFascColl property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseFascicolo }
     *     
     */
    public ArrayOfBaseFascicolo getBaseFascColl() {
        return baseFascColl;
    }

    /**
     * Sets the value of the baseFascColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseFascicolo }
     *     
     */
    public void setBaseFascColl(ArrayOfBaseFascicolo value) {
        this.baseFascColl = value;
    }

}
