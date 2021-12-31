
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
 *         &lt;element name="ReadFascicoloHierarchyResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="pFascHierarchyColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}ArrayOfBaseFascicolo" minOccurs="0"/>
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
    "readFascicoloHierarchyResult",
    "pFascHierarchyColl"
})
@XmlRootElement(name = "ReadFascicoloHierarchyResponse")
public class ReadFascicoloHierarchyResponse {

    @XmlElement(name = "ReadFascicoloHierarchyResult")
    protected ResultInfo readFascicoloHierarchyResult;
    @XmlElementRef(name = "pFascHierarchyColl", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfBaseFascicolo> pFascHierarchyColl;

    /**
     * Gets the value of the readFascicoloHierarchyResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getReadFascicoloHierarchyResult() {
        return readFascicoloHierarchyResult;
    }

    /**
     * Sets the value of the readFascicoloHierarchyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setReadFascicoloHierarchyResult(ResultInfo value) {
        this.readFascicoloHierarchyResult = value;
    }

    /**
     * Gets the value of the pFascHierarchyColl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBaseFascicolo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBaseFascicolo> getPFascHierarchyColl() {
        return pFascHierarchyColl;
    }

    /**
     * Sets the value of the pFascHierarchyColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBaseFascicolo }{@code >}
     *     
     */
    public void setPFascHierarchyColl(JAXBElement<ArrayOfBaseFascicolo> value) {
        this.pFascHierarchyColl = ((JAXBElement<ArrayOfBaseFascicolo> ) value);
    }

}
