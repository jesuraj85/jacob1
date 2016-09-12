public class Calculator
{
    public Calculator()
    {
        value = 0;
    }
    public int getValue()
    {
        return value;
    }
    void setValue( int val )
    {
        value = val;
    }
    void clear()
    {
    	value = 0;
    }
    void add( int val )
    {
    	value += val;
    }
    void subtract( int val )
    {
    	value -= val;
    }
    void multiplyBy( int val )
    {
    	value *= val;
    }
    void divideBy( int val )
    {
    	value /= val;
    }

    private int value;
}
