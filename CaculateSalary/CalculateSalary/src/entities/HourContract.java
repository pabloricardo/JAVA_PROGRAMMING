package entities;

import java.util.Date;

/**
 * HourContract
 */
public class HourContract {

    private int hours;
    private double valuePerHour;
    private Date date;

    public HourContract() {
    }

    public HourContract(int hours, double valuePerHour, Date date) {
        this.hours = hours;
        this.valuePerHour = valuePerHour;
        this.date = date;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getValuePerHour() {
        return this.valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double totalValue(){
        return valuePerHour * hours;
    }
}
