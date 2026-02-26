public class Sorty {
    String[] values;

    public Sorty(String[] values){
        this.values = values.clone(); // skapara kopia, annars modifierar vi fortfarande topnames
    }
    public void insertioSort(){
        int ops = 0;
        for (int i = 1; i < values.length; i++) {
            String currentValue = values[i];
            int j = i-1; //jämför bakåt
            while(j>=0 && values[j].compareTo(currentValue)>0){
                values[j+1] = values[j];
                j--;
                ops++;
            }
            values[j+1] = currentValue;

        }
        System.out.println("Insertion sort ops: " + ops);
    }

    public void bubbleSort(){
        int ops = 0;
        //yttre loop;
        for (int i = 0; i < values.length; i++) {
            //inre loop
            for (int j = 1; j < values.length-i; j++) {
                if(values[j-1].compareTo(values[j])>0){
                    String temp = values[j-1];
                    values[j-1] = values[j];
                    values[j] = temp;
                    ops++;
                }
            }

        }
    }
}
