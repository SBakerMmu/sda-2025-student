package typedreferences;

public class Example {

    public static void run()
    {
        //Operations available to the variable of type MyInterface are just interfaceMethodA()
        MyInterface myInterface = new E();
        myInterface.interfaceMethodA(); //prints Hello from D.interfaceMethodA

//Operations available to the variable of type D are interfaceMethodA() and methodA()
        D d = new E();
        d.interfaceMethodA(); //Hello from D.interfaceMethodA
        d.methodA(); //Hello from E.methodA

//Operations available to the variable of type E interfaceMethodA(), methodA() and methodB();
        E e = new E();
        e.interfaceMethodA(); //Hello from D.interfaceMethodA
        e.methodA(); //Hello from E.methodA
        e.methodB(); //Hello from E.methodB
    }
}
