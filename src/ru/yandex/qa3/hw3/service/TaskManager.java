package ru.yandex.qa3.hw3.service;

import java.util.ArrayList;
import java.util.Collection;

import ru.yandex.qa3.hw3.model.Task;

public interface TaskManager {
    Collection<Task> history();
}
