public class Identificator {

    private Long id;
    private boolean consentGranted = false;
    private int nivelAcces = -1; //-1 privat, 0 doctor, 1 public
    private boolean activat = false;
    public void activare(){
        activat = !activat;
    }
    public void grantConsent(){
        consentGranted = !consentGranted;
    }
    
    public int getNivel() { return nivelAcces; }
    public void setNivel(int niv) { nivelAcces = niv; }
    public boolean getActivare() { return activat; }

    Identificator(Long id){
        this.id = id;
    }


}
