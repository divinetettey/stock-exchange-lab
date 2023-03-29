package main.turntable.clients;

public class Client {
    private String firstName;
    private String lastName;
    private int pointsGained;
    private MembershipType membershipType;
    public Client() {
        this("","", null);
    }

    /**
     * new client with no membership
     *
     * @param firstName
     * @param lastName
     */
    public Client(String firstName, String lastName){
        this(firstName, lastName, null);
    }

    /**
     * member with membership
     *
     * @param firstName
     * @param lastName
     * @param membershipType
     */
    public Client(String firstName, String lastName, MembershipType membershipType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.membershipType = membershipType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPointsGained() {
        return pointsGained;
    }

    public void setPointsGained(int pointsGained) {
        this.pointsGained = pointsGained;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

    /**
     * get full name of client
     * @return
     */
    public String getFullName(){
        return this.getFirstName()+" "+this.getLastName();
    }
}
