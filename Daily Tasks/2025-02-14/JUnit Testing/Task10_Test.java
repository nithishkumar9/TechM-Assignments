package org.anurag.test;

//10. Write a Java program that create tests that verify the interaction between different components or modules in your application.

import org.anurag.Task10;
import org.anurag.Task10_Repository;
import org.junit.Test;
import static org.junit.Assert.*;

public class Task10_Test {
    private final Task10_Repository repository = new Task10_Repository();
    private final Task10 service = new Task10(repository);

    @Test
    public void testProcessAndSave() {
        String result = service.processAndSave(1, "hello");
        assertEquals("HELLO", result);
        assertEquals("HELLO", service.getProcessedValue(1));
    }

    @Test
    public void testRetrieveNonExisting() {
        assertNull("Should return null for non-existing ID", service.getProcessedValue(99));
    }
}