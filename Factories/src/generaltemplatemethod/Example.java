package generaltemplatemethod;


public class Example {

    public static void run() {
        AbstractClass templateClass = new ConcreteClass1();
        templateClass.templateMethod();
        templateClass = new ConcreteClass2();
        templateClass.templateMethod();
    }
}
