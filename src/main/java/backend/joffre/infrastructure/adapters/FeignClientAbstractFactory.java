package backend.joffre.infrastructure.adapters;

import backend.joffre.application.services.ApiServiceProxy;
import backend.joffre.domain.feignDTO.ExchangeRate;

public abstract class FeignClientAbstractFactory implements ApiServiceProxy {

	protected ExchangeRate exchange;

	public ExchangeRate getTipodeCambioDolares() {
		exchange = new ExchangeRate();
		return exchange;
	}

	public ExchangeRate getTipodeCambioSoles() {
		exchange = new ExchangeRate();
		return exchange;
	}

	public ExchangeRate getTipodeCambioPesosmexicanos() {
		exchange = new ExchangeRate();
		return exchange;
	}

	public ExchangeRate getTipodeCambioEUROS() {
		exchange = new ExchangeRate();
		return exchange;
	}

	public ExchangeRate getTipodeCambioYenes() {
		exchange = new ExchangeRate();
		return exchange;
	}

}
