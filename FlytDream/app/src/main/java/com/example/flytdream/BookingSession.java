package com.example.flytdream;

import java.util.ArrayList;

public class BookingSession {
    private City departCity;
    private City arriveCity;
    private String date;
    private int classId;
    private String classSelected;
    private int adult;
    private int child;
    private int infant;
    private Flight flight;
    private ArrayList<String> seats;
    private int totalCost;

    public BookingSession() {
        departCity = new City("0", "0", "0");
        arriveCity = new City("0", "0", "0");
        date = "";
        classId = 0;
        classSelected = "";
        adult = 0;
        child = 0;
        infant = 0;
        flight = new Flight();
        seats = new ArrayList<>();
        totalCost = 0;
    }

    public City getDepartCity() {return departCity;}
    public City getArriveCity() {return arriveCity;}
    public String getDate() {return date;}
    public int getClassId() {return classId;}
    public String getClassSelected() {return classSelected;}
    public int[] getPassenger() {
        int[] passenger = {adult, child, infant};
        return passenger;
    }
    public Flight getFlight() {return flight;}

    public void setDepartCity(City newDepartCity) {departCity = newDepartCity;}
    public void setArriveCity(City newArriveCity) {arriveCity = newArriveCity;}
    public void setDate(String newDate) {
        date = newDate;
    }
    public void setClassId(int newClassId) {
        classId = newClassId;
    }
    public void setClass(String newClass) {
        classSelected = newClass;
    }
    public void setPassenger(int newAdult, int newChild, int newInfant) {
        adult = newAdult;
        child = newChild;
        infant = newInfant;
    }
    public void setFlight(Flight newFlight) {flight = newFlight;}
}