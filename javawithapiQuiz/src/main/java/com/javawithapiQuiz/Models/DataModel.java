package com.javawithapiQuiz.Models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;



@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table
public class DataModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int data_no;
	
	private String data_nama;
	private int data_th_lulus;
	private String data_no_telp;
	
	@ManyToOne
	@JoinColumn(name="modeljk_id", insertable=false, updatable=false)
	private ModelJK modeljk;
	
	@ManyToOne
	@JoinColumn(name="modelkampus_id", insertable=false, updatable=false)
	private ModelKampus modelkampus;
	
	@ManyToMany(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinTable(name = "skill_profil", joinColumns= @JoinColumn(name="data_no"), inverseJoinColumns = @JoinColumn(name="skill_id"))
	private List<ModelSkill> skill ;
	
}
