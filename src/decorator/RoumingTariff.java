package decorator;

public class RoumingTariff extends TariffDecorator {

    public RoumingTariff(CountTariffInterface tariff) {
        super(tariff);
    }

    @Override
    public void processTariff() {
        System.out.println("You have 10 days in roaming");
        super.processTariff();
    }
}
