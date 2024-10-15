public class GPU {
  private final String model;
  private final double price;

  public GPU(String model, double price) {
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
