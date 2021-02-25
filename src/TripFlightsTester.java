import java.util.ArrayList;

public class TripFlightsTester {
    public static void main(String[] args) {

        Trip vacation = new Trip();

        //Should print 690
        System.out.println(vacation.getDuration());

        //Should print 15
        System.out.println(vacation.getShortestLayover());

    }
}
