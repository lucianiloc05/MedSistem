import java.util.Random;
import java.util.Date;

public class FisaMedicala {

    private Long id;
    private Date dataCreare;
    private String titlu;
    private String continut;

    FisaMedicala(String titlu, String continut){

        Random random = new Random();
        id = random.nextLong();

        this.titlu = titlu;
        this.continut = continut;

        dataCreare = new Date();
    }

    FisaMedicala(Long id, String titlu, String continut){
        this.id = id;
        this.titlu = titlu;
        this.continut = continut;
        dataCreare = new Date();
    }
}
