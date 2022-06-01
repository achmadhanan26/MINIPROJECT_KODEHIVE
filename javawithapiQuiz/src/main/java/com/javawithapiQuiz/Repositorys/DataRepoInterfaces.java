package com.javawithapiQuiz.Repositorys;
import java.util.List;

import com.javawithapiQuiz.Models.DataModel;
import com.javawithapiQuiz.Models.ModelSkill;

public interface DataRepoInterfaces {
	
	public int save(DataModel m);
	public List<DataModel> search();
	public DataModel search_skill(String skill);
}
