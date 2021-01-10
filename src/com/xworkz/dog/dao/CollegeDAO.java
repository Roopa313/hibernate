package com.xworkz.dog.dao;
	
	import com.xworkz.dog.dto.CollegeDTO;

	public interface CollegeDAO {

		void saveCollege(CollegeDTO collegeDTO);
		
		void fetchCollege(int collegeID);
		
		void updateCollege(CollegeDTO collegeDTO,int collegeID);
	}


