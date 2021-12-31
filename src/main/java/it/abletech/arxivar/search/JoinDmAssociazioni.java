
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_Associazioni complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_Associazioni">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="ASSOCIAZIONI" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DOCNUMBER" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="UTENTE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DATA" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="NOME" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_Associazioni", propOrder = {
    "associazioni",
    "docnumber",
    "utente",
    "data",
    "nome"
})
public class JoinDmAssociazioni
    extends JoinAbstract
{

    @XmlElement(name = "ASSOCIAZIONI")
    protected FieldInt associazioni;
    @XmlElement(name = "DOCNUMBER")
    protected FieldInt docnumber;
    @XmlElement(name = "UTENTE")
    protected FieldInt utente;
    @XmlElement(name = "DATA")
    protected FieldDateTime data;
    @XmlElement(name = "NOME")
    protected FieldString nome;

    /**
     * Gets the value of the associazioni property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getASSOCIAZIONI() {
        return associazioni;
    }

    /**
     * Sets the value of the associazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setASSOCIAZIONI(FieldInt value) {
        this.associazioni = value;
    }

    /**
     * Gets the value of the docnumber property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getDOCNUMBER() {
        return docnumber;
    }

    /**
     * Sets the value of the docnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setDOCNUMBER(FieldInt value) {
        this.docnumber = value;
    }

    /**
     * Gets the value of the utente property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getUTENTE() {
        return utente;
    }

    /**
     * Sets the value of the utente property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setUTENTE(FieldInt value) {
        this.utente = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDATA() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDATA(FieldDateTime value) {
        this.data = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNOME() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNOME(FieldString value) {
        this.nome = value;
    }

}
