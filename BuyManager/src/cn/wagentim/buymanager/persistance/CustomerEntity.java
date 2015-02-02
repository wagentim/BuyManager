package cn.wagentim.buymanager.persistance;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: CustomerEntity
 *
 */
@Entity
@Table(name="CustomerEntity")
public class CustomerEntity implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String firstName;
	private String lastName;
	private String telefon;
	private String address;
	private String other;
	private String contury;
	private String province;
	private String city;
	private String zipcode;
	private static final long serialVersionUID = 1L;

	public CustomerEntity() {
		super();
	}   
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}   
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}   
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}   
	public String getTelefon() {
		return this.telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}   
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}   
	public String getOther() {
		return this.other;
	}

	public void setOther(String other) {
		this.other = other;
	}   
	public String getContury() {
		return this.contury;
	}

	public void setContury(String contury) {
		this.contury = contury;
	}   
	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}   
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}   
	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
   
}
