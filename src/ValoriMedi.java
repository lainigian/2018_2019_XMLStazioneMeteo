import stazione_meteo.Stazione;

public class ValoriMedi 
{

	private float temperatura;
	private float umidita;
	private float pressione;
	private float velocitaVento;
	private float direzioneVento;
	private float pioggia;
	
	public ValoriMedi(Stazione stazione)
	{
		setTemperatura(-1);
		setUmidita(-1);
		setPressione(-1);
		setVelocitaVento(-1);
		setDirezioneVento(-1);
		setPioggia(-1);
		if (stazione!=null)
			calcolaMedie(stazione);
		
	}
	
	private void calcolaMedie(Stazione stazione)
	{
		setTemperatura(0);
		setUmidita(0);
		setPressione(0);
		setVelocitaVento(0);
		setDirezioneVento(0);
		setPioggia(0);
		
		int numeroRilevazioni=stazione.getNumeroElementi();
		for (int i = 0; i < numeroRilevazioni; i++) 
		{
			temperatura+=stazione.getSingolaRilevazione(i).getTemperatura();
			umidita+=stazione.getSingolaRilevazione(i).getUmidita();
			pressione+=stazione.getSingolaRilevazione(i).getPressione();
			velocitaVento+=stazione.getSingolaRilevazione(i).getVelocitaVento();
			direzioneVento+=stazione.getSingolaRilevazione(i).getDirezioneVento();
			pioggia+=stazione.getSingolaRilevazione(i).getPioggia();
		}
		temperatura=temperatura/numeroRilevazioni;
		umidita=umidita/numeroRilevazioni;
		pressione=pressione/numeroRilevazioni;
		velocitaVento=velocitaVento/numeroRilevazioni;
		direzioneVento=direzioneVento/numeroRilevazioni;
		pioggia=pioggia/numeroRilevazioni;
		
	}
	
	@Override
	public String toString() {
		return "ValoriMedi \ntemperatura=" + temperatura + " °C \numidita=" + umidita + " %\npressione=" + pressione
				+ " MB\nvelocitaVento=" + velocitaVento + " km/h\ndirezioneVento=" + direzioneVento + "°\npioggia=" + pioggia
				+" mm";
	}

	public float getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	public float getUmidita() {
		return umidita;
	}
	public void setUmidita(float umidita) {
		this.umidita = umidita;
	}
	public float getPressione() {
		return pressione;
	}
	public void setPressione(float pressione) {
		this.pressione = pressione;
	}
	public float getVelocitaVento() {
		return velocitaVento;
	}
	public void setVelocitaVento(float velocitaVento) {
		this.velocitaVento = velocitaVento;
	}
	public float getDirezioneVento() {
		return direzioneVento;
	}
	public void setDirezioneVento(float direzioneVento) {
		this.direzioneVento = direzioneVento;
	}
	public float getPioggia() {
		return pioggia;
	}
	public void setPioggia(float pioggia) {
		this.pioggia = pioggia;
	}
	
	
	
}
