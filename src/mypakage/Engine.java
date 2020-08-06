package mypakage;

public class Engine {
    int parol=1111;
    public String turnEngine(int a) {
        String b;
        if (a==parol){
         System.out.println("Parol prinat, dvigatel vklychon");
         b="on";
        }
        else{
         System.out.println("Oshibka! Neverny parol!");
         b="off";
        }
        return b;
    }
}
