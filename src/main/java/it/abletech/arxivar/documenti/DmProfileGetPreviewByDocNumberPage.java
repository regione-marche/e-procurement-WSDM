
package it.abletech.arxivar.documenti;

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
 *         &lt;element name="docnumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="getDocumentIfPreviewNotExist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "pageIndex",
    "getDocumentIfPreviewNotExist"
})
@XmlRootElement(name = "Dm_Profile_GetPreview_By_DocNumber_Page")
public class DmProfileGetPreviewByDocNumberPage {

    protected String sessionId;
    protected int docnumber;
    protected int pageIndex;
    protected boolean getDocumentIfPreviewNotExist;

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
     * Gets the value of the pageIndex property.
     * 
     */
    public int getPageIndex() {
        return pageIndex;
    }

    /**
     * Sets the value of the pageIndex property.
     * 
     */
    public void setPageIndex(int value) {
        this.pageIndex = value;
    }

    /**
     * Gets the value of the getDocumentIfPreviewNotExist property.
     * 
     */
    public boolean isGetDocumentIfPreviewNotExist() {
        return getDocumentIfPreviewNotExist;
    }

    /**
     * Sets the value of the getDocumentIfPreviewNotExist property.
     * 
     */
    public void setGetDocumentIfPreviewNotExist(boolean value) {
        this.getDocumentIfPreviewNotExist = value;
    }

}
