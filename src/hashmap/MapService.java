package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapService {
    public static Map<String, Integer> getStudentsMap(ArrayList<Student> students) {
        Map<String, Integer> studentsMap = new HashMap<>();
        for (Student student : students) {
            String fullName = student.getFirstName() + " " + student.getLastName();
            if (studentsMap.containsKey(fullName)) {
                int count = studentsMap.get(fullName);
                studentsMap.put(fullName, count + 1);
            } else {
                studentsMap.put(fullName, 1);
            }
        }
        return studentsMap;
    }

    public static Map<String, Integer> getFacultyMap(ArrayList<Student> students) {
        Map<String, Integer> facultyMap = new HashMap<>();
        for (Student student : students) {
            String faculty = student.getFaculty();
            if (facultyMap.containsKey(faculty)) {
                int count = facultyMap.get(faculty);
                facultyMap.put(faculty, count + 1);
            } else {
                facultyMap.put(faculty, 1);
            }
        }
        return facultyMap;
    }

}
