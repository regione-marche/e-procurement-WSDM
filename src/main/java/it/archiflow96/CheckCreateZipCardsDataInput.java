
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckCreateZipCardsDataInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckCreateZipCardsDataInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="ZipOperationId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckCreateZipCardsDataInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "zipOperationId"
})
public class CheckCreateZipCardsDataInput
    extends BaseInput
{

    @XmlElement(name = "ZipOperationId")
    protected String zipOperationId;

    /**
     * Gets the value of the zipOperationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipOperationId() {
        return zipOperationId;
    }

    /**
     * Sets the value of the zipOperationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipOperationId(String value) {
        this.zipOperationId = value;
    }

}
