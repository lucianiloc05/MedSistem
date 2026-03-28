public class Identificator {

    private Long id;
    private boolean consentGranted = false;

    public void activare(){
        consentGranted = !consentGranted;
    }

    Identificator(Long id){
        this.id = id;
    }


}
