package oopsAndInheritance;
class Foundation {
    private int var1 = 10;
    int var2 = 20;
    protected int var3 = 30;
    public int var4 = 40;

    public void showVariables() {
        System.out.println("Inside Foundation class:");
        System.out.println("Private var1: " + var1);
        System.out.println("Default var2: " + var2);
        System.out.println("Protected var3: " + var3);
        System.out.println("Public var4: " + var4);
    }
}

public class Sample12{
    public static void main(String[] args) {
        Foundation obj = new Foundation();

        System.out.println("Trying to access variables from another class:");
        System.out.println("Public var4: " + obj.var4);

        obj.showVariables();
    }
}
