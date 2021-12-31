
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
 *         &lt;element name="ProtoIn" type="{http://tempuri.org/}ProtocolloIn"/>
 *         &lt;element name="CodiceAmministrazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceAOO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "protoIn",
    "codiceAmministrazione",
    "codiceAOO"
})
@XmlRootElement(name = "InserisciProtocolloEAnagraficheMultiDB")
public class InserisciProtocolloEAnagraficheMultiDB {

    @XmlElement(name = "ProtoIn", required = true, nillable = true)
    protected ProtocolloIn protoIn;
    @XmlElement(name = "CodiceAmministrazione")
    protected String codiceAmministrazione;
    @XmlElement(name = "CodiceAOO")
    protected String codiceAOO;

    /**
     * Gets the value of the protoIn property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolloIn }
     *     
     */
    public ProtocolloIn getProtoIn() {
        return protoIn;
    }

    /**
     * Sets the value of the protoIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolloIn }
     *     
     */
    public void setProtoIn(ProtocolloIn value) {
        this.protoIn = value;
    }

    /**
     * Gets the value of the codiceAmministrazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceAmministrazione() {
        return codiceAmministrazione;
    }

    /**
     * Sets the value of the codiceAmministrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceAmministrazione(String value) {
        this.codiceAmministrazione = value;
    }

    /**
     * Gets the value of the codiceAOO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceAOO() {
        return codiceAOO;
    }

    /**
     * Sets the value of the codiceAOO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceAOO(String value) {
        this.codiceAOO = value;
    }

}
