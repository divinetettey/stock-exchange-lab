package main.turntable.clients;

public class MembershipType {
    private int minPoints;
    private int maxPoints;

    public MembershipType() {
    }

    public MembershipType(int minPoints,int maxPoints) {
        this.minPoints = minPoints;
        this.maxPoints = maxPoints;
    }

    public int getMinPoints() {
        return minPoints;
    }

    public void setMinPoints(int minPoints) {
        this.minPoints = minPoints;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(int maxPoints) {
        this.maxPoints = maxPoints;
    }
}
