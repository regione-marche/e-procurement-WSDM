
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_DmCampiClasseLegami complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_DmCampiClasseLegami">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="CampoClasseId" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DocnumberFrom" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DocnumberTo" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Values" type="{http://www.Abletech.it/Arxivar}Field_MultiValueClassi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_DmCampiClasseLegami", propOrder = {
    "campoClasseId",
    "docnumberFrom",
    "docnumberTo",
    "values"
})
public class JoinDmCampiClasseLegami
    extends JoinAbstract
{

    @XmlElement(name = "CampoClasseId")
    protected FieldString campoClasseId;
    @XmlElement(name = "DocnumberFrom")
    protected FieldInt docnumberFrom;
    @XmlElement(name = "DocnumberTo")
    protected FieldInt docnumberTo;
    @XmlElement(name = "Values")
    protected FieldMultiValueClassi values;

    /**
     * Gets the value of the campoClasseId property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCampoClasseId() {
        return campoClasseId;
    }

    /**
     * Sets the value of the campoClasseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCampoClasseId(FieldString value) {
        this.campoClasseId = value;
    }

    /**
     * Gets the value of the docnumberFrom property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getDocnumberFrom() {
        return docnumberFrom;
    }

    /**
     * Sets the value of the docnumberFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setDocnumberFrom(FieldInt value) {
        this.docnumberFrom = value;
    }

    /**
     * Gets the value of the docnumberTo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getDocnumberTo() {
        return docnumberTo;
    }

    /**
     * Sets the value of the docnumberTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setDocnumberTo(FieldInt value) {
        this.docnumberTo = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link FieldMultiValueClassi }
     *     
     */
    public FieldMultiValueClassi getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldMultiValueClassi }
     *     
     */
    public void setValues(FieldMultiValueClassi value) {
        this.values = value;
    }

}
