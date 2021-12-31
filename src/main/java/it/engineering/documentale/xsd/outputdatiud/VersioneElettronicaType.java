//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.01 at 11:53:11 AM CEST 
//


package it.engineering.documentale.xsd.outputdatiud;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Contiene le informazioni di un file associato all'unit� documentaria
 * 
 * <p>Java class for VersioneElettronicaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VersioneElettronicaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NomeFile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NroUltimaVersione" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DifferenteDaAttuale" type="{}FlagSiNoType" />
 *       &lt;attribute name="ModificatoAlTsRich" type="{}FlagSiNoType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersioneElettronicaType", propOrder = {
    "nomeFile",
    "nroUltimaVersione"
})
public class VersioneElettronicaType {

    @XmlElement(name = "NomeFile", required = true)
    protected String nomeFile;
    @XmlElement(name = "NroUltimaVersione")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger nroUltimaVersione;
    @XmlAttribute(name = "DifferenteDaAttuale")
    protected String differenteDaAttuale;
    @XmlAttribute(name = "ModificatoAlTsRich")
    protected String modificatoAlTsRich;

    /**
     * Gets the value of the nomeFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFile() {
        return nomeFile;
    }

    /**
     * Sets the value of the nomeFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFile(String value) {
        this.nomeFile = value;
    }

    /**
     * Gets the value of the nroUltimaVersione property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNroUltimaVersione() {
        return nroUltimaVersione;
    }

    /**
     * Sets the value of the nroUltimaVersione property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNroUltimaVersione(BigInteger value) {
        this.nroUltimaVersione = value;
    }

    /**
     * Gets the value of the differenteDaAttuale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDifferenteDaAttuale() {
        return differenteDaAttuale;
    }

    /**
     * Sets the value of the differenteDaAttuale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDifferenteDaAttuale(String value) {
        this.differenteDaAttuale = value;
    }

    /**
     * Gets the value of the modificatoAlTsRich property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificatoAlTsRich() {
        return modificatoAlTsRich;
    }

    /**
     * Sets the value of the modificatoAlTsRich property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificatoAlTsRich(String value) {
        this.modificatoAlTsRich = value;
    }

}
