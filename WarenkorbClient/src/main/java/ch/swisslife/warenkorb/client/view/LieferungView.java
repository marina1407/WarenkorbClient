package ch.swisslife.warenkorb.client.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import ch.swisslife.warenkorb.server.rest.model.BestellungDto;
import ch.swisslife.warenkorb.server.rest.model.KundeDto;

@ManagedBean(name = "lieferungView")
@SessionScoped
public class LieferungView {

	private BestellungDto bestellung;

	public void warenkorbBestellen() {

	}

}
