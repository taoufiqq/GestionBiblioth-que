package gestion_etudiant.dao;
 
import java.util.List;

import gestion_etudiant.model.Etudiant;

public interface iEtudiant {
	
	public void addEtudiant(Etudiant e);
	public void removeEtudiant(Etudiant e);
	public void updateEtudiant(Etudiant e);
	public Etudiant getEtudiantById(int i);
	public List<Etudiant> getAllEtudiant();
	

}
