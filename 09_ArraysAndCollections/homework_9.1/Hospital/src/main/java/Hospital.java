import java.util.Arrays;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        double minTemperature = 32;
        double maxTemperature = 40;
        double scale = Math.pow(10, 1);
        float[] temperatureData = new float[patientsCount];
        for (int i = 0; i < patientsCount; i++){
            double calculation = Math.round((Math.random()*(maxTemperature-minTemperature)+minTemperature)*scale)/scale;
            temperatureData[i] = (float) calculation;
        }

        return temperatureData;
    }

    public static String getReport(float[] temperatureData) {

        float averageTemperature = 0.0f;
        float countTemperature = 0.0f;
        int healthyPatients = 0;
        String temperatureDataString = "";
        String h = "";
        double scale = Math.pow(10, 2);
        float scaleFloat = (float) scale;
        float maxNormal = 36.9f;
        float minNormal = 36.2f;

        for (float i: temperatureData){
            countTemperature += i;
            temperatureDataString = temperatureDataString + i+ " ";
            if(i <= maxNormal  && i >= minNormal){
                healthyPatients += 1;
            }
        }

        averageTemperature = Math.round((countTemperature / temperatureData.length)*scaleFloat)/scaleFloat;

        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
        */

        String report =
                "Температуры пациентов: " + temperatureDataString.trim() +
                        "\nСредняя температура: " + averageTemperature +
                        "\nКоличество здоровых: " + healthyPatients;


        return report;
    }
}
