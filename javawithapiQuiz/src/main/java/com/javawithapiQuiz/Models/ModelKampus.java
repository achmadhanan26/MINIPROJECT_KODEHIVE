package com.javawithapiQuiz.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.Column;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.Data;

@Data
@Entity
public class ModelKampus {
	
	@Id
	@Column(name="modelkampus_id")
	private int id;
	private String name_k;
	
	@OneToMany
	@JoinColumn(name="modelkampus_id")
	private List<DataModel> datamodel ;
	
}
