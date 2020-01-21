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
		if (alleProdukte != null) {
			return alleProdukte;
		} else {
			try {
				return (List<ProduktDto>) api.getProduktListe();
			} catch (ApiException e) {
				e.printStackTrace();
			}
			List<ProduktDto> liste = new ArrayList<ProduktDto>();
			liste.add(new ProduktDto(1, "iPad 128 GB", 239));
			liste.add(new ProduktDto(2, "iPad Ladekabel", 39));
			liste.add(new ProduktDto(3, "Apple Kopfhoerer", 39));
			liste.add(new ProduktDto(4, "MacBook Pro 15 512 GB", 1500));
			liste.add(new ProduktDto(5, "iPhone 11 256 GB", 1299));
			liste.add(new ProduktDto(6, "iPhone 11 128 GB", 1099));
			liste.add(new ProduktDto(7, "Samsung Galaxy s10 256 GB", 799));
			liste.add(new ProduktDto(8, "Samsung Galaxy s10 128 GB", 699));
			return liste;
		}
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
