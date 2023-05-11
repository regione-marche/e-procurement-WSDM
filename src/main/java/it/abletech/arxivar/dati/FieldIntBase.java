
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Field_Int_Base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Field_Int_Base">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Field_Abstract">
 *       &lt;sequence>
 *         &lt;element name="Operatore" type="{http://www.Abletech.it/Arxivar}Dm_Base_Search_Operatore_Numerico"/>
 *         &lt;element name="Valore2_IsUndefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field_Int_Base", propOrder = {
    "operatore",
    "valore2IsUndefined"
})
@XmlSeeAlso({
    FieldDouble.class,
    FieldInt.class,
    FieldDateTime.class
})
public abstract class FieldIntBase
    extends FieldAbstract
{

    @XmlElement(name = "Operatore", required = true)
    protected DmBaseSearchOperatoreNumerico operatore;
    @XmlElement(name = "Valore2_IsUndefined")
    protected boolean valore2IsUndefined;

    /**
     * Gets the value of the operatore property.
     * 
     * @return
     *     possible object is
     *     {@link DmBaseSearchOperatoreNumerico }
     *     
     */
    public DmBaseSearchOperatoreNumerico getOperatore() {
        return operatore;
    }

    /**
     * Sets the value of the operatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmBaseSearchOperatoreNumerico }
     *     
     */
    public void setOperatore(DmBaseSearchOperatoreNumerico value) {
        this.operatore = value;
    }

    /**
     * Gets the value of the valore2IsUndefined property.
     * 
     */
    public boolean isValore2IsUndefined() {
        return valore2IsUndefined;
    }

    /**
     * Sets the value of the valore2IsUndefined property.
     * 
     */
    public void setValore2IsUndefined(boolean value) {
        this.valore2IsUndefined = value;
    }

}
