package mypakage;

public class Car extends Wheel{
    int tank;
    int rezerv;
    int weight;
    int speed;
    String logo;
public void showLogo (String logo){
    this.logo=logo;
    System.out.println("Marka mashiny " + this.logo);
}
public void fillTank (int tank){
    for (int i=1; this.tank<tank;){
        this.tank=this.tank+i;
    }
    if (this.tank>100){
        rezerv=this.tank-100;
        System.out.println("Bak zapolnen na 100 litrov, ostalnoe toplivo zapravleno v rezerv");
        System.out.println("Rezerv raven: "+ rezerv+" litrov");
    }
    else {
        System.out.println("Bak zapolnen na " + tank + " litrov");
    }
}
public void drive(int speed, String b){
    this.speed=speed;
    if (b=="on"){
        System.out.println("Mashina zavedena!");
        if (speed>0){
            System.out.println("Mashina edet so skorost'u "+speed);
        }
    }
            else {
                System.out.println("Dvigstel ne zaveden, mashina ne edet");
    }
}
}
