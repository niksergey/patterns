package decorator;

public class TariffDecorator implements CountTariffInterface {
    private CountTariffInterface tariff;

    @Override
    public void processTariff() {
        tariff.processTariff();
    }

    public TariffDecorator(CountTariffInterface tariff) {
        this.tariff = tariff;
    }
}
