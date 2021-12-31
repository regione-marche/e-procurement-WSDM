
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import org.datacontract.schemas._2004._07.siav_classification_entities.FascicoloDiffType;
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
 *         &lt;element name="GetClassificheValideResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="DiffType" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types}FascicoloDiffType" minOccurs="0"/>
 *         &lt;element name="ListTitItemId" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
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
    "getClassificheValideResult",
    "diffType",
    "listTitItemId"
})
@XmlRootElement(name = "GetClassificheValideResponse")
public class GetClassificheValideResponse {

    @XmlElement(name = "GetClassificheValideResult")
    protected ResultInfo getClassificheValideResult;
    @XmlElement(name = "DiffType")
    protected FascicoloDiffType diffType;
    @XmlElementRef(name = "ListTitItemId", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfint> listTitItemId;

    /**
     * Gets the value of the getClassificheValideResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetClassificheValideResult() {
        return getClassificheValideResult;
    }

    /**
     * Sets the value of the getClassificheValideResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetClassificheValideResult(ResultInfo value) {
        this.getClassificheValideResult = value;
    }

    /**
     * Gets the value of the diffType property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloDiffType }
     *     
     */
    public FascicoloDiffType getDiffType() {
        return diffType;
    }

    /**
     * Sets the value of the diffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloDiffType }
     *     
     */
    public void setDiffType(FascicoloDiffType value) {
        this.diffType = value;
    }

    /**
     * Gets the value of the listTitItemId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getListTitItemId() {
        return listTitItemId;
    }

    /**
     * Sets the value of the listTitItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setListTitItemId(JAXBElement<ArrayOfint> value) {
        this.listTitItemId = ((JAXBElement<ArrayOfint> ) value);
    }

}
