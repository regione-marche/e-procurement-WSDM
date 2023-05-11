
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Field_Da_A complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Field_Da_A">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="Lang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forceCaseInsensitive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NomeTabella" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mittente" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="And" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Destinatario" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="AddFindInCC" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AddFindInSenders" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field_Da_A", propOrder = {
    "lang",
    "forceCaseInsensitive",
    "nomeTabella",
    "mittente",
    "and",
    "destinatario",
    "addFindInCC",
    "addFindInSenders"
})
public class FieldDaA
    extends Base
{

    @XmlElement(name = "Lang")
    protected String lang;
    protected boolean forceCaseInsensitive;
    @XmlElement(name = "NomeTabella")
    protected String nomeTabella;
    @XmlElement(name = "Mittente")
    protected FieldString mittente;
    @XmlElement(name = "And")
    protected boolean and;
    @XmlElement(name = "Destinatario")
    protected FieldString destinatario;
    @XmlElement(name = "AddFindInCC")
    protected boolean addFindInCC;
    @XmlElement(name = "AddFindInSenders")
    protected boolean addFindInSenders;

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the forceCaseInsensitive property.
     * 
     */
    public boolean isForceCaseInsensitive() {
        return forceCaseInsensitive;
    }

    /**
     * Sets the value of the forceCaseInsensitive property.
     * 
     */
    public void setForceCaseInsensitive(boolean value) {
        this.forceCaseInsensitive = value;
    }

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
     * Gets the value of the mittente property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMittente() {
        return mittente;
    }

    /**
     * Sets the value of the mittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMittente(FieldString value) {
        this.mittente = value;
    }

    /**
     * Gets the value of the and property.
     * 
     */
    public boolean isAnd() {
        return and;
    }

    /**
     * Sets the value of the and property.
     * 
     */
    public void setAnd(boolean value) {
        this.and = value;
    }

    /**
     * Gets the value of the destinatario property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDestinatario() {
        return destinatario;
    }

    /**
     * Sets the value of the destinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDestinatario(FieldString value) {
        this.destinatario = value;
    }

    /**
     * Gets the value of the addFindInCC property.
     * 
     */
    public boolean isAddFindInCC() {
        return addFindInCC;
    }

    /**
     * Sets the value of the addFindInCC property.
     * 
     */
    public void setAddFindInCC(boolean value) {
        this.addFindInCC = value;
    }

    /**
     * Gets the value of the addFindInSenders property.
     * 
     */
    public boolean isAddFindInSenders() {
        return addFindInSenders;
    }

    /**
     * Sets the value of the addFindInSenders property.
     * 
     */
    public void setAddFindInSenders(boolean value) {
        this.addFindInSenders = value;
    }

}
