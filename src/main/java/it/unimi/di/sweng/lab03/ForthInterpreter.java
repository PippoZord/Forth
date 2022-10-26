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
        String tmp = program.replaceAll("\n+", " ");
        String st[] = tmp.split(" +");
    
        for (String s : st) {
            System.out.println(s);
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
    
    public static void main(String[] args) {
        ForthInterpreter f = new ForthInterpreter();
        f.input("1 2");
        f.input("1\n2");
        f.input("1   \n2");
    
    }
}
