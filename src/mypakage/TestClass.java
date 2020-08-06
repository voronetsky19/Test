package mypakage;

public class TestClass {

    public static void main(String[] args) {
        String b;
        Car car1 = new Car();
        car1.showLogo("Acura");
        car1.fillTank(101);
        car1.changeWheel("pravoeZadnee");
        Engine eng1= new Engine();
        b=eng1.turnEngine(1111);
        car1.drive(60,b);

    }
}
