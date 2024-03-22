package tech.speckit.todolist.tasks.distributor.adapter.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import tech.speckit.todolist.avro.TaskInfoEvent;
import tech.speckit.todolist.tasks.distributor.domain.service.TaskInfoService;

@Slf4j
@RequiredArgsConstructor
@Component
public class TaskInfoListener {

    private final TaskInfoService taskInfoService;

    @KafkaListener(topics = "common.avro.notifications", containerFactory = "taskInfoContainerFactory")
    public void handleMessage(@Payload TaskInfoEvent taskInfoEvent, Acknowledgment acknowledgment) {
        log.info("Task info received: " + taskInfoEvent.getTaskId());

        taskInfoService.getExtendedTaskInfo(taskInfoEvent.getTaskId());

        acknowledgment.acknowledge();
    }
}
