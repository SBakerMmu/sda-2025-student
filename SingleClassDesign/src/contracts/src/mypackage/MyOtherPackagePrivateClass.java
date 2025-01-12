package contracts.src.mypackage;

class MyOtherPackagePrivateClass {
    String myOtherClassField = "";
    void MyOtherClassMethod()
    {
        MyPackagePrivateClass myClass  = new MyPackagePrivateClass();
        myClass.myClassField = "new myClassField value";
        myClass.MyMethod();
    }
}
