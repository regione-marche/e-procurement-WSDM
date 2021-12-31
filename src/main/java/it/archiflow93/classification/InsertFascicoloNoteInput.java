
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertFascicoloNoteInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertFascicoloNoteInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="BaseNote" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseNote" minOccurs="0"/>
 *         &lt;element name="FascId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier}FascicoloIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertFascicoloNoteInput", propOrder = {
    "baseNote",
    "fascId"
})
public class InsertFascicoloNoteInput
    extends BaseInput
{

    @XmlElement(name = "BaseNote", nillable = true)
    protected BaseNote baseNote;
    @XmlElement(name = "FascId", nillable = true)
    protected FascicoloIdentifier fascId;

    /**
     * Gets the value of the baseNote property.
     * 
     * @return
     *     possible object is
     *     {@link BaseNote }
     *     
     */
    public BaseNote getBaseNote() {
        return baseNote;
    }

    /**
     * Sets the value of the baseNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseNote }
     *     
     */
    public void setBaseNote(BaseNote value) {
        this.baseNote = value;
    }

    /**
     * Gets the value of the fascId property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public FascicoloIdentifier getFascId() {
        return fascId;
    }

    /**
     * Sets the value of the fascId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public void setFascId(FascicoloIdentifier value) {
        this.fascId = value;
    }

}
