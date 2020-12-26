public class Bill {
    Customer customer;
    int oldIndex;
    int newIndex;
    int totalMoney;

    public Bill(Customer customer, int oldIndex, int newIndex) {
        this.customer = customer;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public int getTotalMoney() {
        return totalMoney = (newIndex - oldIndex) * 750;
    }

    @Override
    public String toString() {
        return "Bill :" +
                "customer=" + customer +
                ", oldIndex=" + oldIndex +
                ", newIndex=" + newIndex +
                ", totalMoney=" + getTotalMoney() +
                '\n';
    }
}
