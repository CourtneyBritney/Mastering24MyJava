package com.courtney;

import static com.courtney.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from" + currentThread().getName());
    }
}
