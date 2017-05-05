package decorator;

public class SmsTariff extends TariffDecorator {

    public SmsTariff(CountTariffInterface tariff) {
        super(tariff);
    }

    @Override
    public void processTariff() {
        System.out.println("You have 100 SMS");
        super.processTariff();
    }
}
