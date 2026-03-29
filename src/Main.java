public class Main {
    public static void main(String[] args) {
        // Simulare caz de utilizare Activare Identificator
        
        MedSistem sistem = new MedSistem();
        
        Cetatean cetatean = new Cetatean("Popescu Ion", "1900101123456");

        System.out.println("Sa creat cetateanul");
        sistem.registerCetatean(cetatean);
        sistem.generareID(cetatean);
        
        sistem.activareID(cetatean.getId());
        
        if(cetatean.getId().getActivare() == true){
            System.out.println("Sa activat cetateanul");
        }
        else {
            System.out.println("Nu sa activat cetateanul");
        }
    }
}
