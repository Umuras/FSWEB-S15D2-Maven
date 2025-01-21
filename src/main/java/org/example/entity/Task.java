package org.example.entity;

import java.util.Objects;

public class Task {
    private String project;
    private String description;
    private String assignee;
    private Priority priority;
    private Status status;

    public Task(String project, String description, String assignee, Status status, Priority priority)
    {
        this.project = project;
        this.description = description;
        this.assignee = assignee;
        this.status = status;
        this.priority = priority;
    }

    public String getProject()
    {
        return this.project;
    }

    public String getDescription()
    {
        return this.description;
    }

    public String getAssignee()
    {
        return this.assignee;
    }

    public Priority getPriority()
    {
        return this.priority;
    }

    public Status getStatus()
    {
        return this.status;
    }


    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
        {
            return true;
        }

        return ((Task)obj).getProject().equals(this.getProject()) && ((Task)obj).getDescription().equals(this.getDescription());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(project,description);
    }


    @Override
    public String toString()
    {
        return "Project Name: " + project + " " +"Description: " + description + " " + "Assignee: " + assignee;
    }
}
