package generalfacade;

final class ServiceFacade implements Service {

     public void methodA() {
        final SubSystemClass1 class1 = new SubSystemClass1();
        final SubSystemClass2 class2 = new SubSystemClass2();
        class1.method1();
        class2.method2();
    }

    public void methodB() {
        final SubSystemClass2 class2 = new SubSystemClass2();
        final SubSystemClass3 class3 = new SubSystemClass3();
        class2.method2();
        class3.method3();
    }
}
