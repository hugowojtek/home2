package dequeue;


import com.sun.jmx.remote.internal.ArrayQueue;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MainClass {
    public static Deque queue = new ArrayDeque();



    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            showMenu();
            String text = scanner.nextLine();
            switch (text) {
                case "1":
                    addTask();
                    break;
                case "2":
                    executeTask();

                    break;

                case "3":
                    exitProgram();

                    break;
                default:
                    break;

               }

        }
    }
    private static void exitProgram() {



            System.exit(0);



        }




    private static void executeTask() throws IOException{
        {

           Task task = (Task) queue.poll();
            System.out.println("zadanie zostało wykonane "+task.getTitle());
        }

    }


    /**pyta użtkownika
     *
     */
    private static void addTask() {
        Scanner scanner = new Scanner(System.in);
        Task task = new Task();
        DateTimeFormatter isoLocalDate = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println("Podaj tytuł zadania");
        task.setTitle(scanner.nextLine());
        System.out.println("Podaj datę wykonania  zadania (YYYY-mm-dd");

        while(true) {
            try {
                LocalDate parse = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ISO_LOCAL_DATE);
                task.setExecuteDate(parse);
                break;
            } catch (DateTimeParseException e) {//runtime exception
                System.out.println("Data nieprawidłowa");
            }
        }

        task.setCreationDate(LocalDate.now());
        queue.add(task);
    }

    private static void showMenu() {
        System.out.println("loggowanie zadań");
        System.out.println("1-Dodaj zadania");
        System.out.println("2-Wykonaj zadanie");
        System.out.println("3-Zamknij program");


    }





    }


