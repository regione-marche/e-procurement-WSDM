
package it.iride.wsprotocollodm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TabellaUtente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TabellaUtente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NomeTabella" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Righe" type="{http://tempuri.org/}ArrayOfRecordUtente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TabellaUtente", propOrder = {
    "nomeTabella",
    "righe"
})
public class TabellaUtente {

    @XmlElement(name = "NomeTabella")
    protected String nomeTabella;
    @XmlElement(name = "Righe")
    protected ArrayOfRecordUtente righe;

    /**
     * Gets the value of the nomeTabella property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeTabella() {
        return nomeTabella;
    }

    /**
     * Sets the value of the nomeTabella property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeTabella(String value) {
        this.nomeTabella = value;
    }

    /**
     * Gets the value of the righe property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecordUtente }
     *     
     */
    public ArrayOfRecordUtente getRighe() {
        return righe;
    }

    /**
     * Sets the value of the righe property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecordUtente }
     *     
     */
    public void setRighe(ArrayOfRecordUtente value) {
        this.righe = value;
    }

}
