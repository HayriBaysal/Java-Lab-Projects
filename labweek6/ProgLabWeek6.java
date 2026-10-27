package proglabweek6;

import java.util.ArrayList;

public class ProgLabWeek6 {

    
    public static void main(String[] args) {
        ArrayList<Ride> yakub  = new ArrayList<Ride>();
 
 
        Ride ride1 = new Ride("Muhammed", "Totat", "Artvin", 10, 10, 10);
        Ride ride2 = new EconomyRide(4, "Furkan", "Sivas", "Ankara", -4, 10, 10);
        Ride ride3 = new PremiumRide(40, 5, "Hayri", "Kayseri", "Kırıkkale", 50, 10, 10);
        Ride ride4 = new SharedRide(10, 2, "Berkay", "Niğde", "Kayseri", 30, 20, 10);
        Ride ride5 = new EconomyRide(2, "Kerem", "Sivas", "Ankara", 3, 1, 10);
 
 
        yakub.add(ride1);
        yakub.add(ride2);
        yakub.add(ride3);
        yakub.add(ride4);
        yakub.add(ride5);
 
 
        for (int i = 0; i <= yakub.size()-1;i++){
            System.out.println();
            System.out.println();
            System.out.println(yakub.get(i).toString());
            System.out.println();
            System.out.println();
 
        }
    }
    
}
