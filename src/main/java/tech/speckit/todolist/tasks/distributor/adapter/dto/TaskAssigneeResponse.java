package tech.speckit.todolist.tasks.distributor.adapter.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TaskAssigneeResponse {

    private String taskId;
    private String userId;
}
