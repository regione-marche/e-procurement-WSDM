
package it.archiflow96;

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
 *         &lt;element name="AddContactsToCard2Result" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="nAdded" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "addContactsToCard2Result",
    "nAdded"
})
@XmlRootElement(name = "AddContactsToCard2Response")
public class AddContactsToCard2Response {

    @XmlElement(name = "AddContactsToCard2Result")
    protected ResultInfo addContactsToCard2Result;
    protected Integer nAdded;

    /**
     * Gets the value of the addContactsToCard2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getAddContactsToCard2Result() {
        return addContactsToCard2Result;
    }

    /**
     * Sets the value of the addContactsToCard2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setAddContactsToCard2Result(ResultInfo value) {
        this.addContactsToCard2Result = value;
    }

    /**
     * Gets the value of the nAdded property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNAdded() {
        return nAdded;
    }

    /**
     * Sets the value of the nAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNAdded(Integer value) {
        this.nAdded = value;
    }

}
