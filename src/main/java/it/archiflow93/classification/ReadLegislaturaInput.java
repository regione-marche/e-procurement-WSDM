
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadLegislaturaInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadLegislaturaInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="LegisId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}LegislaturaIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadLegislaturaInput", propOrder = {
    "legisId"
})
public class ReadLegislaturaInput
    extends BaseInput
{

    @XmlElement(name = "LegisId", nillable = true)
    protected LegislaturaIdentifier legisId;

    /**
     * Gets the value of the legisId property.
     * 
     * @return
     *     possible object is
     *     {@link LegislaturaIdentifier }
     *     
     */
    public LegislaturaIdentifier getLegisId() {
        return legisId;
    }

    /**
     * Sets the value of the legisId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegislaturaIdentifier }
     *     
     */
    public void setLegisId(LegislaturaIdentifier value) {
        this.legisId = value;
    }

}
