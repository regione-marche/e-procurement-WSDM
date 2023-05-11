
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
 *         &lt;element name="utenti" type="{http://www.Abletech.it/Arxivar}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="aos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="firma" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="editDoc" type="{http://www.Abletech.it/Arxivar}Dm_SecurityDoc_EditDoc"/>
 *         &lt;element name="editProfilo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deleteDoc" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="revisioni" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendNotify" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "utenti",
    "aos",
    "firma",
    "editDoc",
    "editProfilo",
    "deleteDoc",
    "revisioni",
    "externalId",
    "sendNotify"
})
@XmlRootElement(name = "Dm_SecurityDoc_AddExclusiveAuthorizations")
public class DmSecurityDocAddExclusiveAuthorizations {

    protected String sessionId;
    protected int docnumber;
    protected ArrayOfInt utenti;
    protected boolean aos;
    protected boolean firma;
    @XmlElement(required = true)
    protected DmSecurityDocEditDoc editDoc;
    protected boolean editProfilo;
    protected boolean deleteDoc;
    protected boolean revisioni;
    protected String externalId;
    protected boolean sendNotify;

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
     * Gets the value of the utenti property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getUtenti() {
        return utenti;
    }

    /**
     * Sets the value of the utenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setUtenti(ArrayOfInt value) {
        this.utenti = value;
    }

    /**
     * Gets the value of the aos property.
     * 
     */
    public boolean isAos() {
        return aos;
    }

    /**
     * Sets the value of the aos property.
     * 
     */
    public void setAos(boolean value) {
        this.aos = value;
    }

    /**
     * Gets the value of the firma property.
     * 
     */
    public boolean isFirma() {
        return firma;
    }

    /**
     * Sets the value of the firma property.
     * 
     */
    public void setFirma(boolean value) {
        this.firma = value;
    }

    /**
     * Gets the value of the editDoc property.
     * 
     * @return
     *     possible object is
     *     {@link DmSecurityDocEditDoc }
     *     
     */
    public DmSecurityDocEditDoc getEditDoc() {
        return editDoc;
    }

    /**
     * Sets the value of the editDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSecurityDocEditDoc }
     *     
     */
    public void setEditDoc(DmSecurityDocEditDoc value) {
        this.editDoc = value;
    }

    /**
     * Gets the value of the editProfilo property.
     * 
     */
    public boolean isEditProfilo() {
        return editProfilo;
    }

    /**
     * Sets the value of the editProfilo property.
     * 
     */
    public void setEditProfilo(boolean value) {
        this.editProfilo = value;
    }

    /**
     * Gets the value of the deleteDoc property.
     * 
     */
    public boolean isDeleteDoc() {
        return deleteDoc;
    }

    /**
     * Sets the value of the deleteDoc property.
     * 
     */
    public void setDeleteDoc(boolean value) {
        this.deleteDoc = value;
    }

    /**
     * Gets the value of the revisioni property.
     * 
     */
    public boolean isRevisioni() {
        return revisioni;
    }

    /**
     * Sets the value of the revisioni property.
     * 
     */
    public void setRevisioni(boolean value) {
        this.revisioni = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the sendNotify property.
     * 
     */
    public boolean isSendNotify() {
        return sendNotify;
    }

    /**
     * Sets the value of the sendNotify property.
     * 
     */
    public void setSendNotify(boolean value) {
        this.sendNotify = value;
    }

}
