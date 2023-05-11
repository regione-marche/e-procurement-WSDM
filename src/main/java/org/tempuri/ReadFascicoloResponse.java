
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.ArrayOfFascicoloEntity;
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
 *         &lt;element name="ReadFascicoloResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="pFascColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}ArrayOfFascicoloEntity" minOccurs="0"/>
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
    "readFascicoloResult",
    "pFascColl"
})
@XmlRootElement(name = "ReadFascicoloResponse")
public class ReadFascicoloResponse {

    @XmlElement(name = "ReadFascicoloResult")
    protected ResultInfo readFascicoloResult;
    @XmlElementRef(name = "pFascColl", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfFascicoloEntity> pFascColl;

    /**
     * Gets the value of the readFascicoloResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getReadFascicoloResult() {
        return readFascicoloResult;
    }

    /**
     * Sets the value of the readFascicoloResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setReadFascicoloResult(ResultInfo value) {
        this.readFascicoloResult = value;
    }

    /**
     * Gets the value of the pFascColl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFascicoloEntity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFascicoloEntity> getPFascColl() {
        return pFascColl;
    }

    /**
     * Sets the value of the pFascColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFascicoloEntity }{@code >}
     *     
     */
    public void setPFascColl(JAXBElement<ArrayOfFascicoloEntity> value) {
        this.pFascColl = ((JAXBElement<ArrayOfFascicoloEntity> ) value);
    }

}
