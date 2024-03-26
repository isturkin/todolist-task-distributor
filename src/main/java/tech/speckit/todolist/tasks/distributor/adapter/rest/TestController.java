package tech.speckit.todolist.tasks.distributor.adapter.rest;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.speckit.todolist.tasks.distributor.domain.service.TaskInfoService;

import java.util.concurrent.TimeoutException;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/test")
@RestController
public class TestController {

    private final TaskInfoService taskInfoService;

    @GetMapping
    public void test() throws TimeoutException {
        log.info("TEST TASK: " + taskInfoService.getExtendedTaskInfo("2"));
    }
}
