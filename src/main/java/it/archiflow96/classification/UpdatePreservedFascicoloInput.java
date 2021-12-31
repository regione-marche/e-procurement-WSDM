
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdatePreservedFascicoloInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdatePreservedFascicoloInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="FascicoloPreservationStatusCollection" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}ArrayOfFascicoloPreservationStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatePreservedFascicoloInput", propOrder = {
    "fascicoloPreservationStatusCollection"
})
public class UpdatePreservedFascicoloInput
    extends BaseInput
{

    @XmlElement(name = "FascicoloPreservationStatusCollection", nillable = true)
    protected ArrayOfFascicoloPreservationStatus fascicoloPreservationStatusCollection;

    /**
     * Gets the value of the fascicoloPreservationStatusCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFascicoloPreservationStatus }
     *     
     */
    public ArrayOfFascicoloPreservationStatus getFascicoloPreservationStatusCollection() {
        return fascicoloPreservationStatusCollection;
    }

    /**
     * Sets the value of the fascicoloPreservationStatusCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFascicoloPreservationStatus }
     *     
     */
    public void setFascicoloPreservationStatusCollection(ArrayOfFascicoloPreservationStatus value) {
        this.fascicoloPreservationStatusCollection = value;
    }

}
