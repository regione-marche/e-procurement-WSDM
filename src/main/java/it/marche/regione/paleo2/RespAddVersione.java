
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RespAddVersione complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RespAddVersione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdFile" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdVersione" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespAddVersione", propOrder = {
    "idFile",
    "idVersione"
})
public class RespAddVersione {

    @XmlElement(name = "IdFile")
    protected Integer idFile;
    @XmlElement(name = "IdVersione")
    protected Integer idVersione;

    /**
     * Gets the value of the idFile property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdFile() {
        return idFile;
    }

    /**
     * Sets the value of the idFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdFile(Integer value) {
        this.idFile = value;
    }

    /**
     * Gets the value of the idVersione property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdVersione() {
        return idVersione;
    }

    /**
     * Sets the value of the idVersione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdVersione(Integer value) {
        this.idVersione = value;
    }

}
