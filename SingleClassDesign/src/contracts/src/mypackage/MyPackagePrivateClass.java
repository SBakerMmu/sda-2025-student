package contracts.src.mypackage;

class MyPackagePrivateClass {

    String myClassField = "";

    void MyMethod()
    {
        MyOtherPackagePrivateClass myOtherClass  = new MyOtherPackagePrivateClass();
        myOtherClass.myOtherClassField = "new myOtherClassField value";
        myOtherClass.MyOtherClassMethod();

    }
}

