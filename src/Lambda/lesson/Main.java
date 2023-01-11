package Lambda;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Checkable checkablePrevious = new CheckableImpl();
        Checkable checkable = value -> value.contains("a");

        List<String > listOfCities = List.of("Szczecin", "Warszawa", "Gdynia", "Zakopane");

        printCities(listOfCities, checkable);


    }

    private static void printCities(List<String> listOfCities, Checkable checkable) {
        for (String listOfCity : listOfCities) {
            if(checkable.myTester(listOfCity))
            System.out.println(listOfCity);
        }
    }
}