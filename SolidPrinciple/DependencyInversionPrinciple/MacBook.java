package SolidPrinciple.DependencyInversionPrinciple;

public class MacBook {
    private final Keyboard keyboard;
    private final Mouse mouse;

    public MacBook(Keyboard keyboard,Mouse mouse){
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public void run(){
        keyboard.type();
        mouse.point();
    }
}
