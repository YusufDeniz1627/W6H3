package kodlama.o.HRMS.Entity.concretes;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Employers")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Employers {
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int Id;
	@Column(name="CompanyName")
	private String CompanyName;
	@Column(name="WebSites")
	private String WebSites;
	@Column(name="PhoneNumber")
	private int PhoneNumber;
}
