
package it.archiflow96;

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
 *         &lt;element name="AutoCollateResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="folder" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Folder.ValueObject}Folder" minOccurs="0"/>
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
    "autoCollateResult",
    "folder"
})
@XmlRootElement(name = "AutoCollateResponse")
public class AutoCollateResponse {

    @XmlElement(name = "AutoCollateResult")
    protected ResultInfo autoCollateResult;
    @XmlElement(nillable = true)
    protected Folder folder;

    /**
     * Gets the value of the autoCollateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getAutoCollateResult() {
        return autoCollateResult;
    }

    /**
     * Sets the value of the autoCollateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setAutoCollateResult(ResultInfo value) {
        this.autoCollateResult = value;
    }

    /**
     * Gets the value of the folder property.
     * 
     * @return
     *     possible object is
     *     {@link Folder }
     *     
     */
    public Folder getFolder() {
        return folder;
    }

    /**
     * Sets the value of the folder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Folder }
     *     
     */
    public void setFolder(Folder value) {
        this.folder = value;
    }

}
