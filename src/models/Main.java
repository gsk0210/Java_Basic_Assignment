package com.knoldus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //Part-1

        List<Student> students=Info.studentList().stream().filter(ob->ob.getSubjects().isEmpty()).collect(Collectors.toList());

        List<String> studentDetails=new ArrayList<String>();

        for (Student student:students){
            studentDetails.add(student.studentListString());
        }
        System.out.println(studentDetails);

        //Part-2

        List<List<Student>> xyzClass=Info.classRoomList().stream().filter(obj->obj.getRoom_no().equals("xyz")).map(s->s.getStudentList().get()).collect(Collectors.toList());
        List<List<String>> sub=xyzClass.get(0).stream().map(o->o.getSubjects().get()).collect(Collectors.toList());
        List<String> list=sub.stream().flatMap(object->object.stream()).collect(Collectors.toList());

        System.out.println(list);

        //Part-3

        List<ClassRoom> classRoomList=Info.classRoomList().stream().filter(ob->ob.getStudentList().isPresent()).collect(Collectors.toList());
        classRoomList.forEach(ob->System.out.println(ob.getRoom_no()+" -> "+"Hello"));

    }




}
