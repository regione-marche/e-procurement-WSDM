
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_MaskDetail_FieldKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dm_MaskDetail_FieldKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NonImpostato"/>
 *     &lt;enumeration value="From"/>
 *     &lt;enumeration value="To"/>
 *     &lt;enumeration value="Cc"/>
 *     &lt;enumeration value="Aoo"/>
 *     &lt;enumeration value="DocumentType"/>
 *     &lt;enumeration value="DataDoc"/>
 *     &lt;enumeration value="Numero"/>
 *     &lt;enumeration value="Oggetto"/>
 *     &lt;enumeration value="Origine"/>
 *     &lt;enumeration value="Stato"/>
 *     &lt;enumeration value="Pratiche"/>
 *     &lt;enumeration value="Scadenza"/>
 *     &lt;enumeration value="Importante"/>
 *     &lt;enumeration value="AbilitaWeb"/>
 *     &lt;enumeration value="AvviaWorkFlow"/>
 *     &lt;enumeration value="InviaPerFax"/>
 *     &lt;enumeration value="InviaPerMail"/>
 *     &lt;enumeration value="AllegaATaskAttivo"/>
 *     &lt;enumeration value="InserisciInAssociazione"/>
 *     &lt;enumeration value="InserisciInFascicolo"/>
 *     &lt;enumeration value="InserisciInRelazioneManuale"/>
 *     &lt;enumeration value="GestisciRevisioni"/>
 *     &lt;enumeration value="Note"/>
 *     &lt;enumeration value="Allegati"/>
 *     &lt;enumeration value="Aggiuntivo"/>
 *     &lt;enumeration value="File"/>
 *     &lt;enumeration value="Scanner"/>
 *     &lt;enumeration value="Barcode"/>
 *     &lt;enumeration value="SicurezzaSingoloDocumento"/>
 *     &lt;enumeration value="ExternalId"/>
 *     &lt;enumeration value="AllegaMemo"/>
 *     &lt;enumeration value="Senders"/>
 *     &lt;enumeration value="AvviaCollaboration"/>
 *     &lt;enumeration value="ScansioneImmediata"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dm_MaskDetail_FieldKind")
@XmlEnum
public enum DmMaskDetailFieldKind {

    @XmlEnumValue("NonImpostato")
    NON_IMPOSTATO("NonImpostato"),
    @XmlEnumValue("From")
    FROM("From"),
    @XmlEnumValue("To")
    TO("To"),
    @XmlEnumValue("Cc")
    CC("Cc"),
    @XmlEnumValue("Aoo")
    AOO("Aoo"),
    @XmlEnumValue("DocumentType")
    DOCUMENT_TYPE("DocumentType"),
    @XmlEnumValue("DataDoc")
    DATA_DOC("DataDoc"),
    @XmlEnumValue("Numero")
    NUMERO("Numero"),
    @XmlEnumValue("Oggetto")
    OGGETTO("Oggetto"),
    @XmlEnumValue("Origine")
    ORIGINE("Origine"),
    @XmlEnumValue("Stato")
    STATO("Stato"),
    @XmlEnumValue("Pratiche")
    PRATICHE("Pratiche"),
    @XmlEnumValue("Scadenza")
    SCADENZA("Scadenza"),
    @XmlEnumValue("Importante")
    IMPORTANTE("Importante"),
    @XmlEnumValue("AbilitaWeb")
    ABILITA_WEB("AbilitaWeb"),
    @XmlEnumValue("AvviaWorkFlow")
    AVVIA_WORK_FLOW("AvviaWorkFlow"),
    @XmlEnumValue("InviaPerFax")
    INVIA_PER_FAX("InviaPerFax"),
    @XmlEnumValue("InviaPerMail")
    INVIA_PER_MAIL("InviaPerMail"),
    @XmlEnumValue("AllegaATaskAttivo")
    ALLEGA_A_TASK_ATTIVO("AllegaATaskAttivo"),
    @XmlEnumValue("InserisciInAssociazione")
    INSERISCI_IN_ASSOCIAZIONE("InserisciInAssociazione"),
    @XmlEnumValue("InserisciInFascicolo")
    INSERISCI_IN_FASCICOLO("InserisciInFascicolo"),
    @XmlEnumValue("InserisciInRelazioneManuale")
    INSERISCI_IN_RELAZIONE_MANUALE("InserisciInRelazioneManuale"),
    @XmlEnumValue("GestisciRevisioni")
    GESTISCI_REVISIONI("GestisciRevisioni"),
    @XmlEnumValue("Note")
    NOTE("Note"),
    @XmlEnumValue("Allegati")
    ALLEGATI("Allegati"),
    @XmlEnumValue("Aggiuntivo")
    AGGIUNTIVO("Aggiuntivo"),
    @XmlEnumValue("File")
    FILE("File"),
    @XmlEnumValue("Scanner")
    SCANNER("Scanner"),
    @XmlEnumValue("Barcode")
    BARCODE("Barcode"),
    @XmlEnumValue("SicurezzaSingoloDocumento")
    SICUREZZA_SINGOLO_DOCUMENTO("SicurezzaSingoloDocumento"),
    @XmlEnumValue("ExternalId")
    EXTERNAL_ID("ExternalId"),
    @XmlEnumValue("AllegaMemo")
    ALLEGA_MEMO("AllegaMemo"),
    @XmlEnumValue("Senders")
    SENDERS("Senders"),
    @XmlEnumValue("AvviaCollaboration")
    AVVIA_COLLABORATION("AvviaCollaboration"),
    @XmlEnumValue("ScansioneImmediata")
    SCANSIONE_IMMEDIATA("ScansioneImmediata");
    private final String value;

    DmMaskDetailFieldKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmMaskDetailFieldKind fromValue(String v) {
        for (DmMaskDetailFieldKind c: DmMaskDetailFieldKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
