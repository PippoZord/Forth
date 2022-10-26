package it.unimi.di.sweng.lab03;

import java.util.ArrayDeque;


public class ForthInterpreter implements  Interpreter{

    private ArrayDeque<Integer> queue;

    public ForthInterpreter(){
        queue = new ArrayDeque<>();

    }
    @Override
    public void input(String program) {
        

    }


    @Override
    public String toString(){
        return "<- Top";
    }
    
}
