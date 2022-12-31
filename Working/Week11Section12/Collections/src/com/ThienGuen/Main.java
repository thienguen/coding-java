package com.ThienGuen;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 10, 12);

        // theatre.getSeats();

        if (theatre.reserveSeat("H01"))
        {
            System.out.println("Please pay for H01");
        }
        else
        {
            System.out.println("There is no seat H01");
        }

        if (theatre.reserveSeat("H01"))
        {
            System.out.println("Please pay for H01");
        }
        else
        {
            System.out.println("There is no seat H01 or this eat has been reserved");
        }
    }
}
