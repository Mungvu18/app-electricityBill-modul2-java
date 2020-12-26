
import java.util.Scanner;

public class TestMain {
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int ZERO = 0;
    static BillManage billManage  = new BillManage();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do{
            System.out.println("1. Add new customer ");
            System.out.println("2. Display all bill for customer ");
            System.out.println("3. Return money for customer ");
            System.out.println("0. Exit app ");
            System.out.println("Enter choice ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case ONE:
                    System.out.println("Enter n customer you want to add");
                    int numCus =Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < numCus; i++) {
                        setInfoCustomer();
                    }
                    break;
                case    TWO:
                    System.out.println(billManage.billLists);
                    break;
                case THREE:
                    showBillCustomerByMeterCode();
                    break;
                case ZERO:
                    System.exit(0);
                    break;
            }
        } while(choice!=ZERO);
    }
    public static void setInfoCustomer(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter name ");
        String name = sc.nextLine();
        System.out.println("Enter apartmentId");
        String apartmentId = sc1.nextLine();
        System.out.println("Enter meterCode");
        String meterCode = sc.nextLine();
        System.out.println("Enter oldIndex");
        int oldIndex =Integer.parseInt(sc1.nextLine());
        System.out.println("Enter newIndex");
        int newIndex =Integer.parseInt(sc.nextLine());
        Customer customer = new Customer(name,apartmentId,meterCode);
        Bill bill = new Bill(customer,oldIndex,newIndex);
        billManage.addNew(meterCode,bill);
    }
    public static void showBillCustomerByMeterCode(){
        System.out.println("Enter meterCode you want to search ");
        String meterCode = sc.nextLine();
        billManage.showCusByMetCode(meterCode);
    }
}
