package com.javawithapiQuiz.Models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class ModelSkill {
	
	@Id
	@Column(name="skill_id")
	private int id_s;
	private String name_s;
	
	@ManyToMany(mappedBy = "skill")
	private List<DataModel> datamodel ;
	
	
}
