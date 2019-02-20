//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.11 alle 07:46:43 PM CET 
//


package stazione_meteo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per tipoRilevazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tipoRilevazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ora" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="temperatura">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *               &lt;minInclusive value="-50"/>
 *               &lt;maxInclusive value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="umidita">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="pressione">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="700"/>
 *               &lt;maxInclusive value="1200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="velocitaVento">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="direzioneVento">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="359"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="pioggia">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoRilevazione", propOrder = {
    "ora",
    "temperatura",
    "umidita",
    "pressione",
    "velocitaVento",
    "direzioneVento",
    "pioggia"
})
public class TipoRilevazione {

    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar ora;
    protected float temperatura;
    protected int umidita;
    protected int pressione;
    protected int velocitaVento;
    protected int direzioneVento;
    protected int pioggia;

    public TipoRilevazione()
    {}
    
    public TipoRilevazione(XMLGregorianCalendar ora,float temperatura,int umidita, int pressione,int velocitaVento, int direzioneVento, int pioggia)
    {
    	setOra(ora);
    	setTemperatura(temperatura);
    	setUmidita(umidita);
    	setPressione(pressione);
    	setVelocitaVento(velocitaVento);
    	setDirezioneVento(direzioneVento);
    	setPioggia(pioggia);
    }
    
    
    @Override
	public String toString() {
		return " Rilevazione: [ora=" + ora + ", temperatura=" + temperatura + ", umidita=" + umidita + ", pressione="
				+ pressione + ", velocitaVento=" + velocitaVento + ", direzioneVento=" + direzioneVento + ", pioggia="
				+ pioggia + "]";
	}

	/**
     * Recupera il valore della proprietà ora.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOra() {
        return ora;
    }

    /**
     * Imposta il valore della proprietà ora.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOra(XMLGregorianCalendar value) {
        this.ora = value;
    }

    /**
     * Recupera il valore della proprietà temperatura.
     * 
     */
    public float getTemperatura() {
        return temperatura;
    }

    /**
     * Imposta il valore della proprietà temperatura.
     * 
     */
    public void setTemperatura(float value) {
        this.temperatura = value;
    }

    /**
     * Recupera il valore della proprietà umidita.
     * 
     */
    public int getUmidita() {
        return umidita;
    }

    /**
     * Imposta il valore della proprietà umidita.
     * 
     */
    public void setUmidita(int value) {
        this.umidita = value;
    }

    /**
     * Recupera il valore della proprietà pressione.
     * 
     */
    public int getPressione() {
        return pressione;
    }

    /**
     * Imposta il valore della proprietà pressione.
     * 
     */
    public void setPressione(int value) {
        this.pressione = value;
    }

    /**
     * Recupera il valore della proprietà velocitaVento.
     * 
     */
    public int getVelocitaVento() {
        return velocitaVento;
    }

    /**
     * Imposta il valore della proprietà velocitaVento.
     * 
     */
    public void setVelocitaVento(int value) {
        this.velocitaVento = value;
    }

    /**
     * Recupera il valore della proprietà direzioneVento.
     * 
     */
    public int getDirezioneVento() {
        return direzioneVento;
    }

    /**
     * Imposta il valore della proprietà direzioneVento.
     * 
     */
    public void setDirezioneVento(int value) {
        this.direzioneVento = value;
    }

    /**
     * Recupera il valore della proprietà pioggia.
     * 
     */
    public int getPioggia() {
        return pioggia;
    }

    /**
     * Imposta il valore della proprietà pioggia.
     * 
     */
    public void setPioggia(int value) {
        this.pioggia = value;
    }

}
