
package it.iride.wsprotocollodm;

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
 *         &lt;element name="CollegaDocumentoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "collegaDocumentoResult"
})
@XmlRootElement(name = "CollegaDocumentoResponse")
public class CollegaDocumentoResponse {

    @XmlElement(name = "CollegaDocumentoResult")
    protected String collegaDocumentoResult;

    /**
     * Gets the value of the collegaDocumentoResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollegaDocumentoResult() {
        return collegaDocumentoResult;
    }

    /**
     * Sets the value of the collegaDocumentoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollegaDocumentoResult(String value) {
        this.collegaDocumentoResult = value;
    }

}
