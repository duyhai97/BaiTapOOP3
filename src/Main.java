import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static KhoiThi khoiA = new KhoiThi("Toán", "Lí","Hóa");
    static KhoiThi khoiB = new KhoiThi("Toán", "Hóa","Sinh");
    static KhoiThi khoiC = new KhoiThi("Văn", "Sử ","Địa");
    public static void main(String[] args) {
        List<Candidates> candidatesList = new ArrayList<>();
        Manager manager = new Manager(candidatesList);
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("mời nhập lựa chọn: ");
            System.out.println("nhập 1 để thêm thí sinh mới: ");
            System.out.println("nhập 2 để hiển thị thông tin thí sinh: ");
            System.out.println("nhập 3 để tìm kiếm thí sinh theo số báo danh: ");
            System.out.println("nhập 4 để kết thúc chương trình: ");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1:
                    System.out.println("Nhập a: thêm thí sinh khối A:");
                    System.out.println("Nhập b: thêm thí sinh khối B:");
                    System.out.println("Nhập c: thêm thí sinh khối C:");
                    String type = scanner.nextLine();
                    switch (type){
                        case "a" :
                            manager.Add(addCandidates("A"));
                            break;
                        case "b" :
                            manager.Add(addCandidates("B"));
                            break;
                        case "c" :
                            manager.Add(addCandidates("C"));
                            break;
                    }
                    break;
                case 2:
                    manager.disPlayStudentAndBlock();
                    break;
                case 3:
                    manager.searchByID();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("không có kết quả.");
                    break;
            }
        }
    }

    public static Candidates addCandidates(String cate){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số báo danh: ");
        int IdentificationNumber = Integer.parseInt(scanner.nextLine());
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        String name = scanner2.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("nhập mức ưu tiên: ");
        String prioritize = scanner.nextLine();
        Candidates a = new Candidates(IdentificationNumber, name, address, prioritize);
        switch (cate) {
            case "A":
                a.setKhoiThi(khoiA);
                break;
            case "B":
                a.setKhoiThi(khoiB);
                break;
            case "C":
                a.setKhoiThi(khoiC);
                break;
        }
        return a;
    }
}
