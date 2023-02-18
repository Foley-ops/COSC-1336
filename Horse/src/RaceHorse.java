/******************************************************************************
 Programmer: Nicholas Foley
 Date: 02/16/2023
 Lab 10
 Instructor: Dr. Rafael Azuaje
 College: Northeast Lakeview College
 *******************************************************************************/
/*This class provides numberOfRaces in addition to name, color, and birthYear from
 the "Horse" class*/
 public class RaceHorse extends Horse {
    private int numberOfRaces;

    public RaceHorse(String name, String color, int birthYear, int numberOfRaces) {
      // superclass constructor - takes info from "Horse" and uses it here
        super(name, color, birthYear);
        this.numberOfRaces = numberOfRaces;
    }

    // Getter and Setter
    public int getNumberOfRaces() {
      return numberOfRaces;
    }
    
    public void setNumberOfRaces(int numberOfRaces) {
      this.numberOfRaces = numberOfRaces;
    }
}
