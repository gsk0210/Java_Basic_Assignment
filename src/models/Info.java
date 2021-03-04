package com.knoldus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Info {

    static Student student1 = new Student("Alex", 1, Optional.of(Arrays.asList("Database Management System", "Data Structures")));
    static Student student2 = new Student("Brian", 2, Optional.of(Arrays.asList("Prograaming Language Principles", "Design and Analysis of Algorith")));
    static Student student3 = new Student("Drake", 3, Optional.of(Arrays.asList()));

    public static List<Student> studentList() {

        List<Student> studentList = Arrays.asList(student1, student2, student3);
        return studentList;


        /*List<Student> studentList= Arrays.asList((new Student("Alex",1, Optional.of(Arrays.asList("Database Management System","Data Structures"))))
                ,(new Student("Brian",2,Optional.of(Arrays.asList("Prograaming Language Principles","Design and Analysis of Algorith")))),
                new Student("Drake",3,Optional.of(Arrays.asList())));
        return studentList;*/
    }

    static ClassRoom classRoom1 = new ClassRoom("A101", Optional.of(Arrays.asList(student1, student2)));
    static ClassRoom classRoom2 = new ClassRoom("xyz", Optional.ofNullable(Arrays.asList(student2, student3)));
    static ClassRoom classRoom3 = new ClassRoom("B102", Optional.ofNullable(Arrays.asList(student1, student3)));
    static ClassRoom classRoom4=new ClassRoom("C117",Optional.ofNullable(null));

    public static List<ClassRoom> classRoomList() {
        List<ClassRoom> classRoomList = new ArrayList<ClassRoom>();
        classRoomList.add(classRoom1);
        classRoomList.add(classRoom2);
        classRoomList.add(classRoom3);
        classRoomList.add(classRoom4);

        return classRoomList;
    }
}

