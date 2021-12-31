
package it.marche.regione.paleowssec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RespDocumentoExt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RespDocumentoExt">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paleo.regione.marche.it/services/}respDocumento">
 *       &lt;sequence>
 *         &lt;element name="Allegati" type="{http://paleo.regione.marche.it/services/}ArrayOfAllegato" minOccurs="0"/>
 *         &lt;element name="DocumentoPrincipale" type="{http://paleo.regione.marche.it/services/}File" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespDocumentoExt", propOrder = {
    "allegati",
    "documentoPrincipale"
})
@XmlSeeAlso({
    RespProtocolloExt.class
})
public class RespDocumentoExt
    extends RespDocumento
{

    @XmlElement(name = "Allegati", nillable = true)
    protected ArrayOfAllegato allegati;
    @XmlElement(name = "DocumentoPrincipale", nillable = true)
    protected File documentoPrincipale;

    /**
     * Gets the value of the allegati property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAllegato }
     *     
     */
    public ArrayOfAllegato getAllegati() {
        return allegati;
    }

    /**
     * Sets the value of the allegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAllegato }
     *     
     */
    public void setAllegati(ArrayOfAllegato value) {
        this.allegati = value;
    }

    /**
     * Gets the value of the documentoPrincipale property.
     * 
     * @return
     *     possible object is
     *     {@link File }
     *     
     */
    public File getDocumentoPrincipale() {
        return documentoPrincipale;
    }

    /**
     * Sets the value of the documentoPrincipale property.
     * 
     * @param value
     *     allowed object is
     *     {@link File }
     *     
     */
    public void setDocumentoPrincipale(File value) {
        this.documentoPrincipale = value;
    }

}
