import java.util.*;

public class graph {
    //Declaring the adjlist
    private Map<Integer, ArrayList<Integer>> adjLst;
    
    graph(int v){
        //Initializing the adjLst
        adjLst = new HashMap<>();
        
        for(int i = 0; i<v; i++){
            adjLst.put(i, new ArrayList<>());
        }
    }

    public void addEdge(int v, int w){
        //This is a biderctional graph.
        adjLst.get(v).add(w);
        adjLst.get(w).add(v);
    }
}
