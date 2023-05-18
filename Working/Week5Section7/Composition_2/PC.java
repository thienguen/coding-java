package Composition_2;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.setMotherboard(motherboard);
    }

    /**
     * @return the motherboard
     */
    public Motherboard getMotherboard() {
        return motherboard;
    }

    /**
     * @param motherboard the motherboard to set
     */
    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics
        monitor.drawPixelAt(1200, 50, "yellow");
    }
}
