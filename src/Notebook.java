import java.util.Map;

public class Notebook {
    private String brand;
    private String model;
    private int ramSize;
    private int storageCapacity;
    private String operatingSystem;
    private String color;

    public Notebook(String brand, String model, int ramSize, int storageCapacity, String operatingSystem,
                    String color) {
        this.brand = brand;
        this.model = model;
        this.ramSize = ramSize;
        this.storageCapacity = storageCapacity;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public boolean matches(Map<String, Object> filters) {
        for (Map.Entry<String, Object> entry : filters.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            switch (key) {
                case "brand":
                    if (!brand.equals(value)) {
                        return false;
                    }
                    break;
                case "ramSize":
                    if (ramSize < (int) value) {
                        return false;
                    }
                    break;
                case "storageCapacity":
                    if (storageCapacity < (int) value) {
                        return false;
                    }
                    break;
                case "operatingSystem":
                    if (!operatingSystem.equals(value)) {
                        return false;
                    }
                    break;
                case "color":
                    if (!color.equals(value)) {
                        return false;
                    }
                    break;
            }
        }

        return true;
    }
}


