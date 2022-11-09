package it.polito.tdp.corsi.model;

import java.util.List;
import java.util.Map;

import it.polito.tdpcorsi.db.CorsoDao;
import it.polito.tdpcorsi.db.StudenteDao;

public class Model {
	
	private CorsoDao corsoDao;
	private StudenteDao studenteDao;
	
	public Model() {
		this.corsoDao=new CorsoDao();
		this.studenteDao=new StudenteDao();
	}
	
	public List<Corso> getCorsiByPeriodo(int periodo){
		return this.corsoDao.getCorsoByPeriodo(periodo);
	}
	
	public Map<Corso, Integer>getIscritti(int periodo){
		return this.corsoDao.getIscritti(periodo);
	}
	
	public List<Studente> getStudentiByCorso(String codins){
		return this.studenteDao.getStudentiByCorso(codins);
	}
	
	public List<Divisione> getDivisioneStudenti(String codins){
		return this.studenteDao.getDivisioneStudenti(codins);
	}
	
	
}
