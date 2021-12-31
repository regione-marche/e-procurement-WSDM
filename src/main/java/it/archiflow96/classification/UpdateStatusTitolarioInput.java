
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateStatusTitolarioInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateStatusTitolarioInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}TypeIdentifierComplete" minOccurs="0"/>
 *         &lt;element name="Titolario_Id" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Identifier}TitolarioIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateStatusTitolarioInput", propOrder = {
    "status",
    "titolarioId"
})
public class UpdateStatusTitolarioInput
    extends BaseInput
{

    @XmlElement(name = "Status", nillable = true)
    protected TypeIdentifierComplete status;
    @XmlElement(name = "Titolario_Id", nillable = true)
    protected TitolarioIdentifier titolarioId;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TypeIdentifierComplete }
     *     
     */
    public TypeIdentifierComplete getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeIdentifierComplete }
     *     
     */
    public void setStatus(TypeIdentifierComplete value) {
        this.status = value;
    }

    /**
     * Gets the value of the titolarioId property.
     * 
     * @return
     *     possible object is
     *     {@link TitolarioIdentifier }
     *     
     */
    public TitolarioIdentifier getTitolarioId() {
        return titolarioId;
    }

    /**
     * Sets the value of the titolarioId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitolarioIdentifier }
     *     
     */
    public void setTitolarioId(TitolarioIdentifier value) {
        this.titolarioId = value;
    }

}
