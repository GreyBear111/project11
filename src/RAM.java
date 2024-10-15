public class RAM {
  private final String model;
  private final double price;

  public RAM(String model, double price) {
    this.model = model;
    this.price = price;
  }

  public String getModel() {
    return model;
  }

  public double getPrice() {
    return price;
  }
}
