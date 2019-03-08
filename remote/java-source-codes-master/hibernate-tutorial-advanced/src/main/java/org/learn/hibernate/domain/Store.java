package org.learn.hibernate.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.OneToMany;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name = "STORE")
//@NamedNativeQuery(name = "selectAll", query = "CALL select_all_store()", resultClass = Store.class)
@NamedStoredProcedureQuery(name = "selectAll", procedureName="select_all_store", resultClasses = {Store.class})
public class Store implements Serializable {

	private static final long serialVersionUID = -2659815656806581813L;

	@Column(name = "ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "NAME")
	private String Name;

	@Column(name = "LOCATION")
	private String location;

	@OneToMany(mappedBy = "store", cascade = CascadeType.ALL, orphanRemoval=true)
	private List<Employee> employees;

	public Store() {
	}

	public Store(String name, String location) {
		super();
		Name = name;
		this.location = location;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", Name=" + Name + ", location=" + location + ", employees=" + employees + "]";
	}

}
