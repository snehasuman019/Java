//package 01.Basics;

public class ParkingBill {
    public static void main(String[] args) {
    //Write a program to calculate the parking bill based on the specific conditions:
//first 2 hrs = 50/h
//next 3 hrs = 25/h
//..remaining hrs = 10/h
        // float hours = 7;
        // float bill = 0;
        // if(hours <= 2){
        //     bill = hours*50;
        // }
        // else if(hours <=5){
        //     bill = 2*50 + (hours - 2)*25;
        // }
        // else{
        //     bill = 2*50 + 3*25 + (hours -5)*10;
        // System.out.println("The parking bill is: " + bill);
        
        // }

//electicity bill
//0-100 unit 2rup/unit
//101-200 unit 3rup/unit
//rest 4rup/unit
//fixed charge = 50rup
//if bill excedes 2000 pay on extra 10% fine
        int unit = 105;
        int bill = 0;
        if(unit <= 100){
            bill = unit*2 + 50;
        }else if(unit <= 200){
            bill = 100*2 + (unit -100)*3 + 50;

        }
        else{
            bill = 100*2 + 100*3 + (unit -200)*4 + 50;
            if(bill > 2000){
                bill += bill/10;
            }
        }
        System.out.println("The electricity bill is: " + bill);


        }
}
