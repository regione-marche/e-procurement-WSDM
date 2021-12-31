
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_CatRubriche complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_CatRubriche">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RUBRICA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIPO" type="{http://www.Abletech.it/Arxivar}Dm_CatRubriche_Tipo"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_CatRubriche", propOrder = {
    "id",
    "rubrica",
    "tipo"
})
public class DmCatRubriche
    extends Base
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "RUBRICA")
    protected String rubrica;
    @XmlElement(name = "TIPO", required = true)
    protected DmCatRubricheTipo tipo;

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
     * Gets the value of the rubrica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUBRICA() {
        return rubrica;
    }

    /**
     * Sets the value of the rubrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUBRICA(String value) {
        this.rubrica = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link DmCatRubricheTipo }
     *     
     */
    public DmCatRubricheTipo getTIPO() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmCatRubricheTipo }
     *     
     */
    public void setTIPO(DmCatRubricheTipo value) {
        this.tipo = value;
    }

}
