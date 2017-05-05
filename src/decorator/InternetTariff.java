package decorator;

public class InternetTariff extends TariffDecorator {
    public InternetTariff(CountTariffInterface tariff) {
        super(tariff);
    }

    @Override
    public void processTariff() {
        System.out.println("You have unlimited internet");
        super.processTariff();
    }
}
