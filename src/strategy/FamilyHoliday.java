package strategy;

public class FamilyHoliday implements HolidaysStrategy {
    @Override
    public void celebrate() {
        System.out.println("It's a family strategy");
    }
}
