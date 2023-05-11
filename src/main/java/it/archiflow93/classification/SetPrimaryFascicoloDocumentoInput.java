
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetPrimaryFascicoloDocumentoInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetPrimaryFascicoloDocumentoInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="FascDocId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicolo.Identifier}FascicoloDocIdentifier" minOccurs="0"/>
 *         &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetPrimaryFascicoloDocumentoInput", propOrder = {
    "fascDocId",
    "primary"
})
public class SetPrimaryFascicoloDocumentoInput
    extends BaseInput
{

    @XmlElement(name = "FascDocId", nillable = true)
    protected FascicoloDocIdentifier fascDocId;
    @XmlElement(name = "Primary")
    protected Boolean primary;

    /**
     * Gets the value of the fascDocId property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloDocIdentifier }
     *     
     */
    public FascicoloDocIdentifier getFascDocId() {
        return fascDocId;
    }

    /**
     * Sets the value of the fascDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloDocIdentifier }
     *     
     */
    public void setFascDocId(FascicoloDocIdentifier value) {
        this.fascDocId = value;
    }

    /**
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimary(Boolean value) {
        this.primary = value;
    }

}
