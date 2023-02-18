/******************************************************************************
 Programmer: Nicholas Foley
 Date: 02/16/2023
 Lab 10
 Instructor: Dr. Rafael Azuaje
 College: Northeast Lakeview College
 *******************************************************************************/
public class RaceHorse extends Horse {
    private int numberOfRaces;

    public RaceHorse(String name, String color, int birthYear, int numberOfRaces) {
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
