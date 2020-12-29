import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BillManage {
    public static final String NOT_EXITS = "meterCode you search not exits ";
    public static final String BILL = "Bill electricity of you is :";
    Map<String, Bill> billLists = new TreeMap<>();

    public void addNew(String meterCode, Bill bill) {
        billLists.put(meterCode, bill);
    }

    public void showCusByMetCode(String meterCode) {
        Set<String> keyLists = billLists.keySet();
        boolean testMeterCode = false;
        for (String key : keyLists) {
            testMeterCode = key.equals(meterCode);
            if (testMeterCode) {
                int totalMoney = billLists.get(key).getTotalMoney();
                System.out.println(BILL + totalMoney);
            }
        }
        if (!testMeterCode) {
            System.out.println(NOT_EXITS);
        }
    }
}
