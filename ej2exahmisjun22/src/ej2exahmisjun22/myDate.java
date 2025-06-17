package ej2exahmisjun22;

public class myDate {

    public boolean isDateCorrect(int day, int month, int year) {
        if (month < 1 || month > 12 || day < 1) {
            return false;
        }

        int daysInMonth = 31; // valor por defecto

        if (month == 2) {
            daysInMonth = 28; // febrero
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30; // abril, junio, septiembre, noviembre
        }

        if (day > daysInMonth) {
            return false;
        }

        return true;
    }
    
}