
package it.iride.wsprotocollodm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordUtente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordUtente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Progressivo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Campi" type="{http://tempuri.org/}ArrayOfCampoUtente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordUtente", propOrder = {
    "progressivo",
    "campi"
})
public class RecordUtente {

    @XmlElement(name = "Progressivo")
    protected int progressivo;
    @XmlElement(name = "Campi")
    protected ArrayOfCampoUtente campi;

    /**
     * Gets the value of the progressivo property.
     * 
     */
    public int getProgressivo() {
        return progressivo;
    }

    /**
     * Sets the value of the progressivo property.
     * 
     */
    public void setProgressivo(int value) {
        this.progressivo = value;
    }

    /**
     * Gets the value of the campi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCampoUtente }
     *     
     */
    public ArrayOfCampoUtente getCampi() {
        return campi;
    }

    /**
     * Sets the value of the campi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCampoUtente }
     *     
     */
    public void setCampi(ArrayOfCampoUtente value) {
        this.campi = value;
    }

}
