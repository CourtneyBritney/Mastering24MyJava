package com.courtney;

public class PC {
    //This extends from all three classes at once instead of extending from 1 class only
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        //Fancy graphics
        monitor.drawPixelAt(1200, 50, "yellow");
    }


}
