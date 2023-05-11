
package it.archiflow93;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RightsRwCard.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RightsRwCard">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RwRispedire"/>
 *     &lt;enumeration value="RwModificaProtocollo"/>
 *     &lt;enumeration value="RwAggiungerePagine"/>
 *     &lt;enumeration value="RwCancellaLista"/>
 *     &lt;enumeration value="RwAnnullareProtocollo"/>
 *     &lt;enumeration value="RwModificaDati"/>
 *     &lt;enumeration value="RwModificaAnnotazioni"/>
 *     &lt;enumeration value="RwModificaAllegati"/>
 *     &lt;enumeration value="RwModificaImmagini"/>
 *     &lt;enumeration value="RwFascicolare"/>
 *     &lt;enumeration value="RwTogliVisibilita"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RightsRwCard", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types")
@XmlEnum
public enum RightsRwCard {

    @XmlEnumValue("RwRispedire")
    RW_RISPEDIRE("RwRispedire"),
    @XmlEnumValue("RwModificaProtocollo")
    RW_MODIFICA_PROTOCOLLO("RwModificaProtocollo"),
    @XmlEnumValue("RwAggiungerePagine")
    RW_AGGIUNGERE_PAGINE("RwAggiungerePagine"),
    @XmlEnumValue("RwCancellaLista")
    RW_CANCELLA_LISTA("RwCancellaLista"),
    @XmlEnumValue("RwAnnullareProtocollo")
    RW_ANNULLARE_PROTOCOLLO("RwAnnullareProtocollo"),
    @XmlEnumValue("RwModificaDati")
    RW_MODIFICA_DATI("RwModificaDati"),
    @XmlEnumValue("RwModificaAnnotazioni")
    RW_MODIFICA_ANNOTAZIONI("RwModificaAnnotazioni"),
    @XmlEnumValue("RwModificaAllegati")
    RW_MODIFICA_ALLEGATI("RwModificaAllegati"),
    @XmlEnumValue("RwModificaImmagini")
    RW_MODIFICA_IMMAGINI("RwModificaImmagini"),
    @XmlEnumValue("RwFascicolare")
    RW_FASCICOLARE("RwFascicolare"),
    @XmlEnumValue("RwTogliVisibilita")
    RW_TOGLI_VISIBILITA("RwTogliVisibilita");
    private final String value;

    RightsRwCard(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RightsRwCard fromValue(String v) {
        for (RightsRwCard c: RightsRwCard.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
