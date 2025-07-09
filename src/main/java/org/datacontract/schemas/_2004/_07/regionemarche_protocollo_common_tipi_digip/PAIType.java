
package org.datacontract.schemas._2004._07.regionemarche_protocollo_common_tipi_digip;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for PAIType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PAIType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IPAAOO" type="{http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi.Digip.Protocollo}CodiceIPAType" minOccurs="0"/>
 *         &lt;element name="IPAAmm" type="{http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi.Digip.Protocollo}CodiceIPAType" minOccurs="0"/>
 *         &lt;element name="IPAUOR" type="{http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi.Digip.Protocollo}CodiceIPAType" minOccurs="0"/>
 *         &lt;element name="IndirizziDigitaliDiRiferimento" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PAIType", propOrder = {
    "ipaaoo",
    "ipaAmm",
    "ipauor",
    "indirizziDigitaliDiRiferimento"
})
public class PAIType {

    @XmlElement(name = "IPAAOO", nillable = true)
    protected CodiceIPAType ipaaoo;
    @XmlElement(name = "IPAAmm", nillable = true)
    protected CodiceIPAType ipaAmm;
    @XmlElement(name = "IPAUOR", nillable = true)
    protected CodiceIPAType ipauor;
    @XmlElement(name = "IndirizziDigitaliDiRiferimento", nillable = true)
    protected ArrayOfstring indirizziDigitaliDiRiferimento;

    /**
     * Gets the value of the ipaaoo property.
     * 
     * @return
     *     possible object is
     *     {@link CodiceIPAType }
     *     
     */
    public CodiceIPAType getIPAAOO() {
        return ipaaoo;
    }

    /**
     * Sets the value of the ipaaoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodiceIPAType }
     *     
     */
    public void setIPAAOO(CodiceIPAType value) {
        this.ipaaoo = value;
    }

    /**
     * Gets the value of the ipaAmm property.
     * 
     * @return
     *     possible object is
     *     {@link CodiceIPAType }
     *     
     */
    public CodiceIPAType getIPAAmm() {
        return ipaAmm;
    }

    /**
     * Sets the value of the ipaAmm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodiceIPAType }
     *     
     */
    public void setIPAAmm(CodiceIPAType value) {
        this.ipaAmm = value;
    }

    /**
     * Gets the value of the ipauor property.
     * 
     * @return
     *     possible object is
     *     {@link CodiceIPAType }
     *     
     */
    public CodiceIPAType getIPAUOR() {
        return ipauor;
    }

    /**
     * Sets the value of the ipauor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodiceIPAType }
     *     
     */
    public void setIPAUOR(CodiceIPAType value) {
        this.ipauor = value;
    }

    /**
     * Gets the value of the indirizziDigitaliDiRiferimento property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getIndirizziDigitaliDiRiferimento() {
        return indirizziDigitaliDiRiferimento;
    }

    /**
     * Sets the value of the indirizziDigitaliDiRiferimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setIndirizziDigitaliDiRiferimento(ArrayOfstring value) {
        this.indirizziDigitaliDiRiferimento = value;
    }

}
