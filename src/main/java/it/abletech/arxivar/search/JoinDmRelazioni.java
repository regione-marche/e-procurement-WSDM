
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_Relazioni complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_Relazioni">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="DOCNUMBER_TO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DOCNUMBER_FROM" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DOCNUMBER_FROM_TO" type="{http://www.Abletech.it/Arxivar}Field_DmRelazioni_FromTo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_Relazioni", propOrder = {
    "docnumberto",
    "docnumberfrom",
    "docnumberfromto"
})
public class JoinDmRelazioni
    extends JoinAbstract
{

    @XmlElement(name = "DOCNUMBER_TO")
    protected FieldInt docnumberto;
    @XmlElement(name = "DOCNUMBER_FROM")
    protected FieldInt docnumberfrom;
    @XmlElement(name = "DOCNUMBER_FROM_TO")
    protected FieldDmRelazioniFromTo docnumberfromto;

    /**
     * Gets the value of the docnumberto property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getDOCNUMBERTO() {
        return docnumberto;
    }

    /**
     * Sets the value of the docnumberto property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setDOCNUMBERTO(FieldInt value) {
        this.docnumberto = value;
    }

    /**
     * Gets the value of the docnumberfrom property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getDOCNUMBERFROM() {
        return docnumberfrom;
    }

    /**
     * Sets the value of the docnumberfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setDOCNUMBERFROM(FieldInt value) {
        this.docnumberfrom = value;
    }

    /**
     * Gets the value of the docnumberfromto property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDmRelazioniFromTo }
     *     
     */
    public FieldDmRelazioniFromTo getDOCNUMBERFROMTO() {
        return docnumberfromto;
    }

    /**
     * Sets the value of the docnumberfromto property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDmRelazioniFromTo }
     *     
     */
    public void setDOCNUMBERFROMTO(FieldDmRelazioniFromTo value) {
        this.docnumberfromto = value;
    }

}
