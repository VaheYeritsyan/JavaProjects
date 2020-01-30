package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapService {
    public static Map<Student,Integer> countStudentOccurences(ArrayList<Student> students){
        Map<Student,Integer> studAndOccurences=new HashMap<>();
        for (Student student : students) {
            if(studAndOccurences.containsKey(student)) {
                int count = studAndOccurences.get(student);
                studAndOccurences.put(student, count + 1);
            }else{
                studAndOccurences.put(new Student(student.getFirstName(),student.getLastName()),1);
            }
        }
        return studAndOccurences;
    }

}
