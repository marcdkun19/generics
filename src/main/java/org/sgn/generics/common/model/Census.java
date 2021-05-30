package org.sgn.generics.common.model;

import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Date;


/**
 * The persistent class for the census database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "census")
public class Census extends BaseModel  {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long serialnumber;

	@Column(name = "address1")
	private String address1;

	@Column(name = "address2")
	private String address2;

	@Column(name = "area")
	private String area;

	@Column(name = "baptismdate")
	private String baptismdate;

	@Column(name = "birthdate")
	@Temporal(TemporalType.DATE)
	private Date birthdate;

	@Column(name = "cfo")
	private String cfo;

	@Column(name = "civilstatus")
	private String civilstatus;

	@Column(name = "datein")
	@Temporal(TemporalType.DATE)
	private Date datein;

	@Column(name = "datemove")
	@Temporal(TemporalType.DATE)
	private Date datemove;

	@Column(name = "dateofmarriage")
	private String dateofmarriage;

	@Column(name = "degree")
	private String degree;

	@Column(name = "emailaddress")
	private String emailaddress;

	@Column(name = "evangelist")
	private String evangelist;

	@Column(name = "firstlocale")
	private String firstlocale;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "gender")
	private String gender;

	@Column(name = "grp")
	private String grp;

	@Column(name = "idnumber")
	private String idnumber;

	@Column(name = "incoming")
	private String incoming;

	@Column(name = "io")
	private String io;

	@Column(name = "jobtitle")
	private String jobtitle;

	@Column(name = "lastlocale")
	private String lastlocale;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "maidenname")
	private String maidenname;

	@Column(name = "middlename")
	private String middlename;

	@Column(name = "nationality")
	private String nationality;

	@Column(name = "office")
	private String office;

	@Column(name = "office2")
	private String office2;

	@Column(name = "office3")
	private String office3;

	@Column(name = "office4")
	private String office4;

	@Column(name = "phone1")
	private String phone1;

	@Column(name = "phone2")
	private String phone2;

	@Column(name = "r201number")
	private String r201number;

	@Column(name = "schoolgraduated")
	private String schoolgraduated;

	@Column(name = "spouse")
	private String spouse;

	@Column(name = "status")
	private String status;

	@Column(name = "user")
	private String user;

	@Column(name = "weekyear")
	private String weekyear;
}