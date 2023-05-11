
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Relazioni complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Relazioni">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOCNUMBER_TO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DOCNUMBER_FROM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Relazioni", propOrder = {
    "id",
    "docnumberto",
    "docnumberfrom"
})
public class DmRelazioni
    extends Base
{

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "DOCNUMBER_TO")
    protected int docnumberto;
    @XmlElement(name = "DOCNUMBER_FROM")
    protected int docnumberfrom;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the docnumberto property.
     * 
     */
    public int getDOCNUMBERTO() {
        return docnumberto;
    }

    /**
     * Sets the value of the docnumberto property.
     * 
     */
    public void setDOCNUMBERTO(int value) {
        this.docnumberto = value;
    }

    /**
     * Gets the value of the docnumberfrom property.
     * 
     */
    public int getDOCNUMBERFROM() {
        return docnumberfrom;
    }

    /**
     * Sets the value of the docnumberfrom property.
     * 
     */
    public void setDOCNUMBERFROM(int value) {
        this.docnumberfrom = value;
    }

}
