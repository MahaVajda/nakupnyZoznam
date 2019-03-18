package sk.maha.nakupnyZoznam.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tovar {

	@Id 
	@GeneratedValue 
	private long id;
	private String nazov;
	private double cena;
	private String obchod;
	private Date datumDo;
	
	public Tovar() {
		super();
	}

	public Tovar(String nazov, double cena) {
		super();
		this.nazov = nazov;
		this.cena = cena;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNazov() {
		return nazov;
	}
	public void setNazov(String nazov) {
		this.nazov = nazov;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public String getObchod() {
		return obchod;
	}
	public void setObchod(String obchod) {
		this.obchod = obchod;
	}
	public Date getDatumDo() {
		return datumDo;
	}
	public void setDatumDo(Date datumDo) {
		this.datumDo = datumDo;
	}
	
}
