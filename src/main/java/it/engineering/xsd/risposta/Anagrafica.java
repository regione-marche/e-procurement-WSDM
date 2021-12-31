//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 02:58:48 PM CEST 
//


package it.engineering.xsd.risposta;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nominativo",
    "codiceFiscaleOrPartitaIva",
    "descrizioneResidenza",
    "dataFineValidita"
})
@XmlRootElement(name = "Anagrafica")
public class Anagrafica {

    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String codice;
    @XmlAttribute
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String matricola;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tipo;
    @XmlElement(name = "Nominativo", required = true)
    protected Nominativo nominativo;
    @XmlElements({
        @XmlElement(name = "CodiceFiscale", type = CodiceFiscale.class),
        @XmlElement(name = "PartitaIva", type = PartitaIva.class)
    })
    protected List<Object> codiceFiscaleOrPartitaIva;
    @XmlElement(name = "DescrizioneResidenza")
    protected DescrizioneResidenza descrizioneResidenza;
    @XmlElement(name = "DataFineValidita")
    protected DataFineValidita dataFineValidita;

    /**
     * Gets the value of the codice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodice() {
        return codice;
    }

    /**
     * Sets the value of the codice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodice(String value) {
        this.codice = value;
    }

    /**
     * Gets the value of the matricola property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricola() {
        if (matricola == null) {
            return "";
        } else {
            return matricola;
        }
    }

    /**
     * Sets the value of the matricola property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricola(String value) {
        this.matricola = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        if (tipo == null) {
            return "P";
        } else {
            return tipo;
        }
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the nominativo property.
     * 
     * @return
     *     possible object is
     *     {@link Nominativo }
     *     
     */
    public Nominativo getNominativo() {
        return nominativo;
    }

    /**
     * Sets the value of the nominativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nominativo }
     *     
     */
    public void setNominativo(Nominativo value) {
        this.nominativo = value;
    }

    /**
     * Gets the value of the codiceFiscaleOrPartitaIva property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codiceFiscaleOrPartitaIva property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodiceFiscaleOrPartitaIva().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodiceFiscale }
     * {@link PartitaIva }
     * 
     * 
     */
    public List<Object> getCodiceFiscaleOrPartitaIva() {
        if (codiceFiscaleOrPartitaIva == null) {
            codiceFiscaleOrPartitaIva = new ArrayList<Object>();
        }
        return this.codiceFiscaleOrPartitaIva;
    }

    /**
     * Gets the value of the descrizioneResidenza property.
     * 
     * @return
     *     possible object is
     *     {@link DescrizioneResidenza }
     *     
     */
    public DescrizioneResidenza getDescrizioneResidenza() {
        return descrizioneResidenza;
    }

    /**
     * Sets the value of the descrizioneResidenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescrizioneResidenza }
     *     
     */
    public void setDescrizioneResidenza(DescrizioneResidenza value) {
        this.descrizioneResidenza = value;
    }

    /**
     * Gets the value of the dataFineValidita property.
     * 
     * @return
     *     possible object is
     *     {@link DataFineValidita }
     *     
     */
    public DataFineValidita getDataFineValidita() {
        return dataFineValidita;
    }

    /**
     * Sets the value of the dataFineValidita property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataFineValidita }
     *     
     */
    public void setDataFineValidita(DataFineValidita value) {
        this.dataFineValidita = value;
    }

}