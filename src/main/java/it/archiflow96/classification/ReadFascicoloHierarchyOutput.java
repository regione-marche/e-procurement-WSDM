
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadFascicoloHierarchyOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadFascicoloHierarchyOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="FascHierarchyColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}ArrayOfBaseFascicolo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadFascicoloHierarchyOutput", propOrder = {
    "fascHierarchyColl"
})
public class ReadFascicoloHierarchyOutput
    extends BaseOutput
{

    @XmlElement(name = "FascHierarchyColl", nillable = true)
    protected ArrayOfBaseFascicolo fascHierarchyColl;

    /**
     * Gets the value of the fascHierarchyColl property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseFascicolo }
     *     
     */
    public ArrayOfBaseFascicolo getFascHierarchyColl() {
        return fascHierarchyColl;
    }

    /**
     * Sets the value of the fascHierarchyColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseFascicolo }
     *     
     */
    public void setFascHierarchyColl(ArrayOfBaseFascicolo value) {
        this.fascHierarchyColl = value;
    }

}
