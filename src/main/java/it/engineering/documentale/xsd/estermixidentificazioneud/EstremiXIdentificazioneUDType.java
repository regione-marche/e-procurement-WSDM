//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.01 at 11:53:09 AM CEST 
//


package it.engineering.documentale.xsd.estermixidentificazioneud;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Contiene i dati attraverso cui identificare univocamente un'unit� documentaria
 * 
 * <p>Java class for EstremiXIdentificazioneUDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EstremiXIdentificazioneUDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="IdUD" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="EstremiRegNum" type="{}EstremiRegNumType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstremiXIdentificazioneUDType", propOrder = {
    "idUD",
    "estremiRegNum"
})
@XmlSeeAlso({
    EstremiXIdentificazioneUD.class
})
public class EstremiXIdentificazioneUDType {

    @XmlElement(name = "IdUD")
    protected BigInteger idUD;
    @XmlElement(name = "EstremiRegNum")
    protected EstremiRegNumType estremiRegNum;

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
     * Gets the value of the estremiRegNum property.
     * 
     * @return
     *     possible object is
     *     {@link EstremiRegNumType }
     *     
     */
    public EstremiRegNumType getEstremiRegNum() {
        return estremiRegNum;
    }

    /**
     * Sets the value of the estremiRegNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstremiRegNumType }
     *     
     */
    public void setEstremiRegNum(EstremiRegNumType value) {
        this.estremiRegNum = value;
    }

}
