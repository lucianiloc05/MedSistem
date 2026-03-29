import java.util.Date;

public class Cetatean {

    private String nume;
    private String nrTel;
    private String cnp;
    private Date dateOfBirth;

    private Identificator id;

    public void setID(Identificator obj){
        id = obj;
    }

    public String getNume() {return nume;}

    public String getCNP() {return cnp;}

    public Identificator getId() { return id; }

    Cetatean(String nume){
        this.nume = nume;
    }

    Cetatean(String nume, String data){
        this.nume = nume;

        if(data.length() < 13){
            nrTel = data;
        }
        else cnp = data;

    }

}
