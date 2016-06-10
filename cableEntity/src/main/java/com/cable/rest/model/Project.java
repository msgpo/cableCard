package com.cable.rest.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cable.rest.constants.Status;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="project")
public class Project extends Audit implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter	@Setter	
	private Long projectId;
	
	@Column(unique=true,nullable=false)
	@Getter	@Setter	
	private String projectCityVillage;
	
	@ManyToOne
	@JoinColumn(name="org_Id", nullable=false)
	@Getter	@Setter	
	private Organization organization;
	
	@Column(nullable=false,length = 65535,columnDefinition="Text")
	@Getter	@Setter	
	private String address;

	@ManyToOne
	@JoinColumn(name="zip_Code", nullable=false)
	@Getter	@Setter	
	private ZipCode zipCode;
	
	@Column(nullable=false)
	@Enumerated(EnumType.STRING)
	@Getter	@Setter	
	private Status status;
	
	@Column(nullable=false)
	@Getter	@Setter	
	private String email;
	
	@Column(nullable=false)
	@Getter	@Setter	
	private String mobile;
	
	@Column(nullable=false)
	@Getter	@Setter	
	private Double advanceAmount;
	
	@Column(nullable=false)
	@Enumerated(EnumType.STRING)
	@Getter	@Setter	
	private Status onlinePaymentFlag;
	
	@Column(nullable=false)
	@Getter	@Setter	
	private int paymentGenerateDate;
	
	@Column(nullable=false)
	@Getter	@Setter	
	private int paymentDueDate;
	
	
	
	
	
	
	

}
