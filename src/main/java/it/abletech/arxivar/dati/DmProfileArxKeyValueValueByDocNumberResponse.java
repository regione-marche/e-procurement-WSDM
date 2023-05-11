
package it.abletech.arxivar.dati;

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
 *         &lt;element name="Dm_Profile_Arx_KeyValueValue_By_DocNumberResult" type="{http://www.Abletech.it/Arxivar}ArrayOfArx_KeyValueValue_GenericOfStringStringObject" minOccurs="0"/>
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
    "dmProfileArxKeyValueValueByDocNumberResult"
})
@XmlRootElement(name = "Dm_Profile_Arx_KeyValueValue_By_DocNumberResponse")
public class DmProfileArxKeyValueValueByDocNumberResponse {

    @XmlElement(name = "Dm_Profile_Arx_KeyValueValue_By_DocNumberResult")
    protected ArrayOfArxKeyValueValueGenericOfStringStringObject dmProfileArxKeyValueValueByDocNumberResult;

    /**
     * Gets the value of the dmProfileArxKeyValueValueByDocNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArxKeyValueValueGenericOfStringStringObject }
     *     
     */
    public ArrayOfArxKeyValueValueGenericOfStringStringObject getDmProfileArxKeyValueValueByDocNumberResult() {
        return dmProfileArxKeyValueValueByDocNumberResult;
    }

    /**
     * Sets the value of the dmProfileArxKeyValueValueByDocNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArxKeyValueValueGenericOfStringStringObject }
     *     
     */
    public void setDmProfileArxKeyValueValueByDocNumberResult(ArrayOfArxKeyValueValueGenericOfStringStringObject value) {
        this.dmProfileArxKeyValueValueByDocNumberResult = value;
    }

}
