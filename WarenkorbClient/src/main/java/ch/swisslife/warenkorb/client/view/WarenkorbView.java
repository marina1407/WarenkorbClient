package ch.swisslife.warenkorb.client.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import ch.swisslife.warenkorb.client.integration.ApiConnectionHelper;
import ch.swisslife.warenkorb.server.rest.api.DefaultApi;
import ch.swisslife.warenkorb.server.rest.model.ProduktDto;

@ManagedBean(name = "warenkorbView")
@SessionScoped
public class WarenkorbView {

	private DefaultApi api;
	private List<ProduktDto> produkteImWarenkorb;
	private int totalPrice;

	@PostConstruct
	public void init() {
		api = new DefaultApi();
	}

	public int getTotalPrice() {
		int price = 0;
		for (ProduktDto prod : produkteImWarenkorb) {
			price = price + prod.getPreis();
		}
		return price;
	}

	/**
	 * @return the produkteImWarenkorb
	 */
	public List<ProduktDto> getProdukteImWarenkorb() {
		if (produkteImWarenkorb == null) {
			// rest service
		}
		return produkteImWarenkorb;
	}

	/**
	 * @param produkteImWarenkorb the produkteImWarenkorb to set
	 */
	public void setProdukteImWarenkorb(List<ProduktDto> produkteImWarenkorb) {
		this.produkteImWarenkorb = produkteImWarenkorb;
	}

	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	
}
