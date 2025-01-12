package generalfacade;

final class StatefulFacade {

    private final SubSystemClass1 class1 = new SubSystemClass1();
    private final SubSystemClass2 class2 = new SubSystemClass2();
    private final SubSystemClass3 class3 = new SubSystemClass3();

    void methodA() {
        class1.method1();
        class2.method2();
    }

    void methodB() {
        class2.method2();
        class3.method3();
    }
}
