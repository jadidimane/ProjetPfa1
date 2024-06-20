package com.example.projetpfa;

public class SoldOutException extends Exception{
    public SoldOutException(String message){
        super(message);
    }
}
