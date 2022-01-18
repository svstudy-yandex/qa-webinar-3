package ru.yandex.qa3.hw3.model;

public class Task {
    private int id;

    private static int lastId;


    static {
        lastId = 0;
    }

    public Task() {
        id = ++lastId;
    }

    @Override
    public String toString() {
        return "Task{}";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
