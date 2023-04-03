package org.example;

import tp1.BCDEnconder;

public class Main {
    public static void main(String[] args) {
        BCDEnconder bcdEnconder = new BCDEnconder();
        System.out.println(bcdEnconder.decode(bcdEnconder.encode(2345)));
    }
}