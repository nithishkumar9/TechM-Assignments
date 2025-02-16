package org.anurag;

//10. Write a Java program that create tests that verify the interaction between different components or modules in your application.

public class Task10 {
    private final Task10_Repository repository;

    public Task10(Task10_Repository repository) {
        this.repository = repository;
    }

    public String processAndSave(int id, String value) {
        String processedValue = value.toUpperCase();
        repository.save(id, processedValue);
        return processedValue;
    }

    public String getProcessedValue(int id) {
        return repository.findById(id);
    }
}