//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.01 at 11:53:09 AM CEST 
//


package it.engineering.documentale.xsd.estermixidentificazioneud;

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
 *     &lt;extension base="{}EstremiXIdentificazioneUDType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="OutputValidoAllaDataOra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "outputValidoAllaDataOra"
})
@XmlRootElement(name = "EstremiXIdentificazioneUD")
public class EstremiXIdentificazioneUD
    extends EstremiXIdentificazioneUDType
{

    @XmlElement(name = "OutputValidoAllaDataOra")
    protected String outputValidoAllaDataOra;

    /**
     * Gets the value of the outputValidoAllaDataOra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputValidoAllaDataOra() {
        return outputValidoAllaDataOra;
    }

    /**
     * Sets the value of the outputValidoAllaDataOra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputValidoAllaDataOra(String value) {
        this.outputValidoAllaDataOra = value;
    }

}
