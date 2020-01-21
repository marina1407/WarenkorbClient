package ch.swisslife.warenkorb.client.view;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import ch.swisslife.warenkorb.server.rest.ApiException;
import ch.swisslife.warenkorb.server.rest.api.DefaultApi;
import ch.swisslife.warenkorb.server.rest.model.ProduktDto;

@ManagedBean(name = "produktAuswahlView")
@SessionScoped
public class ProduktAuswahlView {

	private DefaultApi api;
	private List<ProduktDto> alleProdukte;

	private ProduktDto produkt;

	@PostConstruct
	public void init() {
		api = new DefaultApi();
	}

	public void addToWarenkorb() {
		if (produkt != null) {
			try {
				api.addToWarenkorb(produkt);
			} catch (ApiException e) {
				e.printStackTrace();
			}
		}
	}

	public List<ProduktDto> getAlleProdukte() {
		if (alleProdukte == null) {
			try {
				alleProdukte= (List<ProduktDto>) api.getProduktListe();
			} catch (ApiException e) {
				e.printStackTrace();
			}
		}
		return alleProdukte;
	}

	/**
	 * @return the produkt
	 */
	public ProduktDto getProdukt() {
		return produkt;
	}

	/**
	 * @param produkt the produkt to set
	 */
	public void setProdukt(ProduktDto produkt) {
		this.produkt = produkt;
	}

}
