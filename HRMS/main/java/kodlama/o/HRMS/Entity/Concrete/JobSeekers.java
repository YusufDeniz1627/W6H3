package kodlama.o.HRMS.Entity.Concrete;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="JobSeekers")
public class JobSeekers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@Column(name="Name")
	private String Name;
	
	@Column(name="Surname")
	private String Surname;

	@Column(name="TcNo")
	private int TcNo;
	
	@Column(name="YearOfBird")
	private Date YearOfBird;
}
