
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Field_Abstract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Field_Abstract">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeTabella" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multiple" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Valore_IsUndefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field_Abstract", propOrder = {
    "nome",
    "nomeTabella",
    "externalId",
    "multiple",
    "lang",
    "valoreIsUndefined",
    "label"
})
@XmlSeeAlso({
    FieldString.class,
    FieldIntBase.class,
    FieldFullText.class,
    FieldMultiValueBase.class,
    FieldBitComparison.class
})
public abstract class FieldAbstract
    extends Base
{

    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "NomeTabella")
    protected String nomeTabella;
    @XmlElement(name = "ExternalId")
    protected String externalId;
    @XmlElement(name = "Multiple")
    protected String multiple;
    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "Valore_IsUndefined")
    protected boolean valoreIsUndefined;
    @XmlElement(name = "Label")
    protected String label;

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
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
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the multiple property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiple() {
        return multiple;
    }

    /**
     * Sets the value of the multiple property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiple(String value) {
        this.multiple = value;
    }

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
     * Gets the value of the valoreIsUndefined property.
     * 
     */
    public boolean isValoreIsUndefined() {
        return valoreIsUndefined;
    }

    /**
     * Sets the value of the valoreIsUndefined property.
     * 
     */
    public void setValoreIsUndefined(boolean value) {
        this.valoreIsUndefined = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

}
