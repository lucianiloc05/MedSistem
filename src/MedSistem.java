import java.util.ArrayList;
import java.util.List;

public class MedSistem {

    static Long id;
    List<Cetatean> pacient;
    List<MedRepository> repo;

    MedSistem(){
        pacient = new ArrayList<Cetatean>();
        repo = new ArrayList<MedRepository>();
    }

    public void registerCetatean(Cetatean c){
        pacient.add(c);
    }

    /**
    De asemena creaza si Repou
     */
    public void generareID(Cetatean c){
        if(id == null){ id = 0L;}
        id = id + 1L;

        Identificator newId = new Identificator(id);
        c.setID(newId);

        MedRepository newRepo = new MedRepository(newId);
        repo.add(newRepo);
    }

    public void activareID(Identificator id){
        for(MedRepository m : repo){
            if (m.getID().equals(id)){
                id.activare();
                return;
            }
        }
        System.out.println("Eroare activare");
    }

    public void gestionarePermisuneAcces(PermisiuneAcces perm){
        //?
    }

    public Cetatean getPacientbyName(String input){
        for(Cetatean p : pacient){
            if(p.getNume().equals(input)){
                return p;
            }
        }

        return null;
    }

    public Cetatean getPacientbyID(Identificator input){
        for(Cetatean p : pacient){
            if(p.getId().equals(input)){
                return p;
            }
        }

        return null;
    }

    public MedRepository getRepo(Cetatean c){
        for(MedRepository rep : repo){
            if (c.getId().equals(rep.getId())){
                return rep;
            }
        }

        return null;
    }

    public void afisarePacienti(){
        System.out.printf("Pacientii inregistrati sunt: ");

        for(Cetatean c : pacient){
            System.out.printf(c.getNume());
            System.out.printf(", ");
        }

        System.out.printf("\n");
    }
}
