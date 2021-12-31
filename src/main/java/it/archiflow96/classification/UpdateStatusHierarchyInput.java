
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateStatusHierarchyInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateStatusHierarchyInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="Pk" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.Identifier}TitolarioItemIdentifier" minOccurs="0"/>
 *         &lt;element name="StatusId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateStatusHierarchyInput", propOrder = {
    "pk",
    "statusId"
})
public class UpdateStatusHierarchyInput
    extends BaseInput
{

    @XmlElement(name = "Pk", nillable = true)
    protected TitolarioItemIdentifier pk;
    @XmlElement(name = "StatusId")
    protected Integer statusId;

    /**
     * Gets the value of the pk property.
     * 
     * @return
     *     possible object is
     *     {@link TitolarioItemIdentifier }
     *     
     */
    public TitolarioItemIdentifier getPk() {
        return pk;
    }

    /**
     * Sets the value of the pk property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitolarioItemIdentifier }
     *     
     */
    public void setPk(TitolarioItemIdentifier value) {
        this.pk = value;
    }

    /**
     * Gets the value of the statusId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatusId() {
        return statusId;
    }

    /**
     * Sets the value of the statusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatusId(Integer value) {
        this.statusId = value;
    }

}
