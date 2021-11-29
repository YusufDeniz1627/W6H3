package kodlama.o.HRMS.Entity.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="Users")
@Data
public class Users {
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int Id;
	@Column(name="Email")
	private String Email;
	@Column(name="Password")
	private String Password;
}
