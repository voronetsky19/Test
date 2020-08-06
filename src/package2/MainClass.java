package package2;

public class MainClass {

    public static void main(String[] args) {
        int totalCost=0;
        int i;
        boolean isSorted=false;
        double a;
        String name;

        Cars [] taxi = new Cars[11];
        taxi[0] = new RenaultLargus();
        taxi[1]= new RenaultLogan();
        taxi[2]= new RenaultLogan();
        taxi[3]= new VWPoloSedan();
        taxi[4]= new VWPoloSedan();
        taxi[5]= new VWPoloSedan();
        taxi[6] = new VWJetta();
        taxi[7]= new LadaGranta();
        taxi[8]= new LadaVesta();
        taxi[9]= new LadaVesta();
        taxi[10]= new Cars();


        while (!isSorted) {
            isSorted=true;
            for (i = 0; i < taxi.length-2; i++) {
                if (taxi[i].gasOut > taxi[i + 1].gasOut) {
                    isSorted=false;
                    taxi[10] = taxi[i];
                    taxi[i] = taxi[i + 1];
                    taxi[i + 1] = taxi[10];
                }
            }
        }
        for (i=0;i<10;i++) {
            totalCost = totalCost + taxi[i].cost;
        }
        System.out.println("Total cost is: " + totalCost);

        System.out.println("Rashody topliva vseh avtomobiley:");
        for (i=0;i<10;i++){
            System.out.print(taxi[i].logo+ " ");
            System.out.println(taxi[i].gasOut);
        }

        System.out.println("Avtomobily s maximalnoy skorosty:");
        for (i=0;i<10;i++) {
            if (taxi[i].maxSpeed >= 190) {
                System.out.println(taxi[i].logo + " " + taxi[i].maxSpeed);
            }
        }

    }
}
