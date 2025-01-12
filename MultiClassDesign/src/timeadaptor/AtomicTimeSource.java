package timeadaptor;

class AtomicTimeSource
{
    public long getTimeInMs()
    {
        //Not really atomic
        return System.currentTimeMillis();
    }
}
