package io.turntabl.clients;

import io.turntabl.trades.Trade;

public class Client {
    private String firstName;
    private String lastName;
    private int pointsGained;
    private MembershipType membershipType;

    /**
     * new client with no membership
     *
     * @param firstName
     * @param lastName
     */
    public Client(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
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

    /**
     * add new trade
     * @param trade
     */
    public boolean  addTrade(Trade trade) {
        if(membershipType == null){
            return true;
        }

        if(membershipType.canTrade(trade)){
            pointsGained++;
            return true;
        }

        return false;
    }
}
