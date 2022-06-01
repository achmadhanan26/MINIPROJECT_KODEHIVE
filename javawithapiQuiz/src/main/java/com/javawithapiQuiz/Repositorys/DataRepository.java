package com.javawithapiQuiz.Repositorys;

import org.springframework.stereotype.Repository;
import com.javawithapiQuiz.Models.ModelSkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.javawithapiQuiz.Models.DataModel;


import java.util.List;

@Repository
public class DataRepository implements DataRepoInterfaces {
	
	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public int save(DataModel m) {
		System.out.println(m.getModeljk().getId()+ m.getModelkampus().getId());
		//return jdbc.update("insert into data_model (data_no, data_nama, data_no_telp, data_th_lulus, modeljk_id, modelkampus_id) values"+"(?,?,?,?,?,?)", new Object[] {m.getData_no(), m.getData_nama(), m.getData_no_telp(), m.getData_th_lulus(), m.getModeljk().getId(), m.getModelkampus().getId()});("insert into data_model (data_no, data_nama, data_no_telp, data_th_lulus, modeljk_id, modelkampus_id) values"+"(?,?,?,?,?,?)", new Object[] {m.getData_no(), m.getData_nama(), m.getData_no_telp(), m.getData_th_lulus(), m.getModeljk().getId(), m.getModelkampus().getId()});
		return jdbc.update("insert into data_model (data_no, data_nama, data_no_telp, data_th_lulus, modeljk_id, modelkampus_id) values"+"(?,?,?,?,?,?)", new Object[] {m.getData_no(), m.getData_nama(), m.getData_no_telp(), m.getData_th_lulus(), m.getModeljk().getId(), m.getModelkampus().getId()});
	}
	
	@Override
	public List<DataModel> search(){
		return jdbc.query("select * from data_model limit 10", new BeanPropertyRowMapper<DataModel>(DataModel.class));
	}

	@Override
	public DataModel search_skill(String skill) {
		// TODO Auto-generated method stub
		return jdbc.queryForObject("select * from data_model where data_skills = '?'", new BeanPropertyRowMapper<DataModel>(DataModel.class), skill);
	}
	
	
}
