
import java.util.Scanner;

public class TestMain {
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int ZERO = 0;
    public static final String ENTER_NAME_ = "Enter name ";
    public static final String ENTER_APARTMENT_ID = "Enter apartmentId";
    public static final String ENTER_METER_CODE = "Enter meterCode";
    public static final String ENTER_OLD_INDEX = "Enter oldIndex";
    public static final String ENTER_NEW_INDEX = "Enter newIndex";
    public static final String ENTER_METER_CODE_YOU_WANT_TO_SEARCH = "Enter meterCode you want to search ";
    public static final String ADD_NEW_CUSTOMER = "1. Add new customer ";
    public static final String DISPLAY_ALL_BILL_FOR_CUSTOMER = "2. Display all bill for customer ";
    public static final String RETURN_MONEY_FOR_CUSTOMER = "3. Return money for customer ";
    public static final String EXIT_APP = "0. Exit app ";
    public static final String ENTER_CHOICE_ = "Enter choice ";
    public static final String ENTER_NUMBER_CUSTOMER_YOU_WANT_TO_ADD = "Enter number customer you want to add";
    static BillManage billManage = new BillManage();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            menuShow();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case ONE:
                    System.out.println(ENTER_NUMBER_CUSTOMER_YOU_WANT_TO_ADD);
                    int numCus = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < numCus; i++) {
                        setInfoCustomer();
                    }
                    break;
                case TWO:
                    System.out.println(billManage.billLists);
                    break;
                case THREE:
                    showBillCustomerByMeterCode();
                    break;
                case ZERO:
                    System.exit(0);
                    break;
            }
        } while (choice != ZERO);
    }

    private static void menuShow() {
        System.out.println(ADD_NEW_CUSTOMER);
        System.out.println(DISPLAY_ALL_BILL_FOR_CUSTOMER);
        System.out.println(RETURN_MONEY_FOR_CUSTOMER);
        System.out.println(EXIT_APP);
        System.out.println(ENTER_CHOICE_);
    }

    public static void setInfoCustomer() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println(ENTER_NAME_);
        String name = sc.nextLine();
        System.out.println(ENTER_APARTMENT_ID);
        String apartmentId = sc1.nextLine();
        System.out.println(ENTER_METER_CODE);
        String meterCode = sc.nextLine();
        System.out.println(ENTER_OLD_INDEX);
        int oldIndex = Integer.parseInt(sc1.nextLine());
        System.out.println(ENTER_NEW_INDEX);
        int newIndex = Integer.parseInt(sc.nextLine());
        Customer customer = new Customer(name, apartmentId, meterCode);
        Bill bill = new Bill(customer, oldIndex, newIndex);
        billManage.addNew(meterCode, bill);
    }

    public static void showBillCustomerByMeterCode() {
        System.out.println(ENTER_METER_CODE_YOU_WANT_TO_SEARCH);
        String meterCode = sc.nextLine();
        billManage.showCusByMetCode(meterCode);
    }
}
