package com.javawithapiQuiz.Services;
import java.util.List;

import com.javawithapiQuiz.Models.DataModel;
import com.javawithapiQuiz.Models.ModelSkill;

public interface DataServiceInterfaces {
	
	public int create(DataModel m);
	public List<DataModel> cariMhs();
	public DataModel carimhs_skill(String skill);

}
