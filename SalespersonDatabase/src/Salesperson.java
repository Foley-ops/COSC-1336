/******************************************************************************
 Programmer: Nicholas Foley
 Date: 02/16/2023
 Lab 9
 Instructor: Dr. Rafael Azuaje
 College: Northeast Lakeview College
 *******************************************************************************/
public class Salesperson {
    private int id;
    private double sales;

    public Salesperson(int id, double sales) {
        this.id = id;
        this.sales = sales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
}
