<<<<<<< HEAD
public class NumberDisplay{
    private int currValue;
    private int maxValue;
    public NumberDisplay(int max){
        maxValue = max;
        currValue = 0;
    }
    public void setValue(int newValue){
        if((newValue >= 0) && (newValue < maxValue))
            currValue = newValue;
    }
    public int getValue(){
        return currValue;
    }
    public String getDisplayValue(){
        if(currValue < 10)
            return "0" + currValue;
        else
            return "" + currValue;
    }
    public void increment(){
        currValue = (currValue + 1) % maxValue;
    }
=======
public class NumberDisplay{
    private int currValue;
    private int maxValue;
    public NumberDisplay(int max){
        maxValue = max;
        currValue = 0;
    }
    public void setValue(int newValue){
        if((newValue >= 0) && (newValue < maxValue))
            currValue = newValue;
    }
    public int getValue(){
        return currValue;
    }
    public String getDisplayValue(){
        if(currValue < 10)
            return "0" + currValue;
        else
            return "" + currValue;
    }
    public void increment(){
        currValue = (currValue + 1) % maxValue;
    }
>>>>>>> bd57c011115fb35a376736875b5cc6cfdc3fc046
}