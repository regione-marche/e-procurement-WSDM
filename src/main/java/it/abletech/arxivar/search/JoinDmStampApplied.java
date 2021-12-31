
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_StampApplied complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_StampApplied">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DESTINATIONTYPE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="KI1" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="KI2" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="KI3" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="KS1" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="KS2" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="KS3" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DMSTAMPSINSTANCEID" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_StampApplied", propOrder = {
    "id",
    "destinationtype",
    "ki1",
    "ki2",
    "ki3",
    "ks1",
    "ks2",
    "ks3",
    "dmstampsinstanceid"
})
public class JoinDmStampApplied
    extends JoinAbstract
{

    @XmlElement(name = "ID")
    protected FieldString id;
    @XmlElement(name = "DESTINATIONTYPE")
    protected FieldInt destinationtype;
    @XmlElement(name = "KI1")
    protected FieldInt ki1;
    @XmlElement(name = "KI2")
    protected FieldInt ki2;
    @XmlElement(name = "KI3")
    protected FieldInt ki3;
    @XmlElement(name = "KS1")
    protected FieldString ks1;
    @XmlElement(name = "KS2")
    protected FieldString ks2;
    @XmlElement(name = "KS3")
    protected FieldString ks3;
    @XmlElement(name = "DMSTAMPSINSTANCEID")
    protected FieldString dmstampsinstanceid;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setID(FieldString value) {
        this.id = value;
    }

    /**
     * Gets the value of the destinationtype property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getDESTINATIONTYPE() {
        return destinationtype;
    }

    /**
     * Sets the value of the destinationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setDESTINATIONTYPE(FieldInt value) {
        this.destinationtype = value;
    }

    /**
     * Gets the value of the ki1 property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getKI1() {
        return ki1;
    }

    /**
     * Sets the value of the ki1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setKI1(FieldInt value) {
        this.ki1 = value;
    }

    /**
     * Gets the value of the ki2 property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getKI2() {
        return ki2;
    }

    /**
     * Sets the value of the ki2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setKI2(FieldInt value) {
        this.ki2 = value;
    }

    /**
     * Gets the value of the ki3 property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getKI3() {
        return ki3;
    }

    /**
     * Sets the value of the ki3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setKI3(FieldInt value) {
        this.ki3 = value;
    }

    /**
     * Gets the value of the ks1 property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getKS1() {
        return ks1;
    }

    /**
     * Sets the value of the ks1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setKS1(FieldString value) {
        this.ks1 = value;
    }

    /**
     * Gets the value of the ks2 property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getKS2() {
        return ks2;
    }

    /**
     * Sets the value of the ks2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setKS2(FieldString value) {
        this.ks2 = value;
    }

    /**
     * Gets the value of the ks3 property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getKS3() {
        return ks3;
    }

    /**
     * Sets the value of the ks3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setKS3(FieldString value) {
        this.ks3 = value;
    }

    /**
     * Gets the value of the dmstampsinstanceid property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDMSTAMPSINSTANCEID() {
        return dmstampsinstanceid;
    }

    /**
     * Sets the value of the dmstampsinstanceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDMSTAMPSINSTANCEID(FieldString value) {
        this.dmstampsinstanceid = value;
    }

}
