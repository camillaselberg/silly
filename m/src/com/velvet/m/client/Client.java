package com.velvet.m.client;

/**
 * Created by ake on 5/19/15.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("Starting mClient");
        // write your code here

        GameView view = new AkeView();
        //GameServerAPI model = new GameServerApi();
        //GameController game = new Game(view, model);
        GameController game = new Game(view);
    }
}
