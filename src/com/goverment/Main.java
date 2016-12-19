package com.goverment;

public class Main {

    public static void main(String[] args) {
	    ArgumentParser();

	    Parliament parliament = new Parliament();

	    ParseMembers();

        Parliament.List_OfMembers tmp;
	    for (MemberOfParliament membr: Parliament.List_OfMembers){
            ParseTripsAndSpendings();
        }

        

    }
}
