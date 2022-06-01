package com.javawithapiQuiz.Models;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import lombok.Data;

@Data
@Entity
public class ModelJK {
	
	@Id
	@Column(name="modeljk_id")
	private int id;
	private String name;
	
	@JsonIgnore
	@OneToMany
	@JoinColumn(name="modeljk_id")
	private List<DataModel> datamodel;
	
	
}


