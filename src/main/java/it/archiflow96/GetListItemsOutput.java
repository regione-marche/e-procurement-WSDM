
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetListItemsOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetListItemsOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="IndexItems" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfListItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetListItemsOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "indexItems"
})
public class GetListItemsOutput
    extends BaseOutput
{

    @XmlElement(name = "IndexItems", nillable = true)
    protected ArrayOfListItem indexItems;

    /**
     * Gets the value of the indexItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfListItem }
     *     
     */
    public ArrayOfListItem getIndexItems() {
        return indexItems;
    }

    /**
     * Sets the value of the indexItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfListItem }
     *     
     */
    public void setIndexItems(ArrayOfListItem value) {
        this.indexItems = value;
    }

}
