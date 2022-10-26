package it.unimi.di.sweng.lab03;

import java.util.ArrayDeque;


public class ForthInterpreter implements  Interpreter{

    ArrayDeque<Integer> queue;
    public ForthInterpreter(){
        queue = new ArrayDeque<>();

    }
    @Override
    public void input(String program) {
        
    }
    
}
