//package 01.Basics;

public class ParkingBill {
    public static void main(String[] args) {
    //Write a program to calculate the parking bill based on the specific conditions:
//first 2 hrs = 50/h
//next 3 hrs = 25/h
//..remaining hrs = 10/h
        float hours = 7;
        float bill = 0;
        if(hours <= 2){
            bill = hours*50;
        }
        else if(hours <=5){
            bill = 2*50 + (hours - 2)*25;
        }
        else{
            bill = 2*50 + 3*25 + (hours -5)*10;
        System.out.println("The parking bill is: " + bill);
        
        }
        }
}
