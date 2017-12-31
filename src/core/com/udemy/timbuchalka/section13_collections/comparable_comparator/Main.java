package core.com.udemy.timbuchalka.section13_collections.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Olympian", 8, 12);
        if(theatre.reserveSeat("D12")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        printList(theatre.getSeats());

        System.out.println("=======================SORT_BY_SEAT_NAME===================");
        Collections.sort(theatre.getSeats(), Theatre.SORT_BY_SEAT_NAME);
        printList(theatre.getSeats());

        System.out.println("=======================SORT_BY_SEAT_PRICE===================");
        Collections.sort(theatre.getSeats(), Theatre.SORT_BY_PRICE);
        printList(theatre.getSeats());

    }

    private static void printList(List<Theatre.Seat> seats) {
        for (int i = 0, length = seats.size(); i < length; i++) {
            System.out.print(seats.get(i).getSeatNumber() + " $" + seats.get(i).getPrice() + " --> ");
        }
    }
}
