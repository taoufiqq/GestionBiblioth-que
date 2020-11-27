package gestion_etudiant.model;

public abstract class Person {
	
	    private int id;
	    private String nom;
	    private String prenom;
	    private int age;
	    
	    
	    
	   
	    
	    
	    public Person(int id, String nom, String prenom, int age) {
			super();
			this.id = id;
			this.nom = nom;
			this.prenom = prenom;
			this.age = age;
		}
	
		//Get id
		public int getId() {
			return id;
		}
		//Set id
		public void setId(int id) {
			this.id = id;
		}
		//GetNom
		public String getNom() {
			return nom;
		}
		//SetNom
		public void setNom(String nom) {
			this.nom = nom;
		}
		//GetPrenom
		public String getPrenom() {
			return prenom;
		}
		//SetPrenom
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		//Get age
		public int getAge() {
			return age;
		}
		//Set age
		public void setAge(int age) {
			this.age = age;
		}
	    

	   @Override
	   public String toString() {
		   
		   return "id :"+ id +"\nNom :"+ nom +"\nPrenom :"+ prenom +"\nAge"+ age;
	   }
	    
	        
	}

