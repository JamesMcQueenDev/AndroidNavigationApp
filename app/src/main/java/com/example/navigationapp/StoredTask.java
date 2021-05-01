package com.example.navigationapp;

public class StoredTask {

    public String taskName;
    public String taskTime;
    public String taskDate;
    public String taskImage;
    public String uid;
    public String taskDescription;

    public StoredTask(){

    }

    public StoredTask(String pTaskName, String pTaskDate, String pTaskDescription, String pTaskImage, String pUid){

        taskName = pTaskName;
        taskDate = pTaskDate;
        taskDescription = pTaskDescription;
        taskImage = pTaskImage;
        uid = pUid;
    }

}