import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    List<CPU> cpus = new ArrayList<>();
    List<Motherboard> motherboards = new ArrayList<>();
    List<GPU> gpus = new ArrayList<>();
    List<RAM> ramModules = new ArrayList<>();
    List<Storage> storageDevices = new ArrayList<>();
    List<PSU> psus = new ArrayList<>();
    List<Case> cases = new ArrayList<>();

    // Додайте компоненти
    cpus.add(new CPU("AMD Ryzen 5", 250));
    cpus.add(new CPU("Intel i5", 300));

    motherboards.add(new Motherboard("Asus ROG", 150));
    motherboards.add(new Motherboard("Gigabyte", 120));

    gpus.add(new GPU("NVIDIA GTX 1660", 400));
    gpus.add(new GPU("AMD RX 580", 350));

    ramModules.add(new RAM("Corsair Vengeance 16GB", 80));
    ramModules.add(new RAM("G.Skill Ripjaws 16GB", 75));

    storageDevices.add(new Storage("Samsung SSD 500GB", 60));
    storageDevices.add(new Storage("Seagate HDD 1TB", 50));

    psus.add(new PSU("Corsair 650W", 70));
    psus.add(new PSU("EVGA 600W", 65));

    cases.add(new Case("NZXT H510", 100));
    cases.add(new Case("Cooler Master MasterBox Q300L", 75));

    Scanner scanner = new Scanner(System.in);

    // Вибір процесора
    System.out.println("Виберіть процесор:");
    for (int i = 0; i < cpus.size(); i++) {
      System.out.println(i + 1 + ". " + cpus.get(i).getModel() + " - Ціна: " + cpus.get(i).getPrice());
    }
    int cpuChoice = scanner.nextInt() - 1;

    // Вибір материнської плати
    System.out.println("Виберіть материнську плату:");
    for (int i = 0; i < motherboards.size(); i++) {
      System.out.println(i + 1 + ". " + motherboards.get(i).getModel() + " - Ціна: " + motherboards.get(i).getPrice());
    }
    int motherboardChoice = scanner.nextInt() - 1;

    // Вибір відеокарти (опціонально)
    List<GPU> selectedGpus = new ArrayList<>();
    System.out.println("Виберіть відеокарту (або 0, щоб пропустити):");
    for (int i = 0; i < gpus.size(); i++) {
      System.out.println(i + 1 + ". " + gpus.get(i).getModel() + " - Ціна: " + gpus.get(i).getPrice());
    }
    int gpuChoice = scanner.nextInt() - 1;

    if (gpuChoice >= 0 && gpuChoice < gpus.size()) {
      selectedGpus.add(gpus.get(gpuChoice));
    }

    // Вибір оперативної пам'яті
    System.out.println("Виберіть оперативну пам'ять:");
    for (int i = 0; i < ramModules.size(); i++) {
      System.out.println(i + 1 + ". " + ramModules.get(i).getModel() + " - Ціна: " + ramModules.get(i).getPrice());
    }
    int ramChoice = scanner.nextInt() - 1;

    // Вибір накопичувача
    System.out.println("Виберіть накопичувач:");
    for (int i = 0; i < storageDevices.size(); i++) {
      System.out.println(i + 1 + ". " + storageDevices.get(i).getModel() + " - Ціна: " + storageDevices.get(i).getPrice());
    }
    int storageChoice = scanner.nextInt() - 1;

    // Вибір блоку живлення
    System.out.println("Виберіть блок живлення:");
    for (int i = 0; i < psus.size(); i++) {
      System.out.println(i + 1 + ". " + psus.get(i).getModel() + " - Ціна: " + psus.get(i).getPrice());
    }
    int psuChoice = scanner.nextInt() - 1;

    // Вибір корпусу
    System.out.println("Виберіть корпус:");
    for (int i = 0; i < cases.size(); i++) {
      System.out.println(i + 1 + ". " + cases.get(i).getModel() + " - Ціна: " + cases.get(i).getPrice());
    }
    int caseChoice = scanner.nextInt() - 1;

    // Створення збірки ПК
    PCAssembly assembly = new PCAssembly(
        cpus.get(cpuChoice),
        motherboards.get(motherboardChoice),
        selectedGpus,
        ramModules.get(ramChoice),
        storageDevices.get(storageChoice),
        psus.get(psuChoice),
        cases.get(caseChoice)
    );
    assembly.displayAssembly();

    scanner.close();
  }
}
