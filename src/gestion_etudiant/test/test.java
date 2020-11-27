package gestion_etudiant.test;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


import gestion_etudiant.imp.Etudiantimplement;
import gestion_etudiant.model.Etudiant;

import gestion_etudiant.dao.iEtudiant;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Etudiantimplement etudiantimplement = new Etudiantimplement();
		
		boolean var = true;
		
		while (var) {
			
			

		
		System.out.println("*********************Programme de Gestion Bibliothéque*********************");
        System.out.println("Menu Principal");
        
        System.out.println("1- Gestion Etudiant");
        System.out.println("2- Gestion Employee");
        System.out.println("3- Gestion Livre");
        System.out.println("4- Quitter le programme");
        
        System.out.println("Choix :");
        
        Scanner scanner = new Scanner(System.in);
        
        int choix = scanner.nextInt();
        
        switch (choix) {
		case 1: 
			
			boolean var1 = true;
			
			while (var1) {
			
			
			System.out.println("*********************Gestion Etudiant*********************");
		    System.out.println("1- Ajouter Etudiant");
	        System.out.println("2- Supprimer Etudiant");
	        System.out.println("3- Modifier Etudiant");
	        System.out.println("4- Afficher Etudiant");
	        System.out.println("5- Quitter le Menu Etudiant");
	        
	        System.out.println("Choix :");
	        
	        int choixEtudiant = scanner.nextInt();
	        
	        switch (choixEtudiant) {
			case 1:
				 System.out.println("Ajouter Etudiant");
				 
				 System.out.println("Nom :");
				 String nom = scanner.next();
				 
				 System.out.println("Prenom :");
				 String prenom = scanner.next();
				 
				 System.out.println("Age :");
				 int age = scanner.nextInt();
				
				 System.out.println("Branche :");
				 String branche = scanner.next(); 
				 
				 System.out.println("ID :");
				 int ID = scanner.nextInt();
				 
				 Etudiant etudiant = new Etudiant(ID, nom, prenom, age, branche);
				 
				 
				 etudiantimplement.addEtudiant(etudiant);
				 
				 System.out.println("Bien Ajouté");
				
				break;
            case 2:
            	System.out.println("Supprimer Etudiant");
            	
            	System.out.println("ID :");
            	
            	int id=scanner.nextInt();
            	
            	Etudiant etudiant2=etudiantimplement.getEtudiantById(id);
            	
            	/*ArrayList<Etudiant> etudiants = new ArrayList<>();
            	
            	for(Etudiant e2:etudiants) {
        			
        			if(e2.getId() == etudiantimplement.getEtudiantById()) {
        				
        			}
            	}*/
            	etudiantimplement.removeEtudiant(etudiant2);
            	
            	System.out.println("Bien supprimer");
            	
            	
				break;
            case 3:
            	System.out.println("Modifier Etudiant");
            	
                System.out.println("ID :");
            	
            	int idMod=scanner.nextInt();
            	
            	Etudiant etudiant3=etudiantimplement.getEtudiantById(idMod);
            	
            	System.out.println("Nom :");
				 String nomE = scanner.next();
				 etudiant3.setNom(nomE);
				 
				 System.out.println("Prenom :");
				 String prenomE = scanner.next();
				 etudiant3.setPrenom(prenomE);
				 
				 System.out.println("Age :");
				 int ageE = scanner.nextInt();
				 etudiant3.setAge(ageE);
				
				 System.out.println("Branche :");
				 String brancheE = scanner.next();
				 etudiant3.setBranche(brancheE);
            	
            	
            	
            	etudiantimplement.updateEtudiant(etudiant3);
            	
            	System.out.println("Bien Modifier");
            
	            break;
            case 4:
            	System.out.println("Afficher Etudiant");
            	
            	List<Etudiant> etudiants = etudiantimplement.getAllEtudiant();
            	
            	System.out.println("-----------------------------------------------------------------------------");
                System.out.printf("%5s %15s %15s %10s %10s", "ID", "NOM","PRENOM", "AGE", "BRANCHE");
                System.out.println();
                System.out.println("-----------------------------------------------------------------------------");
            	
            	
            	for(Etudiant etudiant4 : etudiants){
            		 System.out.format("%5s %15s %15s %10s %10s",
            				 etudiant4.getId(),etudiant4.getNom(),etudiant4.getPrenom(),etudiant4.getAge(),etudiant4.getBranche());
            	        System.out.println();
            	}
            	System.out.println("-----------------------------------------------------------------------------");
            	
	            break;
            case 5:
            	System.out.println("Quitter");
            	
            	var1=false;
            	var=true;
	            break;

			default:
				System.out.println("Choix invalid!!!!!!!!!!!");
				break;
			}
			}
			break;
	    case 2: 
	    	System.out.println("*********************Gestion Employee*********************");
	    	System.out.println("1- Ajouter Employee");
		    System.out.println("2- Supprimer Employee");
		    System.out.println("3- Modifier Employee");
		    System.out.println("4- Afficher Employee");
		    System.out.println("5- Quitter le Menu Employee");
	    	break;
	    case 3: 
	    	System.out.println("*********************Gestion Livre*********************");
	    	System.out.println("1- Ajouter Livre");
		    System.out.println("2- Supprimer Livre");
		    System.out.println("3- Modifier Livre");
		    System.out.println("4- Afficher Livre");
            System.out.println("5- Quitter le Menu Livre");
	    	break;
	    case 4: 
	    	System.out.println("*********************Quitter*********************");
	    	System.exit(0 );
			break;
		    
		default:
			System.out.println("Choix invalid!!!!!!!!!!!");
			break;
		}
        
        
        
        
        
        
	}}

}
