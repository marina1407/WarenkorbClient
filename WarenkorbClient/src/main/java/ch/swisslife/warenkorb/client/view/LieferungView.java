package ch.swisslife.warenkorb.client.view;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import ch.swisslife.warenkorb.server.rest.ApiException;
import ch.swisslife.warenkorb.server.rest.api.DefaultApi;
import ch.swisslife.warenkorb.server.rest.model.BestellungDto;
import ch.swisslife.warenkorb.server.rest.model.KundeDto;

@ManagedBean(name = "lieferungView")
@SessionScoped
public class LieferungView {

	private BestellungDto bestellung;
	private DefaultApi api;

	@PostConstruct
	public void init() {
		api = new DefaultApi();
	}

	/**
	 * Aufruf des REST-Services. Speichert die Bestellung in der Datenbank.
	 */
	public void warenkorbBestellen() {
		if (bestellung != null) {
			try {
				api.addToBestelltListe(bestellung);
			} catch (ApiException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * @return the bestellung
	 */
	public BestellungDto getBestellung() {
		return bestellung;
	}

	/**
	 * @param bestellung the bestellung to set
	 */
	public void setBestellung(BestellungDto bestellung) {
		this.bestellung = bestellung;
	}

}
