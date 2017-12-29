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
        printList(seatCopy);
        System.out.println("max " + Collections.max(seatCopy));
        System.out.println("min " + Collections.min(seatCopy));

        System.out.println("==========================================");
        Collections.reverse(seatCopy);
        printList(seatCopy);
        System.out.println("max " + Collections.max(seatCopy));
        System.out.println("min " + Collections.min(seatCopy));

        System.out.println("==========================================");
        Collections.shuffle(seatCopy);
        printList(seatCopy);
        System.out.println("max " + Collections.max(seatCopy));
        System.out.println("min " + Collections.min(seatCopy));

        System.out.println("==========================================");
        // Try to copy from a list to another list
        List<Theatre.Seat> copiedList = new ArrayList<>(seatCopy.size());
        Collections.copy(copiedList, seatCopy);
        printList(copiedList);
    }

    private static void printList(List<Theatre.Seat> seats) {
        for (int i = 0, length = seats.size(); i < length; i++) {
            System.out.print(seats.get(i).getSeatNumber() + " ");
        }
    }
}
