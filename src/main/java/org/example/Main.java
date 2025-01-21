package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("Tic Tac Toe","Game Project","Ann", Status.ASSIGNED, Priority.LOW);
        Task task2 = new Task("CV Project","A project that tells about yourself", "Bob", Status.ASSIGNED, Priority.HIGH);
        Task task3 = new Task("Witflix","Netflix HomePage template project","Carol",Status.IN_PROGRESS,Priority.MED);
        Task task4 = new Task("Pizza Project","Order site where pizza is ordered","Unknown", Status.IN_QUEUE, Priority.HIGH);
        Task task5 = new Task("E-Commerce Project", "E-commerce site built using Frontend and Backend", "Ann", Status.IN_PROGRESS, Priority.MED);
        Task task6 = new Task("Word Game","Word game made with PixiJS", "Unknown",Status.IN_QUEUE,Priority.LOW);

        Set<Task> annTasks = new HashSet<>();
        annTasks.add(task1);
        annTasks.add(task5);

        Set<Task> bobTasks = new HashSet<>();
        bobTasks.add(task2);
        bobTasks.add(task1);

        Set<Task> carolTasks = new HashSet<>();
        carolTasks.add(task3);

        Set<Task> unassignedTasks = new HashSet<>();
        unassignedTasks.add(task4);
        unassignedTasks.add(task6);

        TaskData taskDatas = new TaskData(annTasks,bobTasks,carolTasks,unassignedTasks);
//        Iterator<Task> iterator = taskDatas.getTasks("").iterator();
//        while (iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }


//        Iterator<Task> itr = taskDatas.getIntersection(annTasks,bobTasks).iterator();
//        while (itr.hasNext())
//        {
//            System.out.println(itr.next());
//        }

//        Iterator<Task> itr2 = taskDatas.getUnion(annTasks,carolTasks).iterator();
//        while (itr2.hasNext())
//        {
//            System.out.println(itr2.next());
//        }

//        Iterator<Task> itr3 = taskDatas.getDifferences(annTasks,bobTasks).iterator();
//        while (itr3.hasNext())
//        {
//            System.out.println(itr3.next());
//        }
//
//        System.out.println("///////////////////////");
//
//        Iterator<Task> itr4 = annTasks.iterator();
//        while (itr4.hasNext())
//        {
//            System.out.println(itr4.next());
//        }

    }
}