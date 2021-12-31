
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.ArrayOfCampiTipoFascicoloValue;
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
 *         &lt;element name="ReadValoreCampiTipoFascicoloResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="pCampitipoFascColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}ArrayOfCampiTipoFascicoloValue" minOccurs="0"/>
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
    "readValoreCampiTipoFascicoloResult",
    "pCampitipoFascColl"
})
@XmlRootElement(name = "ReadValoreCampiTipoFascicoloResponse")
public class ReadValoreCampiTipoFascicoloResponse {

    @XmlElement(name = "ReadValoreCampiTipoFascicoloResult")
    protected ResultInfo readValoreCampiTipoFascicoloResult;
    @XmlElementRef(name = "pCampitipoFascColl", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCampiTipoFascicoloValue> pCampitipoFascColl;

    /**
     * Gets the value of the readValoreCampiTipoFascicoloResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getReadValoreCampiTipoFascicoloResult() {
        return readValoreCampiTipoFascicoloResult;
    }

    /**
     * Sets the value of the readValoreCampiTipoFascicoloResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setReadValoreCampiTipoFascicoloResult(ResultInfo value) {
        this.readValoreCampiTipoFascicoloResult = value;
    }

    /**
     * Gets the value of the pCampitipoFascColl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCampiTipoFascicoloValue }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCampiTipoFascicoloValue> getPCampitipoFascColl() {
        return pCampitipoFascColl;
    }

    /**
     * Sets the value of the pCampitipoFascColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCampiTipoFascicoloValue }{@code >}
     *     
     */
    public void setPCampitipoFascColl(JAXBElement<ArrayOfCampiTipoFascicoloValue> value) {
        this.pCampitipoFascColl = ((JAXBElement<ArrayOfCampiTipoFascicoloValue> ) value);
    }

}
