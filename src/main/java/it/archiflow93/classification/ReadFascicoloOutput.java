
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadFascicoloOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadFascicoloOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="FascColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}ArrayOfFascicoloEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadFascicoloOutput", propOrder = {
    "fascColl"
})
public class ReadFascicoloOutput
    extends BaseOutput
{

    @XmlElement(name = "FascColl", nillable = true)
    protected ArrayOfFascicoloEntity fascColl;

    /**
     * Gets the value of the fascColl property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFascicoloEntity }
     *     
     */
    public ArrayOfFascicoloEntity getFascColl() {
        return fascColl;
    }

    /**
     * Sets the value of the fascColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFascicoloEntity }
     *     
     */
    public void setFascColl(ArrayOfFascicoloEntity value) {
        this.fascColl = value;
    }

}
