package com.javawithapiQuiz.Services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javawithapiQuiz.Models.DataModel;
import com.javawithapiQuiz.Repositorys.DataRepoInterfaces;
import com.javawithapiQuiz.Models.ModelSkill;

@Service
public class DataServices implements DataServiceInterfaces{
	@Autowired
	DataRepoInterfaces datarepository;
	
	@Override
	public int create(DataModel m) {
		return datarepository.save(m);
	}
	
	@Override
	public List<DataModel> cariMhs(){
		return datarepository.search();
	}
	
	@Override
	public DataModel carimhs_skill(String skill){
		return datarepository.search_skill(skill);
	}
}
