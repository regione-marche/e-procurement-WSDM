
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
 *         &lt;element name="GetContacts2Result" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="agrafCards" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject}ArrayOfAgrafCard" minOccurs="0"/>
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
    "getContacts2Result",
    "agrafCards"
})
@XmlRootElement(name = "GetContacts2Response")
public class GetContacts2Response {

    @XmlElement(name = "GetContacts2Result")
    protected ResultInfo getContacts2Result;
    @XmlElement(nillable = true)
    protected ArrayOfAgrafCard agrafCards;

    /**
     * Gets the value of the getContacts2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetContacts2Result() {
        return getContacts2Result;
    }

    /**
     * Sets the value of the getContacts2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetContacts2Result(ResultInfo value) {
        this.getContacts2Result = value;
    }

    /**
     * Gets the value of the agrafCards property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAgrafCard }
     *     
     */
    public ArrayOfAgrafCard getAgrafCards() {
        return agrafCards;
    }

    /**
     * Sets the value of the agrafCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAgrafCard }
     *     
     */
    public void setAgrafCards(ArrayOfAgrafCard value) {
        this.agrafCards = value;
    }

}
