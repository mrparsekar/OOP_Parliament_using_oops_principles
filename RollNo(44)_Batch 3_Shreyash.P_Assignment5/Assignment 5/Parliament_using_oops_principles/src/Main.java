/*
Name: Shreyash Parsekar
Roll No: 44
Batch-3
MCA-Part-1
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RajyaSabha rajyaSabha = new RajyaSabha();
        LokSabha lokSabha = new LokSabha();
        PresidentOfIndia president = new PresidentOfIndia(null);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add a member to Rajya Sabha");
            System.out.println("2. Add a member to Lok Sabha");
            System.out.println("3. Add President");
            System.out.println("4. Show Parliament Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Member Name: ");
                    String nameRajyaSabha = scanner.nextLine();
                    System.out.print("Enter Position: ");
                    String positionRajyaSabha = scanner.nextLine();
                    System.out.print("Enter Party: ");
                    String partyRajyaSabha = scanner.nextLine();
                    rajyaSabha.addMember(new MemberOfParliament(nameRajyaSabha, positionRajyaSabha, partyRajyaSabha));
                    System.out.println("Member added to Rajya Sabha.");
                    break;

                case 2:
                    System.out.print("Enter Member Name: ");
                    String nameLokSabha = scanner.nextLine();
                    System.out.print("Enter Position: ");
                    String positionLokSabha = scanner.nextLine();
                    System.out.print("Enter Party: ");
                    String partyLokSabha = scanner.nextLine();
                    lokSabha.addMember(new MemberOfParliament(nameLokSabha, positionLokSabha, partyLokSabha));
                    System.out.println("Member added to Lok Sabha.");
                    break;

                case 3:
                    System.out.println("Enter President Name ");
                    String namePresident = scanner.nextLine();
                    president.setName(namePresident);
                    break;

                case 4:
                    ParliamentOfIndia parliament = new ParliamentOfIndia(president, rajyaSabha, lokSabha);
                    if (rajyaSabha.getMembers().isEmpty() && lokSabha.getMembers().isEmpty()) {
                        System.out.println("Please add members to Lok Sabha & Rajya Sabha!");
                    } else {
                        System.out.println(parliament.toString());
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}