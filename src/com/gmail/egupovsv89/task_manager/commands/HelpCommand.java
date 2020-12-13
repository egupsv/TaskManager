package com.gmail.egupovsv89.task_manager.commands;

import com.gmail.egupovsv89.task_manager.TaskRepository;

public class HelpCommand {
    private TaskRepository tr;

    public HelpCommand(TaskRepository tr) {
        this.tr = tr;
    }

    public void execute() {
        System.out.println("list of commands:");
        new AddCommand(tr).getDescription();
        new ShowCommand(tr).getDescription();
        new ShowAllCommand(tr).getDescription();
        new ChangeCommand(tr, "name").getDescription();
        new ChangeCommand(tr, "description").getDescription();
        new ChangeCommand(tr, "time").getDescription();
        new RemoveCommand(tr).getDescription();
        new CopyCommand(tr).getDescription();
        new CompleteCommand(tr).getDescription();
        new ClearCommand(tr).getDescription();
        new SaveCommand(tr).getDescription();
    }
}
