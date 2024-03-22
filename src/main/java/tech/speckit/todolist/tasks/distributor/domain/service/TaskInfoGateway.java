package tech.speckit.todolist.tasks.distributor.domain.service;

import tech.speckit.todolist.tasks.distributor.domain.model.TaskInfo;

public interface TaskInfoGateway {

    TaskInfo getExtendedTaskInfo(String taskId);
}
