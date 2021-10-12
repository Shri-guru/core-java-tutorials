import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import sorting.Students;

public class CoreJavaDemos {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		List<Students> studentList = new ArrayList<>();
		studentList.add(new Students("13EEE064", "GURU", 20, "444"));
		studentList.add(new Students("13EEE065", "SOMU", 24, "446"));
		studentList.add(new Students("13EEE066", "SRINATH", 23, "448"));
		studentList.add(new Students("13EEE067", "SETHU", 27, "490"));
		studentList.add(new Students("13EEE068", "RISAB", 29, "467"));
		
	Collections.sort(studentList);
	
		
		//Comparator 
//		Comparator com = new Comparator<Students>() {
//
//			@Override
//			public int compare(Students o1, Students o2) {
//				if(o1.getMarks()> o2.getMarks()) {
//					return -1;
//				}
//				return 1;
//			}
//		};
//		
//		Collections.sort(studentList, com);
		System.out.println(studentList);

	}

}
