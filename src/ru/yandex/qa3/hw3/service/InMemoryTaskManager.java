package ru.yandex.qa3.hw3.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import ru.yandex.qa3.hw3.model.Epic;
import ru.yandex.qa3.hw3.model.Subtask;
import ru.yandex.qa3.hw3.model.Task;

public class InMemoryTaskManager implements TaskManager {
    public static final int MAX_HISTORY_COUNT = 10;

    private final ArrayList<Task> viewHistory;
    private final TaskId taskId;
            
    InMemoryTaskManager() {
        taskId = new TaskId();
        viewHistory = new ArrayList<>();
    }

    public Epic getEpic(long id) {
        // ...
        Epic epic = null;
        // ..
        updateHistory(epic);
        return null;
    }

    public Subtask getSubtask(long id) {
        // ...
        return null;
    }

    public Task getTask(long id) {
        // ...
        return null;
    }

    private void updateHistory(Task task) {
        if (viewHistory.size() > MAX_HISTORY_COUNT) {
            //.
        }
    }

    @Override
    public Collection<Task> history() {
        return viewHistory;
    }


    //...
}
