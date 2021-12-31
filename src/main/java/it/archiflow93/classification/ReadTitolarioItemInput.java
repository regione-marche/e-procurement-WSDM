
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadTitolarioItemInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadTitolarioItemInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="Pk" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.Identifier}TitolarioItemIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadTitolarioItemInput", propOrder = {
    "pk"
})
public class ReadTitolarioItemInput
    extends BaseInput
{

    @XmlElement(name = "Pk", nillable = true)
    protected TitolarioItemIdentifier pk;

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

}
