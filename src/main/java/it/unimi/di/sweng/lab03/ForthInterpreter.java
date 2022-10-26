package it.unimi.di.sweng.lab03;

import java.util.ArrayDeque;


public class ForthInterpreter implements  Interpreter{

    private ArrayDeque<Integer> queue;

    public ForthInterpreter(){
        queue = new ArrayDeque<>();

    }
    @Override
    public void input(String program) {
        queue.clear();
        if (program.equals("")){return;}
        String st[] = program.split(" ");
    
        for (String s : st) {
            queue.add(Integer.parseInt(s));
        }

    }


    @Override
    public String toString(){
        String s = "";
        for (Integer i : queue) {
            s += i + " ";
        }
        return s + "<- Top";
    }
    
}
