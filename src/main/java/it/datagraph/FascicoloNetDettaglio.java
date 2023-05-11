
package it.datagraph;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FascicoloNetDettaglio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FascicoloNetDettaglio">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}FascicoloNet">
 *       &lt;sequence>
 *         &lt;element name="CountRegistrazioni" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ListaRegistrazioni" type="{http://tempuri.org/}ArrayOfSegnatura" minOccurs="0"/>
 *         &lt;element name="CountSottoFasc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ListaSottoFasc" type="{http://tempuri.org/}ArrayOfFascicoloNet" minOccurs="0"/>
 *         &lt;element name="CountDocumenti" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ListaDocumenti" type="{http://tempuri.org/}ArrayOfDocumento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FascicoloNetDettaglio", propOrder = {
    "countRegistrazioni",
    "listaRegistrazioni",
    "countSottoFasc",
    "listaSottoFasc",
    "countDocumenti",
    "listaDocumenti"
})
public class FascicoloNetDettaglio
    extends FascicoloNet
{

    @XmlElement(name = "CountRegistrazioni")
    protected int countRegistrazioni;
    @XmlElement(name = "ListaRegistrazioni")
    protected ArrayOfSegnatura listaRegistrazioni;
    @XmlElement(name = "CountSottoFasc")
    protected int countSottoFasc;
    @XmlElement(name = "ListaSottoFasc")
    protected ArrayOfFascicoloNet listaSottoFasc;
    @XmlElement(name = "CountDocumenti")
    protected int countDocumenti;
    @XmlElement(name = "ListaDocumenti")
    protected ArrayOfDocumento listaDocumenti;

    /**
     * Gets the value of the countRegistrazioni property.
     * 
     */
    public int getCountRegistrazioni() {
        return countRegistrazioni;
    }

    /**
     * Sets the value of the countRegistrazioni property.
     * 
     */
    public void setCountRegistrazioni(int value) {
        this.countRegistrazioni = value;
    }

    /**
     * Gets the value of the listaRegistrazioni property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSegnatura }
     *     
     */
    public ArrayOfSegnatura getListaRegistrazioni() {
        return listaRegistrazioni;
    }

    /**
     * Sets the value of the listaRegistrazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSegnatura }
     *     
     */
    public void setListaRegistrazioni(ArrayOfSegnatura value) {
        this.listaRegistrazioni = value;
    }

    /**
     * Gets the value of the countSottoFasc property.
     * 
     */
    public int getCountSottoFasc() {
        return countSottoFasc;
    }

    /**
     * Sets the value of the countSottoFasc property.
     * 
     */
    public void setCountSottoFasc(int value) {
        this.countSottoFasc = value;
    }

    /**
     * Gets the value of the listaSottoFasc property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFascicoloNet }
     *     
     */
    public ArrayOfFascicoloNet getListaSottoFasc() {
        return listaSottoFasc;
    }

    /**
     * Sets the value of the listaSottoFasc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFascicoloNet }
     *     
     */
    public void setListaSottoFasc(ArrayOfFascicoloNet value) {
        this.listaSottoFasc = value;
    }

    /**
     * Gets the value of the countDocumenti property.
     * 
     */
    public int getCountDocumenti() {
        return countDocumenti;
    }

    /**
     * Sets the value of the countDocumenti property.
     * 
     */
    public void setCountDocumenti(int value) {
        this.countDocumenti = value;
    }

    /**
     * Gets the value of the listaDocumenti property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocumento }
     *     
     */
    public ArrayOfDocumento getListaDocumenti() {
        return listaDocumenti;
    }

    /**
     * Sets the value of the listaDocumenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocumento }
     *     
     */
    public void setListaDocumenti(ArrayOfDocumento value) {
        this.listaDocumenti = value;
    }

}
