import java.util.*;
public class AStar {

    private ArrayList<Node> path;
    public Node startingNode;
    public Node targetNode;

    public Node getStartingNode() {
        return this.startingNode;
    }

    public Node getTargetNode() {
        return this.targetNode;
    }

    public AStar(Node n, Node[] beehive) {
        path = new ArrayList<Node>();
        startingNode = n;
        findTarget(beehive);
    }

    public void algorithm() {
        Node[] open = new Node[(int)(startingNode.getDistanceToFinish()*26)];
        open[0] = startingNode;
        int counter = 1;
        double lowest = open[0].getCost();
        Node current = open[0];
        for (int i = 1; i < open.length; i++) {
            double temp = open[i].getCost();
            if (temp < lowest) {
                lowest = temp;
                current = open[i];
            }
        }
        for (int x = -1; x < 2; x++) {
            for (int y = -1; y < 2; y++) {
                for (int z = -1; z < 2; z++) {
                    if ((x != 0 && y != 0 && z != 0)) {
                        open[counter] = new Node(current.getX() + x, current.getY() + y, current.getZ() + z);

                        counter++;
                    }
                }
            }
        }
    }

    public void findTarget(Node[] beehive) {
        // boolean done = false;
        // while (beehive.length != 1) {
        //     double distance = calcDistance(beehive[beehive.length/2], startingNode);
        //     if (calcDistance(beehive[(beehive.length/2) + 1]), startingNode) > distance) {
        //         if (calcDistance)
        //     }
        // }
        double shortest = calcDistance(beehive[0], startingNode);
        Node temp = beehive[0];
        for (int i = 1; i < 15; i++) {
            double distance = calcDistance(beehive[i], startingNode);
            if (distance > shortest) {
                shortest = distance;
                temp = beehive[i];
            }
        }
        this.target = temp;
    }

    public double calcDistance(Node n, Node a) {
        return Math.sqrt(Math.pow((n.getX() - a.getX()), 2) + Math.pow((n.getY() - a.getY()), 2) + Math.pow((n.getZ() - a.getZ()), 2));
    }

    
}
