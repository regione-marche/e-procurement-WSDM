
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
 *         &lt;element name="ImportDocumentByParamResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ImportDocumentByParamOutput" minOccurs="0"/>
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
    "importDocumentByParamResult"
})
@XmlRootElement(name = "ImportDocumentByParamResponse")
public class ImportDocumentByParamResponse {

    @XmlElement(name = "ImportDocumentByParamResult", nillable = true)
    protected ImportDocumentByParamOutput importDocumentByParamResult;

    /**
     * Gets the value of the importDocumentByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link ImportDocumentByParamOutput }
     *     
     */
    public ImportDocumentByParamOutput getImportDocumentByParamResult() {
        return importDocumentByParamResult;
    }

    /**
     * Sets the value of the importDocumentByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportDocumentByParamOutput }
     *     
     */
    public void setImportDocumentByParamResult(ImportDocumentByParamOutput value) {
        this.importDocumentByParamResult = value;
    }

}
