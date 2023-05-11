
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
 *         &lt;element name="GetFascicoloResult" type="{http://tempuri.org/}FascicoloRet" minOccurs="0"/>
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
    "getFascicoloResult"
})
@XmlRootElement(name = "GetFascicoloResponse")
public class GetFascicoloResponse {

    @XmlElement(name = "GetFascicoloResult")
    protected FascicoloRet getFascicoloResult;

    /**
     * Gets the value of the getFascicoloResult property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloRet }
     *     
     */
    public FascicoloRet getGetFascicoloResult() {
        return getFascicoloResult;
    }

    /**
     * Sets the value of the getFascicoloResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloRet }
     *     
     */
    public void setGetFascicoloResult(FascicoloRet value) {
        this.getFascicoloResult = value;
    }

}
