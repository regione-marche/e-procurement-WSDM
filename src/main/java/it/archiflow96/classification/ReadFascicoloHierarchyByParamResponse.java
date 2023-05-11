
package it.archiflow96.classification;

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
 *         &lt;element name="ReadFascicoloHierarchyByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}ReadFascicoloHierarchyOutput" minOccurs="0"/>
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
    "readFascicoloHierarchyByParamResult"
})
@XmlRootElement(name = "ReadFascicoloHierarchyByParamResponse", namespace = "http://tempuri.org/")
public class ReadFascicoloHierarchyByParamResponse {

    @XmlElement(name = "ReadFascicoloHierarchyByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReadFascicoloHierarchyOutput readFascicoloHierarchyByParamResult;

    /**
     * Gets the value of the readFascicoloHierarchyByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadFascicoloHierarchyOutput }
     *     
     */
    public ReadFascicoloHierarchyOutput getReadFascicoloHierarchyByParamResult() {
        return readFascicoloHierarchyByParamResult;
    }

    /**
     * Sets the value of the readFascicoloHierarchyByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadFascicoloHierarchyOutput }
     *     
     */
    public void setReadFascicoloHierarchyByParamResult(ReadFascicoloHierarchyOutput value) {
        this.readFascicoloHierarchyByParamResult = value;
    }

}
