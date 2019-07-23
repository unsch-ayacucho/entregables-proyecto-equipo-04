package pe.edu.unsch.entities;


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "account", catalog = "bdentrada")
public class Account implements java.io.Serializable {

	private Integer idaccount;
	private String name;
	private String password;
	private String email;
	private String photo;
	private Byte status;
	private Set<Orders> orderses = new HashSet<Orders>(0);
	private Set<AccountProfile> accountProfiles = new HashSet<AccountProfile>(0);

	public Account() {
	}

	public Account(String name, String password, String email, String photo, Byte status,
			Set<Orders> orderses, Set<AccountProfile> accountProfiles) {
		this.name = name;
		this.password = password;
		this.email = email;
		this.photo = photo;
		this.status = status;
		this.orderses = orderses;
		this.accountProfiles = accountProfiles;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idaccount", unique = true, nullable = false)
	public Integer getIdaccount() {
		return this.idaccount;
	}

	public void setIdaccount(Integer idaccount) {
		this.idaccount = idaccount;
	}

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "password", length = 80)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "email", length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "photo", length = 100)
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Column(name = "status")
	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<Orders> getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set<Orders> orderses) {
		this.orderses = orderses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<AccountProfile> getAccountProfiles() {
		return this.accountProfiles;
	}

	public void setAccountProfiles(Set<AccountProfile> accountProfiles) {
		this.accountProfiles = accountProfiles;
	}

}
