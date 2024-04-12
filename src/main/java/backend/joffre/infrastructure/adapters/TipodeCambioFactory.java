package backend.joffre.infrastructure.adapters;

public abstract class TipodeCambioFactory {

	public FeignClientAbstractFactory crea() {

		FeignClientAbstractFactory feignabstractfactory = creaTipodeCambio();

		return feignabstractfactory;
	}

	protected abstract FeignClientAbstractFactory creaTipodeCambio();
}
