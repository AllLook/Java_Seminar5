package service;

import data.GroupStream;
import data.Student;

import java.util.Collections;
import java.util.List;

public class GroupStreamServiceImpl {



    public static void sortStream(GroupStream groupStream){
        Collections.sort(groupStream.getGroupStudent()); // сортировка потока
    }

}
