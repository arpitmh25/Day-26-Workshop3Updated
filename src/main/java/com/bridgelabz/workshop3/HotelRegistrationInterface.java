package com.bridgelabz.workshop3;

import java.time.LocalDate;
import java.util.ArrayList;

public interface HotelRegistrationInterface {

    public void addHotel(String hotelName, int rating, double weekdayRegularCustomerCost, double weekendRegularCustomerCost);

    public int getHotelListSize();

    public void printHotelList();

    public ArrayList<Hotel> getHotelList();

    public String getCheapestHotel(LocalDate startDate, LocalDate endDate);
}