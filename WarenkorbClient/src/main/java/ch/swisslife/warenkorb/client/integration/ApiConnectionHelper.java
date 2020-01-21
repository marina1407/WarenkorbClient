package ch.swisslife.warenkorb.client.integration;

import ch.swisslife.warenkorb.server.rest.ApiClient;
import ch.swisslife.warenkorb.server.rest.api.DefaultApi;

public class ApiConnectionHelper {

	private static DefaultApi api;

	public static void setupApi() {
		api = new DefaultApi();
	}

	/**
	 * @return the api
	 */
	public static DefaultApi getApi() {
		if (api == null) {
			setupApi();
		}
		return api;
	}

}
