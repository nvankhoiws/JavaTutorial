package core.com.udemy.timbuchalka.section13_collections.binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Olympian", 8, 12);
//        theatre.getSeats();
        if(theatre.reserveSeat("D12")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

//        if(theatre.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }

        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        seatCopy.get(5).reserve();

        boolean reservedOrNot = theatre.reserveSeat("A06");
        if (!reservedOrNot) System.out.println("The seat A06 is already reserved!");

        for (int i = 0, length = seatCopy.size(); i < length; i++) {
            System.out.print(seatCopy.get(i).getSeatNumber() + " ");
        }
        System.out.println("==========================================");
        Collections.reverse(seatCopy);

        for (int i = 0, length = seatCopy.size(); i < length; i++) {
            System.out.print(seatCopy.get(i).getSeatNumber() + " ");
        }

        System.out.println("==========================================");
        Collections.shuffle(seatCopy);

        for (int i = 0, length = seatCopy.size(); i < length; i++) {
            System.out.print(seatCopy.get(i).getSeatNumber() + " ");
        }
    }
}
