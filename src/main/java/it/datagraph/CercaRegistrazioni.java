
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
 *         &lt;element name="Criteri" type="{http://tempuri.org/}CriteriRicerca" minOccurs="0"/>
 *         &lt;element name="strDST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "criteri",
    "strDST"
})
@XmlRootElement(name = "CercaRegistrazioni")
public class CercaRegistrazioni {

    @XmlElement(name = "Criteri")
    protected CriteriRicerca criteri;
    protected String strDST;

    /**
     * Gets the value of the criteri property.
     * 
     * @return
     *     possible object is
     *     {@link CriteriRicerca }
     *     
     */
    public CriteriRicerca getCriteri() {
        return criteri;
    }

    /**
     * Sets the value of the criteri property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriRicerca }
     *     
     */
    public void setCriteri(CriteriRicerca value) {
        this.criteri = value;
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

}
