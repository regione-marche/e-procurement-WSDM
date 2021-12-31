
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsertListItemAdditivesResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="newListItemId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "insertListItemAdditivesResult",
    "newListItemId"
})
@XmlRootElement(name = "InsertListItemAdditivesResponse")
public class InsertListItemAdditivesResponse {

    @XmlElement(name = "InsertListItemAdditivesResult")
    protected ResultInfo insertListItemAdditivesResult;
    protected Integer newListItemId;

    /**
     * Gets the value of the insertListItemAdditivesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getInsertListItemAdditivesResult() {
        return insertListItemAdditivesResult;
    }

    /**
     * Sets the value of the insertListItemAdditivesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setInsertListItemAdditivesResult(ResultInfo value) {
        this.insertListItemAdditivesResult = value;
    }

    /**
     * Gets the value of the newListItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewListItemId() {
        return newListItemId;
    }

    /**
     * Sets the value of the newListItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewListItemId(Integer value) {
        this.newListItemId = value;
    }

}
