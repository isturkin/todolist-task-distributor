package tech.speckit.todolist.tasks.distributor.domain.service;

import tech.speckit.todolist.tasks.distributor.domain.model.TaskInfo;

import java.util.concurrent.TimeoutException;

public interface TaskInfoGateway {

    TaskInfo getExtendedTaskInfo(String taskId) throws TimeoutException;
}
