public class DummyData {


    public static MedSistem FillData() {
        MedSistem Dummy = new MedSistem();

        Cetatean c1 = new Cetatean("Andrei Stefan", "0712 345 678");
        Cetatean c2 = new Cetatean("Dumitru George", "0712 678 345");
        Cetatean c3 = new Cetatean("Ana Maria", "0798 765 432");

        Dummy.registerCetatean(c1); Dummy.generareID(c1); Dummy.activareID(c1.getId());
        Dummy.registerCetatean(c2); Dummy.generareID(c2); Dummy.activareID(c2.getId());
        Dummy.registerCetatean(c3); Dummy.generareID(c3); Dummy.activareID(c3.getId());

        FisaMedicala F1 = new FisaMedicala("Extract 1", "Sunt Racit");
        FisaMedicala F2 = new FisaMedicala("Extract 23", "Sunt Bolanv");
        FisaMedicala F3 = new FisaMedicala("Extract 45", "Ma doare burta");

        Dummy.getRepo(c1).addFisaMedicala(F1);
        Dummy.getRepo(c2).addFisaMedicala(F2);
        Dummy.getRepo(c3).addFisaMedicala(F3);

        return Dummy;
    }
}
