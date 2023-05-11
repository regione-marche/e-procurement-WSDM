
package it.datagraph;

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
 *         &lt;element name="strUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strDST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceRepertorio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segnaturaXMLbase64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "strUserName",
    "strDST",
    "codiceRepertorio",
    "segnaturaXMLbase64"
})
@XmlRootElement(name = "RegistrazioneRepertorioBase64")
public class RegistrazioneRepertorioBase64 {

    protected String strUserName;
    protected String strDST;
    @XmlElement(name = "CodiceRepertorio")
    protected String codiceRepertorio;
    protected String segnaturaXMLbase64;

    /**
     * Gets the value of the strUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrUserName() {
        return strUserName;
    }

    /**
     * Sets the value of the strUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrUserName(String value) {
        this.strUserName = value;
    }

    /**
     * Gets the value of the strDST property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDST() {
        return strDST;
    }

    /**
     * Sets the value of the strDST property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDST(String value) {
        this.strDST = value;
    }

    /**
     * Gets the value of the codiceRepertorio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceRepertorio() {
        return codiceRepertorio;
    }

    /**
     * Sets the value of the codiceRepertorio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceRepertorio(String value) {
        this.codiceRepertorio = value;
    }

    /**
     * Gets the value of the segnaturaXMLbase64 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegnaturaXMLbase64() {
        return segnaturaXMLbase64;
    }

    /**
     * Sets the value of the segnaturaXMLbase64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegnaturaXMLbase64(String value) {
        this.segnaturaXMLbase64 = value;
    }

}
