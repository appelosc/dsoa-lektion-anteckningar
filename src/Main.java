public class Main {
    public static void main(String[] args) {
        String[] testData = {"Frodo", "Samwise", "Gandalf", "Aragorn", "Legolas", "Gimli", "Boromir", "Meriadoc", "Peregrin", "Gollum", "Galadriel", "Elrond", "Arwen", "Saruman", "Bilbo", "Faramir", "Éowyn", "Théoden", "Denethor", "Treebeard"};

        StringArray names = new StringArray(testData);
        System.out.println(names.toString());
        names.append("Sauron");
        System.out.println(names.toString());
        names.insert(4, "Brego");
        System.out.println(names.toString());
        names.reverse();
        System.out.println(names.toString());



        //new BigO();
    }
}
