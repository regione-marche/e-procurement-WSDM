
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
 *         &lt;element name="InsertCabinetResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="newCabinetId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "insertCabinetResult",
    "newCabinetId"
})
@XmlRootElement(name = "InsertCabinetResponse")
public class InsertCabinetResponse {

    @XmlElement(name = "InsertCabinetResult")
    protected ResultInfo insertCabinetResult;
    protected Integer newCabinetId;

    /**
     * Gets the value of the insertCabinetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getInsertCabinetResult() {
        return insertCabinetResult;
    }

    /**
     * Sets the value of the insertCabinetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setInsertCabinetResult(ResultInfo value) {
        this.insertCabinetResult = value;
    }

    /**
     * Gets the value of the newCabinetId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewCabinetId() {
        return newCabinetId;
    }

    /**
     * Sets the value of the newCabinetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewCabinetId(Integer value) {
        this.newCabinetId = value;
    }

}
