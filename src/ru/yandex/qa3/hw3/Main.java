package ru.yandex.qa3.hw3;

import java.util.ArrayList;
import java.util.Collection;

import ru.yandex.qa3.hw3.model.Epic;
import ru.yandex.qa3.hw3.model.Subtask;
import ru.yandex.qa3.hw3.model.Task;
import ru.yandex.qa3.hw3.service.TaskManager2;

public class Main {
    public static void main(String[] args) {
        if (Boolean.TRUE.equals(test())) {

        }

        Task epic = new Epic();
        Task task = new Task();

        System.out.println(epic.getId());
        System.out.println(task.getId());

    }

    public static Boolean test() {
        //..
        return null;
    }
}
