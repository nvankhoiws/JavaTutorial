package core.com.udemy.timbuchalka.section13_collections.binarySearch;

import java.util.*;

/**
 * Created by dev on 2/12/2015.
 */
public class Theatre {
    private final String theatreName;
    public List<Seat> seats = new ArrayList<>();

    private static int timeCounter = 0;

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows -1);
        for (char row = 'A'; row <= lastRow; row++) {
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
//        Seat requestedSeat = null;
        int found = Collections.binarySearch(seats, new Seat(seatNumber));
        if (found >= 0){
//            return requestedSeat = seats.get(found).reserve();
            return seats.get(found).reserve();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
//        Seat requestedSeat = null;
//        for(Seat seat : seats) {
//            timeCounter++;
//            if(seat.getSeatNumber().equals(seatNumber)) {
//                requestedSeat = seat;
//                break;
//            }
//        }
//        System.out.println("The times to loop over collections of seats is " + timeCounter);
//        if(requestedSeat == null) {
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }
//
//        return requestedSeat.reserve();
    }

    // for testing
    public void getSeats() {
        for(Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
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

        @Override
        public int compareTo(Seat o) {
            return (this.seatNumber.compareTo(o.seatNumber) > 0) ? 1 : ((this.seatNumber.compareTo(o.seatNumber) < 0) ? -1 : 0);
        }

        @Override
        public String toString() {
            return seatNumber;
        }
    }

}
