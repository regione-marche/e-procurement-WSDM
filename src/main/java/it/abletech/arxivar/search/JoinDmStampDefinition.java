
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_StampDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_StampDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="STAMPNAME" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="STAMPDESCRIPTION" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="ISRESIZABLE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DMTIPIDOCUMENTOID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="REMOVEAFTERAPPLIED" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_StampDefinition", propOrder = {
    "stampname",
    "stampdescription",
    "isresizable",
    "dmtipidocumentoid",
    "removeafterapplied"
})
public class JoinDmStampDefinition
    extends JoinAbstract
{

    @XmlElement(name = "STAMPNAME")
    protected FieldString stampname;
    @XmlElement(name = "STAMPDESCRIPTION")
    protected FieldString stampdescription;
    @XmlElement(name = "ISRESIZABLE")
    protected FieldInt isresizable;
    @XmlElement(name = "DMTIPIDOCUMENTOID")
    protected FieldInt dmtipidocumentoid;
    @XmlElement(name = "REMOVEAFTERAPPLIED")
    protected FieldInt removeafterapplied;

    /**
     * Gets the value of the stampname property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSTAMPNAME() {
        return stampname;
    }

    /**
     * Sets the value of the stampname property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSTAMPNAME(FieldString value) {
        this.stampname = value;
    }

    /**
     * Gets the value of the stampdescription property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSTAMPDESCRIPTION() {
        return stampdescription;
    }

    /**
     * Sets the value of the stampdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSTAMPDESCRIPTION(FieldString value) {
        this.stampdescription = value;
    }

    /**
     * Gets the value of the isresizable property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getISRESIZABLE() {
        return isresizable;
    }

    /**
     * Sets the value of the isresizable property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setISRESIZABLE(FieldInt value) {
        this.isresizable = value;
    }

    /**
     * Gets the value of the dmtipidocumentoid property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getDMTIPIDOCUMENTOID() {
        return dmtipidocumentoid;
    }

    /**
     * Sets the value of the dmtipidocumentoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setDMTIPIDOCUMENTOID(FieldInt value) {
        this.dmtipidocumentoid = value;
    }

    /**
     * Gets the value of the removeafterapplied property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getREMOVEAFTERAPPLIED() {
        return removeafterapplied;
    }

    /**
     * Sets the value of the removeafterapplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setREMOVEAFTERAPPLIED(FieldInt value) {
        this.removeafterapplied = value;
    }

}
