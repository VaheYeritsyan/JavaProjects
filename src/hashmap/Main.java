package hashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = getStudentList();
        Map<String, Integer> studentIntegerMap = MapService.getStudentsMap(students);
        printMap(studentIntegerMap);
        Map<String, Integer> facultyIntegerMap = MapService.getFacultyMap(students);
        printMap(facultyIntegerMap);

    }

    private static void printMap(Map<String, Integer> studentIntegerMap) {
        for (Map.Entry<String, Integer> entrySet : studentIntegerMap.entrySet()) {
            System.out.printf("Key: %s, Value: %s\n", entrySet.getKey(), entrySet.getValue());
        }

    }

    private static ArrayList<Student> getStudentList() {
        return new ArrayList<>(List.of
                (createStudent("Diana", "Asatryan", 22, "098111111", "Math"),
                        createStudent("Diana", "Asatryan", 32, "0125654898", "Physics"),
                        createStudent("Diana", "Asatryan", 21, "1231565489", "Philosophy"),
                        createStudent("Karen", "Balayan", 48, "1651648123", "Math"),
                        createStudent("Karen", "Balayan", 23, "09176456498", "Philosophy"),
                        createStudent("Elen", "Mirzoayn", 35, "56123161661", "English")
                ));
    }

    private static Student createStudent(String firstName, String lastName, int age, String number, String faculty) {
        return new Student.Builder(firstName, lastName)
                .setAge(age).setPhoneNumber(number).setFaculty(faculty).build();

    }


}
