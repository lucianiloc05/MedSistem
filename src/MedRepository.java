import java.util.ArrayList;
import java.util.List;

public class MedRepository {

    Identificator id;
    List<FisaMedicala> dosar;

    public List<FisaMedicala> getFiseMedicale(){
        return dosar;
    }

    public void addFisaMedicala(FisaMedicala fm){
        dosar.add(fm);
    }

    public Identificator getID(){ return id; }

    MedRepository(Identificator id){
        this.id = id;
        dosar = new ArrayList<>();
    }

    public Identificator getId() { return id;}

}
