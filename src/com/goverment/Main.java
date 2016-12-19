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

        Funkcja ArgumentParser jak sama nazwa wskazuje, bd parsowala argumenty wywolania programu, nastepnie jest tworzony nowyobiekt parlament dla danej kadencji sejmu, jak bd wiecej kadencji, bd wiecej parlamentow
nastepnie dla kazdej kadencji sejmu bd parsowac czlonkow, czyli poslow, majac dla kazdej kadencji sejmu liste poslow, przejdziemy po tej liscie i dla bd zliczac dla kazdego posla jego wyjazdy (rzeczy zwiazane z wyjazdami) i z wydatkami 
na koniec powypisuje co trzeba i tyle :)


    }
}
