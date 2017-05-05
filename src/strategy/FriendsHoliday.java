package strategy;

public class FriendsHoliday implements HolidaysStrategy {
    @Override
    public void celebrate() {
        System.out.printf("Its a friends holiday");
    }
}
