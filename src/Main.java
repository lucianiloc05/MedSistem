import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        //Creare de date 'dummy'
        MedSistem Sis = DummyData.FillData();

        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Programul ruleaza. Sunteti Doctor sau Pacient?");
        System.out.println("Introduceti 'Doctor' / 'Pacient': ");

        try{
            String option = cin.readLine();
            String option1;

            if(option.equals("Doctor")){
                System.out.println("Optiuni: ");
                System.out.println("1. Visualizare Pacienti: ");
                System.out.println("2. Selectare Pacient: ");
                System.out.println("3. Oprire: ");

                while(!option.equals("3")) {


                    option1 = cin.readLine();

                    if (option1.equals("1")) {
                        Sis.afisarePacienti();
                    }

                    if (option1.equals("2")){
                        String option2;
                        System.out.println("Introdu numele unui pacient: ");

                        while(true) {
                            option2 = cin.readLine();
                        }
                    }
                }

            }
        }
        catch (Exception E){
            System.out.println(E);
        }


    }
}