
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFascicoloToPreserveOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFascicoloToPreserveOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="Fascicoli" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}ArrayOfFascicoloPreservation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFascicoloToPreserveOutput", propOrder = {
    "fascicoli"
})
public class GetFascicoloToPreserveOutput
    extends BaseOutput
{

    @XmlElement(name = "Fascicoli", nillable = true)
    protected ArrayOfFascicoloPreservation fascicoli;

    /**
     * Gets the value of the fascicoli property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFascicoloPreservation }
     *     
     */
    public ArrayOfFascicoloPreservation getFascicoli() {
        return fascicoli;
    }

    /**
     * Sets the value of the fascicoli property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFascicoloPreservation }
     *     
     */
    public void setFascicoli(ArrayOfFascicoloPreservation value) {
        this.fascicoli = value;
    }

}
