class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
     Graph g = new Graph();
        g.buildGraph(edges, succProb);  
        if(g.nodes.get(start) == null)
            return 0;
        g.nodes.get(start).prob = 1;
        PriorityQueue<Node> queue = new PriorityQueue<Node>(new ProbsComprator());
        queue.add(g.nodes.get(start));
        while(!queue.isEmpty()){
            Node currentNode = queue.poll();
           currentNode.visited = true;    

            if(currentNode.value == end){
                return currentNode.prob;
            }
            for(Pair<Double, Node> edge : currentNode.adj){
                Node edgeNode  = edge.getValue();
                if(edge.getKey() * currentNode.prob > edgeNode.prob){
                   

                  
                if(!edgeNode.visited){
             
                     edgeNode.prob =  edge.getKey() * currentNode.prob;
                    Node foo = new Node(edgeNode.value);
                    foo.adj = edgeNode.adj;
                    foo.prob = edgeNode.prob;
                    foo.visited = edgeNode.visited;
                    queue.add(foo);
                  
                }
                }
              
            }
                  }
        return 0;
    }
}

class Graph{
    
    HashMap<Integer, Node> nodes = new HashMap();
    
    public void buildGraph(int[][]edges, double[] succProb){
        for(int i = 0; i < edges.length; i++){
            if(!nodes.containsKey(edges[i][0])){
                Node node = new Node(edges[i][0]);
                nodes.put(edges[i][0], node);
            }
            if(!nodes.containsKey(edges[i][1])){
                Node node = new Node(edges[i][1]);
                nodes.put(edges[i][1], node);
            }
            Pair<Double, Node> adj = new Pair(succProb[i], nodes.get(edges[i][1]));
            nodes.get(edges[i][0]).adj.add(adj);
            Pair<Double, Node> adj2 = new Pair(succProb[i], nodes.get(edges[i][0]));
            nodes.get(edges[i][1]).adj.add(adj2);
            
            // for(int j = 0; j < nodes[edges[i][0]].adj.size(); i++){
            //     Pair<Integer, Node> currentAdj = nodes[edges[i][0]].adj.get(i);
            //     if(!nodes.containsKey(currentAdj.getKey()))
                
            }
        }
}

class Node{
    int value;
    double prob = 0.0;
    boolean visited = false;
    ArrayList<Pair<Double, Node>> adj = new ArrayList<>();
    Node(int value){
        this.value = value;
    }
    
    public void addAdj(Node node, int prob){
        adj.add(new Pair(prob, node));
    }
}

class ProbsComprator implements Comparator<Node> {
 
    // Method
    // Sorting in ascending order of roll number
   public int compare(Node p1, Node p2) {
 
       if(p2.prob > p1.prob){
           return 1;
       }
       else if(p2.prob < p1.prob){
           return -1;
       }
       return  0;
   }
}