import java.util.*;
public class Node {
    // ArrayList<Node> children;
    private int x;
    private int y;
    private int z; 
    private double distanceToStart;
    private double distanceToFinish;
    private double cost;
    
    public Node(int x, int y, int z) {
        // children = new ArrayList<Node>();
        this.x = x;
        this.y = y;
        this.z = z;
        this.distanceToStart = calcDistance(this, AStar.getStartingNode())
        this.distanceToFinish = calcDistance(this, AStar.getTargetNode());
        this.cost = distanceToFinish + distanceToStart;
    }
    


    public double calcDistance(Node n, Node a) {
        return Math.sqrt(Math.pow((n.getX() - a.getX()), 2) + Math.pow((n.getY() - a.getY()), 2) + Math.pow((n.getZ() - a.getZ()), 2));
    }
        
        
    public double getCost() {return cost;}

    public double getDistanceToStart() {
        return this.distanceToStart;
    }

    public void setDistanceToStart(double distanceToStart) {
        this.distanceToStart = distanceToStart;
    }

    public double getDistanceToFinish() {
        return this.distanceToFinish;
    }

    public void setDistanceToFinish(double distanceToFinish) {
        this.distanceToFinish = distanceToFinish;
    }
    
    public int getX() {
        return this.x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void setY(int y) {
    this.y = y;
    }

    public int getZ() {
        return this.z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}