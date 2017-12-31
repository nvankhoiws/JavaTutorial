package core.com.udemy.timbuchalka.section13_collections.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by dev on 2/12/2015.
 */
public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public static Comparator<Seat> SORT_BY_SEAT_NAME = new Comparator<Seat>() {
        @Override
        public int compare(Seat o1, Seat o2) {
            return (o1.seatNumber.compareTo(o2.seatNumber) > 0) ? 1 : ((o1.seatNumber.compareTo(o2.seatNumber) < 0) ? -1 : 0);
        }
    };

    public static Comparator<Seat> SORT_BY_PRICE = new Comparator<Seat>() {
        @Override
        public int compare(Seat o1, Seat o2) {
            return (int) Math.floor(o1.price - o2.price);
        }
    };

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows -1);
        for (char row = 'A'; row <= lastRow; row++) {
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Double price = 12.0;
                if (row < 'D' && seatNum > 3 && seatNum < 10) {
                    price = 14.0;
                }
                if (row > 'F' && (seatNum < 4 || seatNum > 9)){
                    price = 7.0;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public boolean reserveSeat(String seatNumber) {
        int found = Collections.binarySearch(seats, new Seat(seatNumber));
        if (found >= 0){
            return seats.get(found).reserve();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;
        private Double price = 0.0;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public Seat(String seatNumber, Double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        public boolean reserve() {
            if(!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if(this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public Double getPrice() {
            return price;
        }

        @Override
        public int compareTo(Seat o) {
//            return (this.seatNumber.compareTo(o.seatNumber) > 0) ? 1 : ((this.seatNumber.compareTo(o.seatNumber) < 0) ? -1 : 0);
            return (this.price.compareTo(o.price) > 0) ? 1 : ((this.price.compareTo(o.price) < 0) ? -1 : 0);
        }

        @Override
        public String toString() {
            return seatNumber;
        }
    }

}
