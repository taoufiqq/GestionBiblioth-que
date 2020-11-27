package gestion_etudiant.model;

public class Etudiant extends Person {

 
	private String branche;
    
    
        public Etudiant(int id, String nom, String prenom, int age, String branche) {
		super(id, nom, prenom, age);
		this.branche = branche;
	}
        
    //getBranche
    public String getBranche() {
		return branche;
	}
    //setBranche
	public void setBranche(String branche) {
		this.branche = branche;
	}

@Override
public String toString() {
	return super.toString()+"\nBranche"+ branche;
}

	
}
