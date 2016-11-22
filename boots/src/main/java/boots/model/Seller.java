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

@Entity(name="sellers")
public class Seller implements Serializable{
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column (length=20)
	private String name;
	@Column (length=20)
	private String lastName;
	@Column (length=20)
	private String telephone;
	@Column (length=20)
	private String address;
	private boolean turn;
	@Column (length=20)
	private String email;
	private int age;
	
	

	public Seller(String name, String lastName, String telephone, String address, boolean turn, String email,
			int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.telephone = telephone;
		this.address = address;
		this.turn = turn;
		this.email = email;
		this.age = age;
	}

	public Seller() {
		this("","","","",false,"",0);
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isTurn() {
		return turn;
	}

	public void setTurn(boolean turn) {
		this.turn = turn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", lastName=" + lastName + ", telephone=" + telephone
				+ ", address=" + address + ", turn=" + turn + ", email=" + email + ", age=" + age + "]";
	}

	

}
