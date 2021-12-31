
package it.sispi.protocollo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WsProtRispostaInfoProt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsProtRispostaInfoProt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="progDoc" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="regProt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numProt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="annoProt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="datProt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="datDoc" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="allegato" type="{http://protocollo.sispi.it}WsProtocolloAllegato" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mittDestAna" type="{http://protocollo.sispi.it}WsProtAnagrafica" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="arrivoPartenza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceStato" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descrizioneStato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsProtRispostaInfoProt", propOrder = {
    "progDoc",
    "regProt",
    "numProt",
    "annoProt",
    "datProt",
    "datDoc",
    "allegato",
    "mittDestAna",
    "arrivoPartenza",
    "oggetto",
    "codiceStato",
    "descrizioneStato"
})
public class WsProtRispostaInfoProt {

    protected long progDoc;
    @XmlElement(required = true)
    protected String regProt;
    protected long numProt;
    protected long annoProt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datProt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datDoc;
    protected List<WsProtocolloAllegato> allegato;
    protected List<WsProtAnagrafica> mittDestAna;
    protected String arrivoPartenza;
    protected String oggetto;
    protected int codiceStato;
    protected String descrizioneStato;

    /**
     * Gets the value of the progDoc property.
     * 
     */
    public long getProgDoc() {
        return progDoc;
    }

    /**
     * Sets the value of the progDoc property.
     * 
     */
    public void setProgDoc(long value) {
        this.progDoc = value;
    }

    /**
     * Gets the value of the regProt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegProt() {
        return regProt;
    }

    /**
     * Sets the value of the regProt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegProt(String value) {
        this.regProt = value;
    }

    /**
     * Gets the value of the numProt property.
     * 
     */
    public long getNumProt() {
        return numProt;
    }

    /**
     * Sets the value of the numProt property.
     * 
     */
    public void setNumProt(long value) {
        this.numProt = value;
    }

    /**
     * Gets the value of the annoProt property.
     * 
     */
    public long getAnnoProt() {
        return annoProt;
    }

    /**
     * Sets the value of the annoProt property.
     * 
     */
    public void setAnnoProt(long value) {
        this.annoProt = value;
    }

    /**
     * Gets the value of the datProt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatProt() {
        return datProt;
    }

    /**
     * Sets the value of the datProt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatProt(XMLGregorianCalendar value) {
        this.datProt = value;
    }

    /**
     * Gets the value of the datDoc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatDoc() {
        return datDoc;
    }

    /**
     * Sets the value of the datDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatDoc(XMLGregorianCalendar value) {
        this.datDoc = value;
    }

    /**
     * Gets the value of the allegato property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allegato property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllegato().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsProtocolloAllegato }
     * 
     * 
     */
    public List<WsProtocolloAllegato> getAllegato() {
        if (allegato == null) {
            allegato = new ArrayList<WsProtocolloAllegato>();
        }
        return this.allegato;
    }

    /**
     * Gets the value of the mittDestAna property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mittDestAna property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMittDestAna().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsProtAnagrafica }
     * 
     * 
     */
    public List<WsProtAnagrafica> getMittDestAna() {
        if (mittDestAna == null) {
            mittDestAna = new ArrayList<WsProtAnagrafica>();
        }
        return this.mittDestAna;
    }

    /**
     * Gets the value of the arrivoPartenza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivoPartenza() {
        return arrivoPartenza;
    }

    /**
     * Sets the value of the arrivoPartenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivoPartenza(String value) {
        this.arrivoPartenza = value;
    }

    /**
     * Gets the value of the oggetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOggetto() {
        return oggetto;
    }

    /**
     * Sets the value of the oggetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOggetto(String value) {
        this.oggetto = value;
    }

    /**
     * Gets the value of the codiceStato property.
     * 
     */
    public int getCodiceStato() {
        return codiceStato;
    }

    /**
     * Sets the value of the codiceStato property.
     * 
     */
    public void setCodiceStato(int value) {
        this.codiceStato = value;
    }

    /**
     * Gets the value of the descrizioneStato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneStato() {
        return descrizioneStato;
    }

    /**
     * Sets the value of the descrizioneStato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneStato(String value) {
        this.descrizioneStato = value;
    }

}
