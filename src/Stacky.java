public class Stacky {
    int topOfSTack = -1;
    int stackSize;

    String[] data;

    public Stacky(int stackSize) {
        this.stackSize = stackSize;
        data = new String[stackSize];
    }
    public void push(String elem){
        if(topOfSTack +1>=stackSize){
            throw new StackOverflowError("Stacken är full");
        }
        topOfSTack ++;
        data[topOfSTack] = elem;
    }

    public String pop() {
        String ret = data[topOfSTack];
        topOfSTack--;
        return ret;
    }

    public String toString(){
        String ret = "Stacky: (top) [";
        for (int i = topOfSTack; i >=0 ; i--) {
            ret += " " + data[i];
        }

        return ret + " (bottom) ]";
    }

}
