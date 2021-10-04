public class CPU {

    private final double cpu_frequency; // частота ГГЦ
    private final int numberOfCores;   // ядра
    private final String cpuVender;
    private final double cpuWeight;      //грамм


    public CPU(double cpu_frequency, int numberOfCores, String cpuVender, double cpuWeight) {
        this.cpu_frequency = cpu_frequency;
        this.numberOfCores = numberOfCores;
        this.cpuVender = cpuVender;
        this.cpuWeight = cpuWeight;
    }

    public double getCpuWeight() {
        return cpuWeight;
    }

    public String toStringCPU(){
        return "Информация о процессоре| " + "Частота:"+ " " + cpu_frequency + "; " + "Количество ядер:"+ " "+ numberOfCores + "; " + "Производитель:"+ " "+ cpuVender + "; " + "Вес процессора:"+ " "+ cpuWeight;
    }

}
