package hashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students=getStudentList();
        Map<Student,Integer> studentIntegerMap=MapService.countStudentOccurences(students);
        for(Map.Entry<Student,Integer> entrySet:studentIntegerMap.entrySet()){
            System.out.printf("Key: %s,\tValue: %s\n", entrySet.getKey(),entrySet.getValue());
        }
    }

    private static ArrayList<Student> getStudentList() {
        return new ArrayList<>(List.of
                        (createStudent("Diana","Asatryan",22,"098111111","Math"),
                        createStudent("Diana","Asatryan",32,"0125654898","Physics"),
                        createStudent("Diana","Asatryan",21,"1231565489","Philosophy"),
                        createStudent("Karen","Balayan",48,"1651648123","Math"),
                        createStudent("Karen","Balayan",23,"09176456498","Philosophy"),
                        createStudent("Elen","Mirzoayn",35,"56123161661","English")
        ));
    }

    private static Student createStudent(String firstName, String lastName, int age, String number, String faculty) {
        Student newStudent = new Student(firstName, lastName);
        newStudent.setAge(age);
        newStudent.setPhoneNumber(number);
        newStudent.setFaculty(faculty);
        return newStudent;
    }


}
