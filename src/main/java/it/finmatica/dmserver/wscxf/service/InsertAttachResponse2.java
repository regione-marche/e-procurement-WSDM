
package it.finmatica.dmserver.wscxf.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertAttachResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertAttachResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.wscxf.dmServer.finmatica.it/}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="idObjFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertAttachResponse", propOrder = {
    "idObjFile"
})
public class InsertAttachResponse2
    extends BaseResponse
{

    protected String idObjFile;

    /**
     * Gets the value of the idObjFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdObjFile() {
        return idObjFile;
    }

    /**
     * Sets the value of the idObjFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdObjFile(String value) {
        this.idObjFile = value;
    }

}
