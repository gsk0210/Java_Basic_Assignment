package com.knoldus;

import java.util.List;
import java.util.Optional;

public class Student {
    String name;
    int roll_no;
    Optional<List<String>> subject;

    Student(String name,int roll_no,Optional<List<String>> subject){
        this.name=name;
        this.roll_no=roll_no;
        this.subject=subject;
    }

    public Optional<List<String>> getSubjects(){
        return subject;
    }

    public String studentListString(){
        return "Student{"+"name="+name+"roll_no="+roll_no+"subject="+subject;
    }



    }





