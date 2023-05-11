
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.ArrayOfBaseFascicolo;
import org.datacontract.schemas._2004._07.siav_common_baseclass.ResultInfo;


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
 *         &lt;element name="SearchBaseFascicoloResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="pBaseFascColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}ArrayOfBaseFascicolo" minOccurs="0"/>
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
    "searchBaseFascicoloResult",
    "pBaseFascColl"
})
@XmlRootElement(name = "SearchBaseFascicoloResponse")
public class SearchBaseFascicoloResponse {

    @XmlElement(name = "SearchBaseFascicoloResult")
    protected ResultInfo searchBaseFascicoloResult;
    @XmlElementRef(name = "pBaseFascColl", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfBaseFascicolo> pBaseFascColl;

    /**
     * Gets the value of the searchBaseFascicoloResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getSearchBaseFascicoloResult() {
        return searchBaseFascicoloResult;
    }

    /**
     * Sets the value of the searchBaseFascicoloResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setSearchBaseFascicoloResult(ResultInfo value) {
        this.searchBaseFascicoloResult = value;
    }

    /**
     * Gets the value of the pBaseFascColl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBaseFascicolo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBaseFascicolo> getPBaseFascColl() {
        return pBaseFascColl;
    }

    /**
     * Sets the value of the pBaseFascColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBaseFascicolo }{@code >}
     *     
     */
    public void setPBaseFascColl(JAXBElement<ArrayOfBaseFascicolo> value) {
        this.pBaseFascColl = ((JAXBElement<ArrayOfBaseFascicolo> ) value);
    }

}
