
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_VariabiliProcessoVal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_VariabiliProcessoVal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="DMVARIABILIPROCESSOID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ROWINDEX" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="VAL_STRING" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="VAL_DOUBLE" type="{http://www.Abletech.it/Arxivar}Field_Double" minOccurs="0"/>
 *         &lt;element name="VAL_DATETIME" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="VAL_BOOL" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_VariabiliProcessoVal", propOrder = {
    "dmvariabiliprocessoid",
    "rowindex",
    "valstring",
    "valdouble",
    "valdatetime",
    "valbool"
})
public class JoinDmVariabiliProcessoVal
    extends JoinAbstract
{

    @XmlElement(name = "DMVARIABILIPROCESSOID")
    protected FieldInt dmvariabiliprocessoid;
    @XmlElement(name = "ROWINDEX")
    protected FieldInt rowindex;
    @XmlElement(name = "VAL_STRING")
    protected FieldString valstring;
    @XmlElement(name = "VAL_DOUBLE")
    protected FieldDouble valdouble;
    @XmlElement(name = "VAL_DATETIME")
    protected FieldDateTime valdatetime;
    @XmlElement(name = "VAL_BOOL")
    protected FieldInt valbool;

    /**
     * Gets the value of the dmvariabiliprocessoid property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getDMVARIABILIPROCESSOID() {
        return dmvariabiliprocessoid;
    }

    /**
     * Sets the value of the dmvariabiliprocessoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setDMVARIABILIPROCESSOID(FieldInt value) {
        this.dmvariabiliprocessoid = value;
    }

    /**
     * Gets the value of the rowindex property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getROWINDEX() {
        return rowindex;
    }

    /**
     * Sets the value of the rowindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setROWINDEX(FieldInt value) {
        this.rowindex = value;
    }

    /**
     * Gets the value of the valstring property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getVALSTRING() {
        return valstring;
    }

    /**
     * Sets the value of the valstring property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setVALSTRING(FieldString value) {
        this.valstring = value;
    }

    /**
     * Gets the value of the valdouble property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDouble }
     *     
     */
    public FieldDouble getVALDOUBLE() {
        return valdouble;
    }

    /**
     * Sets the value of the valdouble property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDouble }
     *     
     */
    public void setVALDOUBLE(FieldDouble value) {
        this.valdouble = value;
    }

    /**
     * Gets the value of the valdatetime property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getVALDATETIME() {
        return valdatetime;
    }

    /**
     * Sets the value of the valdatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setVALDATETIME(FieldDateTime value) {
        this.valdatetime = value;
    }

    /**
     * Gets the value of the valbool property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getVALBOOL() {
        return valbool;
    }

    /**
     * Sets the value of the valbool property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setVALBOOL(FieldInt value) {
        this.valbool = value;
    }

}
