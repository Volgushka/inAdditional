public class InfStorage {

    private final StorageType storageType;
    private final int storageSpace;  // объем диска Гб
    private final double storageWeight;


    public InfStorage(StorageType storageType, int storageSpace, double storageWeight) {
        this.storageType = storageType;
        this.storageSpace = storageSpace;
        this.storageWeight = storageWeight;
    }

    public double getStorageWeight() {
        return storageWeight;
    }

    public String toStringIS(){
        return "Информация о накопителе| " + "Тип накопителя:"+ " " + storageType + "; " + "Объем диска (ГБ):"+ " "+ storageSpace + ";" + "Вес накопителя:"+ " "+ storageWeight;
    }

}
