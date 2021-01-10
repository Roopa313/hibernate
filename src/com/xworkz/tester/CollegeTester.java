package com.xworkz.tester;

	
	import com.xworkz.dog.dao.CollegeDAO;
	import com.xworkz.dog.dao.CollegeDAOImpl;
	import com.xworkz.dog.dto.CollegeDTO;

	public class CollegeTester {

		public static void main(String[] args) {
			
			CollegeDTO collegeDTO = new CollegeDTO();
			collegeDTO.setcName("KIT");
			collegeDTO.setcLOcation("Tiptur");
			collegeDTO.setNoofBranches(9);
			CollegeDAO collegeDaoImpl =new CollegeDAOImpl();
			
			//collegeDaoImpl.saveCollege(collegeDTO);
			collegeDaoImpl.fetchCollege(2);
			collegeDaoImpl.updateCollege(CollegeDTO,2);
			
		}
	}


