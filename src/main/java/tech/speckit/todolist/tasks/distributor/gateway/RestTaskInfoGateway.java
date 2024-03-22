package tech.speckit.todolist.tasks.distributor.gateway;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import tech.speckit.todolist.tasks.distributor.domain.model.TaskInfo;
import tech.speckit.todolist.tasks.distributor.domain.service.TaskInfoGateway;

@RequiredArgsConstructor
@Component
public class RestTaskInfoGateway implements TaskInfoGateway {

    private final RestTemplate restTemplate;

    @Override
    public TaskInfo getExtendedTaskInfo(String taskId) {
        ResponseEntity<TaskInfo> response = restTemplate.exchange(
                "http://todolist-backend/tasks/{taskId}",
                HttpMethod.GET, null, TaskInfo.class, taskId);

        System.out.println("RESPONSE: " + response.getBody());

        return response.getBody();
    }
}
