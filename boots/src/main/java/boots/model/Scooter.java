package boots.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="scooters")
public class Scooter implements Serializable{
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column (length=20)
	private String marca;
	@Column (length=20)
	private String modelo;
	@Temporal(TemporalType.DATE)
	@Column (name="date_created")
	private Date dateCreated;
	private boolean exists;
	
	

	public Scooter( String marca, String modelo, Date dateCreated, boolean exists) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.dateCreated = dateCreated;
		this.exists = exists;
	}

	public Scooter() {
		this("","",new Date(),false);
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public boolean isExists() {
		return exists;
	}

	public void setExists(boolean exists) {
		this.exists = exists;
	}

	@Override
	public String toString() {
		return "Scooter [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", dateCreated=" + dateCreated
				+ ", exists=" + exists + "]";
	}

	
}
