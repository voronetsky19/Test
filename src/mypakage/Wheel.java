package mypakage;

public class Wheel {
    int wheel1; // левое переднее
    int wheel2; // правое переднее
    int wheel3; // левое заднее
    int wheel4; // правое заднее

    public void changeWheel(String wheel) {
        if (wheel=="levoePerednee"){
            wheel1++;
            System.out.println("Levoe perednee koleso zameneno " + wheel1+ " raz");
            carPicture("x","0","0","0");
        }
        else if (wheel=="pravoePerednee"){
            wheel2++;
            System.out.println("Pravoe perednee koleso zameneno "+ wheel2+ " raz");
            carPicture("0","x","0","0");
        }
        else if (wheel=="levoeZadnee"){
            wheel3++;
            System.out.println("Levoe zadnee koleso zameneno "+ wheel3+ " raz");
            carPicture("0","0","x","0");
        }
        else if (wheel=="pravoeZadnee") {
            wheel4++;
            System.out.println("Pravoe zadnee koleso zameneno "+ wheel4+ " raz");
            carPicture("0","0","0","x");
        }
        else {
            System.out.println("Vvedite vernoe znachenie kolesa dla zameny: levoePerednee,pravoePerednee,levoeZadnee ili pravoeZadnee ");
        }
        }
        public void carPicture(String x, String y, String z,String t){
            System.out.println(" _______");
            System.out.println(x+"|     |"+y);
            System.out.println(" |     |");
            System.out.println(z+"|     |"+t);
            System.out.println(" _______");
        }

    }

