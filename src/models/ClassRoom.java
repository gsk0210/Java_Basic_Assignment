package com.knoldus;

import java.util.List;
import java.util.Optional;

public class ClassRoom {
    String room_no;
    Optional<List<Student>> studentList;

    ClassRoom(String room_no,Optional<List<Student>> studentList){
        this.room_no=room_no;
        this.studentList=studentList;
    }

    public String getRoom_no(){
        return room_no;
    }

    public Optional<List<Student>> getStudentList(){
        return studentList;
    }

    }

