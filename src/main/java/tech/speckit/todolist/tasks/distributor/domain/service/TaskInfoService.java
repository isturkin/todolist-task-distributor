package tech.speckit.todolist.tasks.distributor.domain.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.speckit.todolist.tasks.distributor.domain.model.TaskInfo;

@RequiredArgsConstructor
@Service
public class TaskInfoService {

    private final TaskInfoGateway taskInfoGateway;

    public TaskInfo getExtendedTaskInfo(String taskId) {
        return taskInfoGateway.getExtendedTaskInfo(taskId);
    }
}
