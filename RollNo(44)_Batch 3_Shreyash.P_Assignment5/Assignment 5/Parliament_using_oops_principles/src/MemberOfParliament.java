/*
Name: Shreyash Parsekar
Roll No: 44
Batch-3
MCA-Part-1
*/

public class MemberOfParliament {
    private String name;
    private String position;
    private String party;

    public MemberOfParliament(String name, String position, String party) {
        this.name = name;
        this.position = position;
        this.party = party;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Position: %s, Party: %s", name, position, party);
    }
}
