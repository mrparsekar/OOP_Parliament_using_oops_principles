/*
Name: Shreyash Parsekar
Roll No: 44
Batch-3
MCA-Part-1
*/

public class ParliamentOfIndia {
    private PresidentOfIndia president;
    private GovernmentBody rajyaSabha;
    private GovernmentBody lokSabha;

    public ParliamentOfIndia(PresidentOfIndia president, GovernmentBody rajyaSabha, GovernmentBody lokSabha) {
        this.president = president;
        this.rajyaSabha = rajyaSabha;
        this.lokSabha = lokSabha;
    }

    @Override
    public String toString() {
        return president.toString() + "\n" + rajyaSabha.toString() + "\n" + lokSabha.toString();
    }
}
