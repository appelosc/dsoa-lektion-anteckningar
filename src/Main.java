public class Main {
    public static void main(String[] args) {
        /**
        String[] testData = {"Frodo", "Samwise", "Gandalf", "Aragorn", "Legolas", "Gimli", "Boromir", "Meriadoc", "Peregrin", "Gollum", "Galadriel", "Elrond", "Arwen", "Saruman", "Bilbo", "Faramir", "Éowyn", "Théoden", "Denethor", "Treebeard"};
        StringArray names = new StringArray(testData);
        System.out.println(names.toString());
        names.append("Sauron");
        System.out.println(names.toString());
        names.insert(4, "Brego");
        System.out.println(names.toString());
        names.reverse();
        System.out.println(names.toString());
         **/
        String[] testData = {"Frodo", "Samwise", "Gandalf", "Aragorn", "Legolas", "Gimli", "Boromir", "Meriadoc", "Peregrin", "Gollum", "Galadriel", "Elrond", "Arwen", "Saruman", "Bilbo", "Faramir", "Éowyn", "Théoden", "Denethor", "Treebeard"};

        Person p1 = new Person(testData[0]);
        p1.next = new Person(testData[1]);
        p1.next.next = new Person(testData[2]);
        p1.next.next.next = new Person(testData[3]);

        Person current = p1;
        while(current!=null){
            System.out.println(current.getName());
            current = current.next;
        }




        //new BigO();
    }
}
