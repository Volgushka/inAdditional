public class Country {

    private String countryName;
    private int population;
    private int square;
    private String capital;
    private boolean hasSeaWay;

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getPopulation() {
        return population;
    }

    public int getSquare() {
        return square;
    }

    public String getCapital() {
        return capital;
    }

    public boolean isHasSeaWay() {
        return hasSeaWay;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setSeaWay(boolean seaWay) {
        this.hasSeaWay = seaWay;
    }
}
