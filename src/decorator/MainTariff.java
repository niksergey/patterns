package decorator;

public class MainTariff implements CountTariffInterface {
    @Override
    public void processTariff() {
        System.out.println("This is MTS tariff");
    }
}
