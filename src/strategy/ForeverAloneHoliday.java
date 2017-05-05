package strategy;

public class ForeverAloneHoliday implements HolidaysStrategy {
    @Override
    public void celebrate() {
        System.out.println("I m happy");
    }
}
