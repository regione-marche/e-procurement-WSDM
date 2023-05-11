
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="select" type="{http://www.Abletech.it/Arxivar}Dm_NoteWork_Select" minOccurs="0"/>
 *         &lt;element name="search" type="{http://www.Abletech.it/Arxivar}Dm_NoteWork_Search" minOccurs="0"/>
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
    "select",
    "search"
})
@XmlRootElement(name = "Dm_NoteWork_GetData")
public class DmNoteWorkGetData {

    protected String sessionId;
    protected DmNoteWorkSelect select;
    protected DmNoteWorkSearch search;

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
     * Gets the value of the select property.
     * 
     * @return
     *     possible object is
     *     {@link DmNoteWorkSelect }
     *     
     */
    public DmNoteWorkSelect getSelect() {
        return select;
    }

    /**
     * Sets the value of the select property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmNoteWorkSelect }
     *     
     */
    public void setSelect(DmNoteWorkSelect value) {
        this.select = value;
    }

    /**
     * Gets the value of the search property.
     * 
     * @return
     *     possible object is
     *     {@link DmNoteWorkSearch }
     *     
     */
    public DmNoteWorkSearch getSearch() {
        return search;
    }

    /**
     * Sets the value of the search property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmNoteWorkSearch }
     *     
     */
    public void setSearch(DmNoteWorkSearch value) {
        this.search = value;
    }

}
