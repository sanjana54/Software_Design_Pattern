package SolidPrinciple.DependencyInversionPrinciple;

public class WiredKeyboard implements Keyboard{
    @Override
    public void type() {
        System.out.println("There used wired keyboard.");
    }
}
