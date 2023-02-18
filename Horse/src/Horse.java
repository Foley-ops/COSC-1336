/******************************************************************************
 Programmer: Nicholas Foley
 Date: 02/16/2023
 Lab 10
 Instructor: Dr. Rafael Azuaje
 College: Northeast Lakeview College
 *******************************************************************************/
// Class to define parameters of a Horse
 public class Horse {
   private String name;
   private String color;
   private int birthYear;

   // Constructor with parameters that can be used outside of class
    public Horse(String name, String color, int birthYear) {
        this.name = name;
        this.color = color;
        this.birthYear = birthYear;
    }
   
    // Getters and Setters 
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
      this.name = name;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
      this.color = color;
    }
    
    public int getBirthYear(){
        return birthYear;
    }
    
    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

}
