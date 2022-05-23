public class Flowers {
    private String FlowersName;
    private double price;

    public Flowers(String name, double price) {
        this.FlowersName = name;
        this.price = price;
    }

    public String getFlowersName() {
        return FlowersName;
    }

    public void setFlowersName(String flowersName) {
        this.FlowersName = flowersName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
