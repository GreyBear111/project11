import java.util.List;

public class PCAssembly {
  private final CPU cpu;
  private final Motherboard motherboard;
  private final List<GPU> gpus;
  private final RAM ram;
  private final Storage storage;
  private final PSU psu;
  private final Case caseComponent;

  public PCAssembly(CPU cpu,
      Motherboard motherboard,
      List<GPU> gpus,
      RAM ram,
      Storage storage,
      PSU psu,
      Case caseComponent) {
    this.cpu = cpu;
    this.motherboard = motherboard;
    this.gpus = gpus;
    this.ram = ram;
    this.storage = storage;
    this.psu = psu;
    this.caseComponent = caseComponent;
  }

  public void displayAssembly() {
    System.out.println("Збірка ПК:");
    System.out.println("Процесор: " + cpu.getModel() + " - Ціна: " + cpu.getPrice());
    System.out.println("Материнська плата: " + motherboard.getModel() + " - Ціна: " + motherboard.getPrice());
    for (GPU gpu : gpus) {
      System.out.println("Відеокарта: " + gpu.getModel() + " - Ціна: " + gpu.getPrice());
    }
    System.out.println("Оперативна пам'ять: " + ram.getModel() + " - Ціна: " + ram.getPrice());
    System.out.println("Накопичувач: " + storage.getModel() + " - Ціна: " + storage.getPrice());
    System.out.println("Блок живлення: " + psu.getModel() + " - Ціна: " + psu.getPrice());
    System.out.println("Корпус: " + caseComponent.getModel() + " - Ціна: " + caseComponent.getPrice());

    double totalPrice = calculateTotalPrice();
    System.out.println("Загальна сума збірки: " + totalPrice);
  }

  private double calculateTotalPrice() {
    double total = cpu.getPrice() + motherboard.getPrice() + ram.getPrice() + storage.getPrice() + psu.getPrice() + caseComponent.getPrice();
    for (GPU gpu : gpus) {
      total += gpu.getPrice();
    }
    return total;
  }
}
