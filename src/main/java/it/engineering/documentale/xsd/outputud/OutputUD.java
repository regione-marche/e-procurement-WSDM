//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.01 at 11:53:11 AM CEST 
//


package it.engineering.documentale.xsd.outputud;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="IdUD" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="RegistrazioneDataUD" type="{}EstremiRegNumType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VersioneElettronicaNonCaricata" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NroAttachmentAssociato" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                   &lt;element name="NomeFile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "idUD",
    "registrazioneDataUD",
    "versioneElettronicaNonCaricata"
})
@XmlRootElement(name = "Output_UD")
public class OutputUD {

    @XmlElement(name = "IdUD", required = true)
    protected BigInteger idUD;
    @XmlElement(name = "RegistrazioneDataUD")
    protected List<EstremiRegNumType> registrazioneDataUD;
    @XmlElement(name = "VersioneElettronicaNonCaricata")
    protected List<OutputUD.VersioneElettronicaNonCaricata> versioneElettronicaNonCaricata;

    /**
     * Gets the value of the idUD property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdUD() {
        return idUD;
    }

    /**
     * Sets the value of the idUD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdUD(BigInteger value) {
        this.idUD = value;
    }

    /**
     * Gets the value of the registrazioneDataUD property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrazioneDataUD property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrazioneDataUD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstremiRegNumType }
     * 
     * 
     */
    public List<EstremiRegNumType> getRegistrazioneDataUD() {
        if (registrazioneDataUD == null) {
            registrazioneDataUD = new ArrayList<EstremiRegNumType>();
        }
        return this.registrazioneDataUD;
    }

    /**
     * Gets the value of the versioneElettronicaNonCaricata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the versioneElettronicaNonCaricata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersioneElettronicaNonCaricata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputUD.VersioneElettronicaNonCaricata }
     * 
     * 
     */
    public List<OutputUD.VersioneElettronicaNonCaricata> getVersioneElettronicaNonCaricata() {
        if (versioneElettronicaNonCaricata == null) {
            versioneElettronicaNonCaricata = new ArrayList<OutputUD.VersioneElettronicaNonCaricata>();
        }
        return this.versioneElettronicaNonCaricata;
    }


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
     *         &lt;element name="NroAttachmentAssociato" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *         &lt;element name="NomeFile" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "nroAttachmentAssociato",
        "nomeFile"
    })
    public static class VersioneElettronicaNonCaricata {

        @XmlElement(name = "NroAttachmentAssociato", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger nroAttachmentAssociato;
        @XmlElement(name = "NomeFile", required = true)
        protected String nomeFile;

        /**
         * Gets the value of the nroAttachmentAssociato property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNroAttachmentAssociato() {
            return nroAttachmentAssociato;
        }

        /**
         * Sets the value of the nroAttachmentAssociato property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNroAttachmentAssociato(BigInteger value) {
            this.nroAttachmentAssociato = value;
        }

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

    }

}
