public class Identificator {

    private Long id;
    private boolean consentGranted = false;
    private int nivelAcces = -1; //-1 privat, 0 doctor, 1 public

    public void activare(){
        consentGranted = !consentGranted;
    }


    public int getNivel() { return nivelAcces; }
    public void setNivel(int niv) { nivelAcces = niv; }

    Identificator(Long id){
        this.id = id;
    }


}
