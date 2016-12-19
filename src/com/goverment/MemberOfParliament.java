package com.goverment;

import static java.lang.Math.max;

/**
 * Created by MATQ on 2016-12-19.
 */
public class MemberOfParliament {
    private int member_id;          //numer id posla
    private String member_name;     //imie i nazwisko posla
    private double spendings_sum=0d;            // suma wydatkow dla kazdego posla
    private double spending_repair_office=0d;   //suma wydatkow posla
    private int how_many_trips=0;               //ile wyjazdow mial posel
    private int longest_trip=0;                 //najdluzszy wyjazd posla
    boolean was_in_italy = false;               //czy byl we wloszech

    public void MemberOfParliament(){
        this.spendings_sum=0d;
        this.spending_repair_office=0d;
        this.how_many_trips=0;
        this.longest_trip=0;
        this.was_in_italy = false;
    }

    public void SetMemberID(int member_id){
        this.member_id = member_id;
    }

    public int GetMemberID(){
        return this.member_id;
    }

    public void SetMemberName(String member_name){
        this.member_name = member_name;
    }

    public String GetMemberName (){
        return this.member_name;
    }

    public void AddToSpengingsSum (double spending){
        this.spendings_sum += spending;
    }

    public double GetSpendingsSum(){
        return this.spendings_sum;
    }

    public void SetSpendingRepairOffice(double spending_repair_office){
        this.spending_repair_office=spending_repair_office;
    }

    public void AddToSpengingRepairOffice (double spending_repair_office){
        this.spending_repair_office += spending_repair_office;
    }

    public double GetSpendingRepairOffice(){
        return this.spending_repair_office;
    }

    public void SetHowManyTrips(int how_many_trips){
        this.how_many_trips = how_many_trips;
    }

    public int GetHowManyTrips(){
        return this.how_many_trips;
    }

    public void MaxLongestTrip(int longest_trip){
        this.longest_trip = max(longest_trip, this.longest_trip);
    }

    public int GetLongestTrip(){
        return this.longest_trip;
    }

    public void SetWasInItaly(){
        this.was_in_italy = true;
    }

    public boolean GetWasInItaly(){
        return this.was_in_italy;
    }
}
