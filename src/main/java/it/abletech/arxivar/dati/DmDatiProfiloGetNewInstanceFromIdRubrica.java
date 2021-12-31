
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
 *         &lt;element name="idRubrica" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="campo" type="{http://www.Abletech.it/Arxivar}Dm_DatiProfilo_Campo"/>
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
    "idRubrica",
    "campo"
})
@XmlRootElement(name = "Dm_DatiProfilo_GetNewInstance_From_IdRubrica")
public class DmDatiProfiloGetNewInstanceFromIdRubrica {

    protected String sessionId;
    protected int idRubrica;
    @XmlElement(required = true)
    protected DmDatiProfiloCampo campo;

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
     * Gets the value of the idRubrica property.
     * 
     */
    public int getIdRubrica() {
        return idRubrica;
    }

    /**
     * Sets the value of the idRubrica property.
     * 
     */
    public void setIdRubrica(int value) {
        this.idRubrica = value;
    }

    /**
     * Gets the value of the campo property.
     * 
     * @return
     *     possible object is
     *     {@link DmDatiProfiloCampo }
     *     
     */
    public DmDatiProfiloCampo getCampo() {
        return campo;
    }

    /**
     * Sets the value of the campo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmDatiProfiloCampo }
     *     
     */
    public void setCampo(DmDatiProfiloCampo value) {
        this.campo = value;
    }

}
