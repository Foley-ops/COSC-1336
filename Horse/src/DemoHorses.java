/******************************************************************************
 Programmer: Nicholas Foley
 Date: 02/16/2023
 Lab 10
 Instructor: Dr. Rafael Azuaje
 College: Northeast Lakeview College
 *******************************************************************************/
// public class with main method containing code to demonstrate usage of classes
 public class DemoHorses {
  public static void main(String[] args) {
    // Uses only the "Horse" class
      Horse horse1 = new Horse("Jet", "Black", 2018);
      // Uses the "RaceHorse" class, which also uses the object "Horse"
      RaceHorse horse2 = new RaceHorse("Lightning", "White", 2021, 12);
      
      System.out.println("Horse 1:");
      System.out.println("Name: " + horse1.getName());
      System.out.println("Color: " + horse1.getColor());
      System.out.println("Birth Year: " + horse1.getBirthYear());
      
      System.out.println("\nHorse 2:");
      System.out.println("Name: " + horse2.getName());
      System.out.println("Color: " + horse2.getColor());
      System.out.println("Birth Year: " + horse2.getBirthYear());
      System.out.println("Number Of Races: "+ horse2.getNumberOfRaces());
  }
}
