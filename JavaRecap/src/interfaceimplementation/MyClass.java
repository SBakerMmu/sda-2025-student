package interfaceimplementation;

class MyClass implements MyInterface {
    @Override
    public String someMethod(String paramName1, int paramName2) {
        return "Hello from MyClass";
    }
}
