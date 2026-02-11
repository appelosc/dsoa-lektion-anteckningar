import java.util.Arrays;

public class StringArray {

    String[] values;

    public StringArray(String[] values) {
        this.values = values;
        System.out.println("New stringArray, length: " +values.length);
    }
    public void append(String value){
        String[] newValues = new String[values.length +1];
        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i];

        }
        newValues[values.length] = value;
        values = newValues;

    }

    public void insert(int index, String value){
        append(null);
        for (int i = values.length-1; i > index ; i--) {
            values[i] = values[i-1];

        }
        values[index] = value;
        System.out.printf("Insert value %s at %d.\n", value,index);
    }
    //CC-reverse()
    public void reverse(){
        String[] revArr = new String[values.length];
        int indexLen = values.length-1;
        for (int i = 0; i < values.length; i++) {
             revArr[indexLen-i] = values[i];
        }
        values = revArr;
    }

    public String toString(){
        return Arrays.toString(values);

    }
}
