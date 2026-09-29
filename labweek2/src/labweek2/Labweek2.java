package labweek2;

import java.util.Scanner;
import java.util.ArrayList;

public class Labweek2 {
    
    public static void main(String[] args) {
        
        Scanner keyb = new Scanner(System.in);
        
        ArrayList<String> stopNames = new ArrayList<>();
        ArrayList<Integer> boardings = new ArrayList<>();
        ArrayList<Integer> alighting = new ArrayList<>();
        
        System.out.println("Otobüs koltuk sayısını giriniz:");
        int limit = keyb.nextInt();
        
        System.out.println("Kaç durak olacak?");
        int stopnum = keyb.nextInt();
        
        int overcapacity = 0;
        
        keyb.nextLine();
        for(int i = 0; i < stopnum; i++){
            System.out.println("Durak ismi giriniz:");
            stopNames.add(keyb.nextLine());
        }
        
        
        for(int i = 0; i < stopnum; i++){
            while(true){
                System.out.println(stopNames.get(i) + " istasyonunda kaç kişi bindi?");
                int sayı = keyb.nextInt();
                if(sayı < 0){
                    System.out.println("Sayı negatif olamaz!");
                } else {
                    boardings.add(sayı);
                    break;
                } 
            }
        }
        
        
        for(int i = 0; i < stopnum; i++){
            int currentPassengersBeforeAlighting = 0;
            for(int j = 0; j <= i; j++){
                currentPassengersBeforeAlighting += boardings.get(j);
                if(j < i){
                    currentPassengersBeforeAlighting -= alighting.get(j);
                }
            }
            
            while(true){
                System.out.println(stopNames.get(i) + " istasyonunda kaç kişi indi? (Otobüsteki mevcut yolcu: " + currentPassengersBeforeAlighting + ")");
                int sayı = keyb.nextInt();
                
                if(sayı < 0){
                    System.out.println("Sayı negatif olamaz!");
                } else if(sayı > currentPassengersBeforeAlighting){
                    System.out.println("Hata: Otobüsteki yolcu sayısından (" + currentPassengersBeforeAlighting + ") fazla kişi inemez!");
                } else {
                    alighting.add(sayı);
                    break;
                } 
            }
        }
        
        int yolcusayısı = 0;
        
        System.out.println("\n--- DURAK ÖZETLERİ ---");
        for(int i = 0; i < stopnum; i++){
            yolcusayısı = yolcusayısı + boardings.get(i) - alighting.get(i);
            
            if(yolcusayısı > limit){
                System.out.println("Warning: Bus is over capacity at " + stopNames.get(i));
                overcapacity += 1;
            }
            System.out.println(stopNames.get(i) + " İstasyonu -> Binen: " + boardings.get(i) + " | İnen: " + alighting.get(i) + " | Toplam Yolcu: " + yolcusayısı);
        }
        
        int maxboarding = 0;
        for(int i = 0; i < stopnum; i++){
            if(boardings.get(i) > maxboarding){
                maxboarding = boardings.get(i);
            }
        }
        
        int binenler = 0;
        for(int i = 0; i < stopnum; i++){
            binenler += boardings.get(i);
        }
        
        System.out.println("\n--- GENEL İSTATİSTİKLER ---");
        System.out.println("En çok binen yolcu: " + maxboarding);
        System.out.println("Kapasite aşımı yaşanan durak sayısı: " + overcapacity);
        System.out.println("Durakların ortalama binen yolcusu: " + (stopnum > 0 ? binenler / stopnum : 0));
        System.out.println("Son duraktaki kalan yolcu sayısı: " + yolcusayısı);
        
        keyb.close();
    }
}