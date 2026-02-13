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
        Queuey q = new Queuey();
        q.enqueue("Samwise");
        q.enqueue("Gandalf");
        q.enqueue("Aragorn");
        System.out.println(q);
        q.deQueue();
        q.enqueue("Frodo");
        System.out.println(q);


        /**
        Stacky stacky = new Stacky(5);
        stacky.push("Frodo");
        stacky.push("Samwise");
        stacky.push("Gandalf");
        stacky.push("Aragorn");
        stacky.push("Legolas");
        System.out.println(stacky);
        stacky.pop();
        System.out.println(stacky);
        **/

        /**
        //Code Challenge Circular Arr-gument;
        String[] weekDays = {"må", "ti","on","to","fr","lö","sö"};

        int today = 4; //fredag
        System.out.printf("I dag är det %s\n",weekDays[today]);
        System.out.printf("I övermorgon är det %s\n",weekDays[(today+2) % weekDays.length]);
        System.out.printf("Om 6 dagar är det %s\n",weekDays[(today+6) % weekDays.length]);
        System.out.printf("Om 15 dagar är det %s\n",weekDays[(today+15) % weekDays.length]);
        **/

        /** LInked list
        Linky linky = new Linky();
        linky.add(new Person(testData[0]));
        linky.add(new Person(testData[1]));
        linky.add(new Person(testData[2]));
        linky.add(new Person(testData[3]));
        System.out.println(linky.toString());
        System.out.println(linky.size());
         **/
        //new BigO();
    }
}
