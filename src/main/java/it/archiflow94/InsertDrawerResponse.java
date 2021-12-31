
package it.archiflow94;

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
 *         &lt;element name="InsertDrawerResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="newDrawerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "insertDrawerResult",
    "newDrawerId"
})
@XmlRootElement(name = "InsertDrawerResponse")
public class InsertDrawerResponse {

    @XmlElement(name = "InsertDrawerResult")
    protected ResultInfo insertDrawerResult;
    protected Integer newDrawerId;

    /**
     * Gets the value of the insertDrawerResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getInsertDrawerResult() {
        return insertDrawerResult;
    }

    /**
     * Sets the value of the insertDrawerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setInsertDrawerResult(ResultInfo value) {
        this.insertDrawerResult = value;
    }

    /**
     * Gets the value of the newDrawerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewDrawerId() {
        return newDrawerId;
    }

    /**
     * Sets the value of the newDrawerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewDrawerId(Integer value) {
        this.newDrawerId = value;
    }

}
