
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Dm_Fascicoli complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Fascicoli">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_PADRE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AUTORE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DATA_CREATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NOME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Fascicoli", propOrder = {
    "id",
    "idpadre",
    "autore",
    "datacreate",
    "nome"
})
public class DmFascicoli
    extends Base
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "ID_PADRE")
    protected int idpadre;
    @XmlElement(name = "AUTORE")
    protected int autore;
    @XmlElement(name = "DATA_CREATE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datacreate;
    @XmlElement(name = "NOME")
    protected String nome;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the idpadre property.
     * 
     */
    public int getIDPADRE() {
        return idpadre;
    }

    /**
     * Sets the value of the idpadre property.
     * 
     */
    public void setIDPADRE(int value) {
        this.idpadre = value;
    }

    /**
     * Gets the value of the autore property.
     * 
     */
    public int getAUTORE() {
        return autore;
    }

    /**
     * Sets the value of the autore property.
     * 
     */
    public void setAUTORE(int value) {
        this.autore = value;
    }

    /**
     * Gets the value of the datacreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATACREATE() {
        return datacreate;
    }

    /**
     * Sets the value of the datacreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATACREATE(XMLGregorianCalendar value) {
        this.datacreate = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOME() {
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
    public void setNOME(String value) {
        this.nome = value;
    }

}
