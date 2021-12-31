
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
 *         &lt;element name="dm_Campi_Specifici_NomeCampo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profile" type="{http://www.Abletech.it/Arxivar}Dm_Profile_Insert_Base" minOccurs="0"/>
 *         &lt;element name="filters" type="{http://www.Abletech.it/Arxivar}ArrayOfField_Abstract" minOccurs="0"/>
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
    "dmCampiSpecificiNomeCampo",
    "profile",
    "filters"
})
@XmlRootElement(name = "Dm_CampiSpecifici_GetValues")
public class DmCampiSpecificiGetValues {

    protected String sessionId;
    @XmlElement(name = "dm_Campi_Specifici_NomeCampo")
    protected String dmCampiSpecificiNomeCampo;
    protected DmProfileInsertBase profile;
    protected ArrayOfFieldAbstract filters;

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
     * Gets the value of the dmCampiSpecificiNomeCampo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmCampiSpecificiNomeCampo() {
        return dmCampiSpecificiNomeCampo;
    }

    /**
     * Sets the value of the dmCampiSpecificiNomeCampo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmCampiSpecificiNomeCampo(String value) {
        this.dmCampiSpecificiNomeCampo = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileInsertBase }
     *     
     */
    public DmProfileInsertBase getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileInsertBase }
     *     
     */
    public void setProfile(DmProfileInsertBase value) {
        this.profile = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFieldAbstract }
     *     
     */
    public ArrayOfFieldAbstract getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFieldAbstract }
     *     
     */
    public void setFilters(ArrayOfFieldAbstract value) {
        this.filters = value;
    }

}
