
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.FascicoloIdentifier;
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
 *         &lt;element name="InsertFascicolo2Result" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="pFascId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier}FascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="openData" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="strCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "insertFascicolo2Result",
    "pFascId",
    "openData",
    "strCode"
})
@XmlRootElement(name = "InsertFascicolo2Response")
public class InsertFascicolo2Response {

    @XmlElement(name = "InsertFascicolo2Result")
    protected ResultInfo insertFascicolo2Result;
    @XmlElementRef(name = "pFascId", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<FascicoloIdentifier> pFascId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openData;
    @XmlElementRef(name = "strCode", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> strCode;

    /**
     * Gets the value of the insertFascicolo2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getInsertFascicolo2Result() {
        return insertFascicolo2Result;
    }

    /**
     * Sets the value of the insertFascicolo2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setInsertFascicolo2Result(ResultInfo value) {
        this.insertFascicolo2Result = value;
    }

    /**
     * Gets the value of the pFascId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}
     *     
     */
    public JAXBElement<FascicoloIdentifier> getPFascId() {
        return pFascId;
    }

    /**
     * Sets the value of the pFascId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}
     *     
     */
    public void setPFascId(JAXBElement<FascicoloIdentifier> value) {
        this.pFascId = ((JAXBElement<FascicoloIdentifier> ) value);
    }

    /**
     * Gets the value of the openData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpenData() {
        return openData;
    }

    /**
     * Sets the value of the openData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpenData(XMLGregorianCalendar value) {
        this.openData = value;
    }

    /**
     * Gets the value of the strCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrCode() {
        return strCode;
    }

    /**
     * Sets the value of the strCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrCode(JAXBElement<String> value) {
        this.strCode = ((JAXBElement<String> ) value);
    }

}
