package gestion_etudiant.imp;

import java.util.ArrayList;

import java.util.List;

import gestion_etudiant.dao.iEtudiant;
import gestion_etudiant.model.Etudiant;

public class Etudiantimplement implements iEtudiant {
	
	ArrayList<Etudiant> etudiants = new ArrayList<>();

	@Override
	public void addEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		etudiants.add(etudiant);
	}

	@Override
	public void removeEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		etudiants.remove(etudiant);
	}

	@Override
	public void updateEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		for(Etudiant etudiant2:etudiants) {
			
			if(etudiant2.getId() == etudiant.getId()) {
				etudiant2.setAge(etudiant.getAge());
				etudiant2.setNom(etudiant.getNom());
				etudiant2.setPrenom(etudiant.getPrenom());
				etudiant2.setBranche(etudiant.getBranche());
				
			}
		}
		
	}

	@Override
	public Etudiant getEtudiantById(int i) {
		// TODO Auto-generated method stub
		for(Etudiant etudiant:etudiants) {
			if(etudiant.getId()==i) {
				return etudiant;
			}
		}
		return null;
	}

	@Override
	public List<Etudiant> getAllEtudiant() {
		// TODO Auto-generated method stub
		return etudiants;
	}



}
