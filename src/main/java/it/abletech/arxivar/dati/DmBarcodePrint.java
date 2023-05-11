
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docnumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoImpronta" type="{http://www.Abletech.it/Arxivar}Dm_Barcode_TipoImpronta"/>
 *         &lt;element name="insertRecord" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionId",
    "docnumber",
    "tipoImpronta",
    "insertRecord"
})
@XmlRootElement(name = "Dm_Barcode_Print")
public class DmBarcodePrint {

    protected String sessionId;
    protected int docnumber;
    @XmlElement(required = true)
    protected DmBarcodeTipoImpronta tipoImpronta;
    protected boolean insertRecord;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the docnumber property.
     * 
     */
    public int getDocnumber() {
        return docnumber;
    }

    /**
     * Sets the value of the docnumber property.
     * 
     */
    public void setDocnumber(int value) {
        this.docnumber = value;
    }

    /**
     * Gets the value of the tipoImpronta property.
     * 
     * @return
     *     possible object is
     *     {@link DmBarcodeTipoImpronta }
     *     
     */
    public DmBarcodeTipoImpronta getTipoImpronta() {
        return tipoImpronta;
    }

    /**
     * Sets the value of the tipoImpronta property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmBarcodeTipoImpronta }
     *     
     */
    public void setTipoImpronta(DmBarcodeTipoImpronta value) {
        this.tipoImpronta = value;
    }

    /**
     * Gets the value of the insertRecord property.
     * 
     */
    public boolean isInsertRecord() {
        return insertRecord;
    }

    /**
     * Sets the value of the insertRecord property.
     * 
     */
    public void setInsertRecord(boolean value) {
        this.insertRecord = value;
    }

}
