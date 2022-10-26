package it.unimi.di.sweng.lab03;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;


public class ForthInterpreter implements  Interpreter{

    private ArrayDeque<Integer> queue;

    public ForthInterpreter(){
        queue = new ArrayDeque<>();

    }
    @Override
    public void input(String program) {
        queue.clear();
        
        String st[] = split(program);
        
        addQueue(st);
        

    }


    private void addQueue(String[] st) {
        for (String s : st) {
            try {
                if (s.equals("+")){
                    queue.push(queue.pop()+queue.pop());
                } else {
                    queue.add(Integer.parseInt(s));
                }
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Token error '" + s + "'");
            } catch (NoSuchElementException e){
                throw new IllegalArgumentException("Stack Underflow");
            }
        }
    }

    private String[] split(String program) {
        if (program.equals("")) return new String[0];
        String tmp = program.replaceAll("\n+", " ");
        return tmp.split(" +");
        
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
