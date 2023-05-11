
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
 * <p>Java class for WsProtRichMappata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsProtRichMappata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userIdOperatore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numProt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datProt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="oggetto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codiceServizio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="allegato" type="{http://protocollo.sispi.it}WsProtocolloAllegato" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dataDocumento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dataRaccomandata" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="numRaccomandata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mittDestAna" type="{http://protocollo.sispi.it}WsProtAnagrafica" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsProtRichMappata", propOrder = {
    "userIdOperatore",
    "numProt",
    "datProt",
    "oggetto",
    "codiceServizio",
    "allegato",
    "dataDocumento",
    "dataRaccomandata",
    "numRaccomandata",
    "mittDestAna"
})
public class WsProtRichMappata {

    protected String userIdOperatore;
    protected int numProt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datProt;
    @XmlElement(required = true)
    protected String oggetto;
    protected long codiceServizio;
    protected List<WsProtocolloAllegato> allegato;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDocumento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataRaccomandata;
    protected String numRaccomandata;
    @XmlElement(required = true)
    protected List<WsProtAnagrafica> mittDestAna;

    /**
     * Gets the value of the userIdOperatore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIdOperatore() {
        return userIdOperatore;
    }

    /**
     * Sets the value of the userIdOperatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIdOperatore(String value) {
        this.userIdOperatore = value;
    }

    /**
     * Gets the value of the numProt property.
     * 
     */
    public int getNumProt() {
        return numProt;
    }

    /**
     * Sets the value of the numProt property.
     * 
     */
    public void setNumProt(int value) {
        this.numProt = value;
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
     * Gets the value of the codiceServizio property.
     * 
     */
    public long getCodiceServizio() {
        return codiceServizio;
    }

    /**
     * Sets the value of the codiceServizio property.
     * 
     */
    public void setCodiceServizio(long value) {
        this.codiceServizio = value;
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
     * Gets the value of the dataDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDocumento() {
        return dataDocumento;
    }

    /**
     * Sets the value of the dataDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDocumento(XMLGregorianCalendar value) {
        this.dataDocumento = value;
    }

    /**
     * Gets the value of the dataRaccomandata property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRaccomandata() {
        return dataRaccomandata;
    }

    /**
     * Sets the value of the dataRaccomandata property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRaccomandata(XMLGregorianCalendar value) {
        this.dataRaccomandata = value;
    }

    /**
     * Gets the value of the numRaccomandata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRaccomandata() {
        return numRaccomandata;
    }

    /**
     * Sets the value of the numRaccomandata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRaccomandata(String value) {
        this.numRaccomandata = value;
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

}
