public class Order {
    private int id;
    private long customerId;
    private long employeeId;
    private long [] flowers;

    public Order(int id, long customerId, long employeedId, long[] flowers) {
        this.id = id;
        this.customerId = customerId;
        this.employeeId = employeedId;
        this.flowers = flowers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public long[] getFlowers() {
        return flowers;
    }

    public void setFlowers(long[] flowers) {
        this.flowers = flowers;
    }
}
