package src.main.java;

import java.util.LinkedList;
import java.util.Queue;


//Вариант 4. Практическое задание 5. Реализуйте интерфейс “Task” для обработки данных, поступающих в очередь.
//Процесс обработки имитируется выводом сообщения в консоль. Метод start() начинает чтение и обработку данных из очереди, а stop() останавливает процесс.
public class Prac5 implements Task {
    private final Queue<String> queue = new LinkedList<>();
    private volatile boolean running = false; // флаг для остановки
    private Thread workerThread;

    public void addTask(String data) {
        queue.offer(data);
    }

    @Override
    public void start() {
        if (running) {
            System.out.println("Task уже запущен");
            return;
        }
        running = true;
        workerThread = new Thread(() -> {
            while (running) {
                String data = queue.poll();
                if (data != null) {
                    process(data);
                } else {
                    try {
                        Thread.sleep(100); // ждём новые данные
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            System.out.println("Task остановлен");
        });
        workerThread.start();
        System.out.println("Task запущен");
    }

    @Override
    public void stop() {
        running = false;
        if (workerThread != null) {
            workerThread.interrupt();
        }
    }

    private void process(String data) {
        System.out.println("Обрабатываем: " + data);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void starts() throws InterruptedException {
        Prac5 task = new Prac5();
        task.addTask("Задача 1");
        task.addTask("Задача 2");
        task.addTask("Задача 3");
        task.start();
        Thread.sleep(3000);
        task.stop();
    }
}
