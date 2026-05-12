package sit707.task9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TaskStatusServiceTest {

    @Test
    public void testSubmittedTaskStatus() {

        TaskStatusService service = new TaskStatusService();

        assertEquals(
            "Submitted",
            service.checkStatus("S123", "T1")
        );
    }

    @Test
    public void testReviewedTaskStatus() {

        TaskStatusService service = new TaskStatusService();

        assertEquals(
            "Reviewed",
            service.checkStatus("S123", "T2")
        );
    }

    @Test
    public void testNotSubmittedTaskStatus() {

        TaskStatusService service = new TaskStatusService();

        assertEquals(
            "Not Submitted",
            service.checkStatus("S123", "T3")
        );
    }

    @Test
    public void testInvalidTaskStatus() {

        TaskStatusService service = new TaskStatusService();

        assertEquals(
            "Invalid Task",
            service.checkStatus("S123", "T9")
        );
    }
}