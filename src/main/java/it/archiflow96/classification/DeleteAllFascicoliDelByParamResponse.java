
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
 *         &lt;element name="DeleteAllFascicoliDelByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}DeleteAllFascicoliDelOutput" minOccurs="0"/>
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
    "deleteAllFascicoliDelByParamResult"
})
@XmlRootElement(name = "DeleteAllFascicoliDelByParamResponse", namespace = "http://tempuri.org/")
public class DeleteAllFascicoliDelByParamResponse {

    @XmlElement(name = "DeleteAllFascicoliDelByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected DeleteAllFascicoliDelOutput deleteAllFascicoliDelByParamResult;

    /**
     * Gets the value of the deleteAllFascicoliDelByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteAllFascicoliDelOutput }
     *     
     */
    public DeleteAllFascicoliDelOutput getDeleteAllFascicoliDelByParamResult() {
        return deleteAllFascicoliDelByParamResult;
    }

    /**
     * Sets the value of the deleteAllFascicoliDelByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteAllFascicoliDelOutput }
     *     
     */
    public void setDeleteAllFascicoliDelByParamResult(DeleteAllFascicoliDelOutput value) {
        this.deleteAllFascicoliDelByParamResult = value;
    }

}
