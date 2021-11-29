package kodlama.o.HRMS.Entity.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "JobSeekers")
@PrimaryKeyJoinColumn(name = "Id", referencedColumnName = "Id")
@EqualsAndHashCode(callSuper = false)

public class JobSeekers extends Users{
	@Id
	@Column(name = "Id")
	@GeneratedValue
	private int Id;
	
	@Column(name = "Name")
	private String Name;
	
	@Column(name = "Surname")
	private String Surname;
	
	@Column(name = "TcNo")
	private int TcNo;
	@Column(name="YearOfBird")
	private Date yearOfBird;
}
