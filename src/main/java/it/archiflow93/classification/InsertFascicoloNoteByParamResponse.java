
package it.archiflow93.classification;

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
 *         &lt;element name="InsertFascicoloNoteByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}InsertFascicoloNoteOutput" minOccurs="0"/>
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
    "insertFascicoloNoteByParamResult"
})
@XmlRootElement(name = "InsertFascicoloNoteByParamResponse", namespace = "http://tempuri.org/")
public class InsertFascicoloNoteByParamResponse {

    @XmlElement(name = "InsertFascicoloNoteByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected InsertFascicoloNoteOutput insertFascicoloNoteByParamResult;

    /**
     * Gets the value of the insertFascicoloNoteByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsertFascicoloNoteOutput }
     *     
     */
    public InsertFascicoloNoteOutput getInsertFascicoloNoteByParamResult() {
        return insertFascicoloNoteByParamResult;
    }

    /**
     * Sets the value of the insertFascicoloNoteByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertFascicoloNoteOutput }
     *     
     */
    public void setInsertFascicoloNoteByParamResult(InsertFascicoloNoteOutput value) {
        this.insertFascicoloNoteByParamResult = value;
    }

}
