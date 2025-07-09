
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FaseProcedimentoA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaseProcedimentoA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataFine" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DataInizio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Tipo" type="{http://paleo.regione.marche.it/services2/}TipoFaseProcedimentoA" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaseProcedimentoA", propOrder = {
    "dataFine",
    "dataInizio",
    "tipo"
})
public class FaseProcedimentoA {

    @XmlElement(name = "DataFine", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFine;
    @XmlElement(name = "DataInizio")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInizio;
    @XmlElement(name = "Tipo")
    protected TipoFaseProcedimentoA tipo;

    /**
     * Gets the value of the dataFine property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFine() {
        return dataFine;
    }

    /**
     * Sets the value of the dataFine property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFine(XMLGregorianCalendar value) {
        this.dataFine = value;
    }

    /**
     * Gets the value of the dataInizio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInizio() {
        return dataInizio;
    }

    /**
     * Sets the value of the dataInizio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInizio(XMLGregorianCalendar value) {
        this.dataInizio = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoFaseProcedimentoA }
     *     
     */
    public TipoFaseProcedimentoA getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFaseProcedimentoA }
     *     
     */
    public void setTipo(TipoFaseProcedimentoA value) {
        this.tipo = value;
    }

}
