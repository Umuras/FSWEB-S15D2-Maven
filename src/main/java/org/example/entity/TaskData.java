package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks)
    {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String name)
    {
        switch (name)
        {
            case "ann":
                return annsTasks;
            case "bob":
                return bobsTasks;
            case "carol":
                return carolsTasks;
            case "all":
                Set<Task> allTasks = new HashSet<>();
                allTasks.addAll(annsTasks);
                allTasks.addAll(bobsTasks);
                allTasks.addAll(carolsTasks);
                return allTasks;
            default:
                return unassignedTasks;
        }
    }

    public Set<Task> getTasks(Employee name)
    {
        switch (name)
        {
            case ANN:
                return annsTasks;
            case BOB:
                return bobsTasks;
            case CAROL:
                return carolsTasks;
            case ALL:
                Set<Task> allTasks = new HashSet<>();
                allTasks.addAll(annsTasks);
                allTasks.addAll(bobsTasks);
                allTasks.addAll(carolsTasks);
                return allTasks;
            default:
                return unassignedTasks;
        }
    }

    public Set<Task> getUnion(Set<Task> taskSet1, Set<Task> taskSet2)
    {
        taskSet1.addAll(taskSet2);
        return taskSet1;
    }

    public Set<Task> getIntersection(Set<Task> taskSet1, Set<Task> taskSet2)
    {
        Set<Task> task1Copy = new HashSet<>(taskSet1);
        task1Copy.retainAll(taskSet2);
        return task1Copy;
    }

    public Set<Task> getDifferences(Set<Task> taskSet1, Set<Task> taskSet2)
    {
        taskSet1.removeAll(taskSet2);
        return taskSet1;
    }
}
