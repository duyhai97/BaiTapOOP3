import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    List<Candidates> candidatesList = new ArrayList<>();

    public Manager(List<Candidates> candidatesList) {
        this.candidatesList = candidatesList;
    }


    public List<Candidates> getCandidatesList() {
        return candidatesList;
    }

    public void setCandidatesList(List<Candidates> candidatesList) {
        this.candidatesList = candidatesList;
    }

    public void Add(Candidates candidates){
        this.candidatesList.add(candidates);
    }

    public void disPlayStudentAndBlock(){
        for (Candidates c: candidatesList) {
            System.out.println(c.toString());
        }
    }
    public void searchByID(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập số báo danh để kiểm tra: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Candidates c : candidatesList) {
            if (c.getIdentificationNumber() == id) {
                System.out.println(c.toString());
            }
        }
    }


}
