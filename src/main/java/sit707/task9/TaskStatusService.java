package sit707.task9;

import java.util.HashMap;
import java.util.Map;

public class TaskStatusService {

    private final Map<String, String> taskStatuses = new HashMap<>();

    public TaskStatusService() {

        taskStatuses.put("S123-T1", "Submitted");
        taskStatuses.put("S123-T2", "Reviewed");
        taskStatuses.put("S123-T3", "Not Submitted");
    }

    public String checkStatus(String studentId, String taskId) {

        if(studentId == null || taskId == null ||
           studentId.isEmpty() || taskId.isEmpty()) {

            return "Invalid Task";
        }

        String key = studentId + "-" + taskId;

        return taskStatuses.getOrDefault(
            key,
            "Invalid Task"
        );
    }
}