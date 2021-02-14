package com.kodilla.stream.homework;

import com.kodilla.stream.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks(){
        List<Task> taskList = new ArrayList<>();


        taskList.add(new Task("Pay of the phone bill", LocalDate.of(2021, 5, 1), LocalDate.of(2021, 5, 7)));
        taskList.add(new Task("Buy new laptop", LocalDate.of(2021, 5, 15), LocalDate.of(2021, 5, 16)));
        taskList.add(new Task("Send documents to costumer", LocalDate.of(2021, 5, 31), LocalDate.of(2021, 6, 20)));
        return taskList;
    }
}
