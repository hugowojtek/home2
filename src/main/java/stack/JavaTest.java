package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class JavaTest {
    static Deque stack = new ArrayDeque();
    public static void main(String[] args) {

        String[] table = {"+","1","+","2","-","+","3","+","4"};//,"+","5","+","6","+","7","+","8","+","9","-","-","-","-","-","-","-","-","+","12","+","23"};

        for (int i=0;i<table.length;i++){
            if (table[i]=="+") {
                i++;
                stack.push(table[i]);

            }
            if (table[i]=="-") {

                stack.pop();
            }
            ShowStack();
            }

    }
    public static void ShowStack() {
        Iterator iterator = stack.iterator();
        System.out.print("---");
        while (iterator.hasNext()){
            //if (tab[i]!=null) {
            System.out.print(iterator.next());
            System.out.print(",");

        }
        System.out.println();
    }
    }