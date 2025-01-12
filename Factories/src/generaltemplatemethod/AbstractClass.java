package generaltemplatemethod;

abstract class AbstractClass
{
    public void templateMethod()
    {
        operation1();
        operation2();
        //add more as required

    }

    protected abstract void operation1();
    protected abstract void operation2();
}
