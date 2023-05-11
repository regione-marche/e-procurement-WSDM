
package it.jiride.docwsfascicolisoap;

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
 *         &lt;element name="Contesto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDFascicolo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MetadatiStr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConnectionString" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "contesto",
    "idFascicolo",
    "metadatiStr",
    "connectionString"
})
@XmlRootElement(name = "InserisciMetadati")
public class InserisciMetadati {

    @XmlElement(name = "Contesto", required = true)
    protected String contesto;
    @XmlElement(name = "IDFascicolo", required = true)
    protected String idFascicolo;
    @XmlElement(name = "MetadatiStr", required = true)
    protected String metadatiStr;
    @XmlElement(name = "ConnectionString", required = true)
    protected String connectionString;

    /**
     * Gets the value of the contesto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContesto() {
        return contesto;
    }

    /**
     * Sets the value of the contesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContesto(String value) {
        this.contesto = value;
    }

    /**
     * Gets the value of the idFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDFascicolo() {
        return idFascicolo;
    }

    /**
     * Sets the value of the idFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDFascicolo(String value) {
        this.idFascicolo = value;
    }

    /**
     * Gets the value of the metadatiStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadatiStr() {
        return metadatiStr;
    }

    /**
     * Sets the value of the metadatiStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadatiStr(String value) {
        this.metadatiStr = value;
    }

    /**
     * Gets the value of the connectionString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionString() {
        return connectionString;
    }

    /**
     * Sets the value of the connectionString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionString(String value) {
        this.connectionString = value;
    }

}
