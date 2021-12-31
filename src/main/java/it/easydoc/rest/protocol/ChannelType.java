
package it.easydoc.rest.protocol;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChannelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChannelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.consorziocsa.it/easydoc/ws}CodeType"/>
 *         &lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SourceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Uscita" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Ingresso" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MailConfiguration" type="{http://www.consorziocsa.it/easydoc/ws}MailConfigurationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelType", propOrder = {
    "code",
    "documentType",
    "sourceType",
    "uscita",
    "ingresso",
    "mailConfiguration"
})
public class ChannelType {

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "DocumentType", required = true)
    protected String documentType;
    @XmlElement(name = "SourceType", required = true)
    protected String sourceType;
    @XmlElement(name = "Uscita")
    protected boolean uscita;
    @XmlElement(name = "Ingresso")
    protected boolean ingresso;
    @XmlElement(name = "MailConfiguration")
    protected List<MailConfigurationType> mailConfiguration;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceType(String value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the uscita property.
     * 
     */
    public boolean isUscita() {
        return uscita;
    }

    /**
     * Sets the value of the uscita property.
     * 
     */
    public void setUscita(boolean value) {
        this.uscita = value;
    }

    /**
     * Gets the value of the ingresso property.
     * 
     */
    public boolean isIngresso() {
        return ingresso;
    }

    /**
     * Sets the value of the ingresso property.
     * 
     */
    public void setIngresso(boolean value) {
        this.ingresso = value;
    }

    /**
     * Gets the value of the mailConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mailConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMailConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MailConfigurationType }
     * 
     * 
     */
    public List<MailConfigurationType> getMailConfiguration() {
        if (mailConfiguration == null) {
            mailConfiguration = new ArrayList<MailConfigurationType>();
        }
        return this.mailConfiguration;
    }

}
