
package it.marche.regione.paleo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.regionemarche_protocollo_common.ArrayOfIpaEntry;


/**
 * <p>Java class for BEListOfIpaEntryRz2BRIZ5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEListOfIpaEntryRz2BRIZ5">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Lista" type="{http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi}ArrayOfIpaEntry" minOccurs="0"/>
 *         &lt;element name="MessaggioRisultato" type="{http://paleo.regione.marche.it/services/}MessaggioRisultato" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEListOfIpaEntryRz2BRIZ5", propOrder = {
    "lista",
    "messaggioRisultato"
})
public class BEListOfIpaEntryRz2BRIZ5 {

    @XmlElement(name = "Lista", nillable = true)
    protected ArrayOfIpaEntry lista;
    @XmlElement(name = "MessaggioRisultato", nillable = true)
    protected MessaggioRisultato messaggioRisultato;

    /**
     * Gets the value of the lista property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIpaEntry }
     *     
     */
    public ArrayOfIpaEntry getLista() {
        return lista;
    }

    /**
     * Sets the value of the lista property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIpaEntry }
     *     
     */
    public void setLista(ArrayOfIpaEntry value) {
        this.lista = value;
    }

    /**
     * Gets the value of the messaggioRisultato property.
     * 
     * @return
     *     possible object is
     *     {@link MessaggioRisultato }
     *     
     */
    public MessaggioRisultato getMessaggioRisultato() {
        return messaggioRisultato;
    }

    /**
     * Sets the value of the messaggioRisultato property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessaggioRisultato }
     *     
     */
    public void setMessaggioRisultato(MessaggioRisultato value) {
        this.messaggioRisultato = value;
    }

}
