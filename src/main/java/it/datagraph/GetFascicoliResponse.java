
package it.datagraph;

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
 *         &lt;element name="GetFascicoliResult" type="{http://tempuri.org/}FascicoliRet" minOccurs="0"/>
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
    "getFascicoliResult"
})
@XmlRootElement(name = "GetFascicoliResponse")
public class GetFascicoliResponse {

    @XmlElement(name = "GetFascicoliResult")
    protected FascicoliRet getFascicoliResult;

    /**
     * Gets the value of the getFascicoliResult property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoliRet }
     *     
     */
    public FascicoliRet getGetFascicoliResult() {
        return getFascicoliResult;
    }

    /**
     * Sets the value of the getFascicoliResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoliRet }
     *     
     */
    public void setGetFascicoliResult(FascicoliRet value) {
        this.getFascicoliResult = value;
    }

}
