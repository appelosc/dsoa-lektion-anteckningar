import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Graphy {

    private HashMap<String, Node> nodes = new HashMap<>();

    private class Node{
        private Set<Node> edges;
        private String name;

        public Node(String name){
            this.name = name;
            edges = new HashSet<>();
        }
    }

    public void addNode(String name){
        Node n = nodes.get(name);
        if(n==null){
            n = new Node(name);
            nodes.put(name, n);
        }
    }

    public void addEdge(String fromName, String toName){
        nodes.get(fromName).edges.add(nodes.get(toName));

    }

    public String toString(){
        String ret = " ";
        for(String name: nodes.keySet()){
            ret += "\n[" + name + "]" + "==> ";
            for(Node edge: nodes.get(name).edges){
                ret += edge.name + " ";
            }
        }
        return ret;
    }
}
