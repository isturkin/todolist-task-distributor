package tech.speckit.todolist.tasks.distributor.adapter.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.speckit.todolist.tasks.distributor.adapter.dto.TaskAssigneeResponse;

@RequestMapping("/tasks")
@RestController
public class TaskDistributionController {

    @GetMapping("/{taskId}/assignee")
    TaskAssigneeResponse getAssignedUser(@PathVariable("taskId") String taskId) {
        TaskAssigneeResponse response = new TaskAssigneeResponse();
        response.setTaskId(taskId);
        response.setUserId("1234");
        return response;
    }
}
