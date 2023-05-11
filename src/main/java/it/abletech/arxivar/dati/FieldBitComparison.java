
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Field_BitComparison complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Field_BitComparison">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Field_Abstract">
 *       &lt;sequence>
 *         &lt;element name="Operatore" type="{http://www.Abletech.it/Arxivar}Dm_Base_Search_Operatore_Binario"/>
 *         &lt;element name="Valore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field_BitComparison", propOrder = {
    "operatore",
    "valore"
})
public class FieldBitComparison
    extends FieldAbstract
{

    @XmlElement(name = "Operatore", required = true)
    protected DmBaseSearchOperatoreBinario operatore;
    @XmlElement(name = "Valore")
    protected int valore;

    /**
     * Gets the value of the operatore property.
     * 
     * @return
     *     possible object is
     *     {@link DmBaseSearchOperatoreBinario }
     *     
     */
    public DmBaseSearchOperatoreBinario getOperatore() {
        return operatore;
    }

    /**
     * Sets the value of the operatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmBaseSearchOperatoreBinario }
     *     
     */
    public void setOperatore(DmBaseSearchOperatoreBinario value) {
        this.operatore = value;
    }

    /**
     * Gets the value of the valore property.
     * 
     */
    public int getValore() {
        return valore;
    }

    /**
     * Sets the value of the valore property.
     * 
     */
    public void setValore(int value) {
        this.valore = value;
    }

}
