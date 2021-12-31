
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertDifformitaInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertDifformitaInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="TipoFascDiffColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject}ArrayOfTipoFascDiffValue" minOccurs="0"/>
 *         &lt;element name="TipoFascId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier}TipoFascicoloIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertDifformitaInput", propOrder = {
    "tipoFascDiffColl",
    "tipoFascId"
})
public class InsertDifformitaInput
    extends BaseInput
{

    @XmlElement(name = "TipoFascDiffColl", nillable = true)
    protected ArrayOfTipoFascDiffValue tipoFascDiffColl;
    @XmlElement(name = "TipoFascId", nillable = true)
    protected TipoFascicoloIdentifier tipoFascId;

    /**
     * Gets the value of the tipoFascDiffColl property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTipoFascDiffValue }
     *     
     */
    public ArrayOfTipoFascDiffValue getTipoFascDiffColl() {
        return tipoFascDiffColl;
    }

    /**
     * Sets the value of the tipoFascDiffColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTipoFascDiffValue }
     *     
     */
    public void setTipoFascDiffColl(ArrayOfTipoFascDiffValue value) {
        this.tipoFascDiffColl = value;
    }

    /**
     * Gets the value of the tipoFascId property.
     * 
     * @return
     *     possible object is
     *     {@link TipoFascicoloIdentifier }
     *     
     */
    public TipoFascicoloIdentifier getTipoFascId() {
        return tipoFascId;
    }

    /**
     * Sets the value of the tipoFascId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFascicoloIdentifier }
     *     
     */
    public void setTipoFascId(TipoFascicoloIdentifier value) {
        this.tipoFascId = value;
    }

}
