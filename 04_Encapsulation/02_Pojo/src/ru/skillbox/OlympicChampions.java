public class OlympicChampions {

    private String athletesName;
    private String athletesCountry;
    private String sportsDiscipline;
    private int eventsYear;
    private boolean hasSportsCareer; // продолжил ли карьеру после победы


    public OlympicChampions(String athletesName, String sportsDiscipline, int eventsYear) {
        this.athletesName = athletesName;
        this.sportsDiscipline = sportsDiscipline;
        this.eventsYear = eventsYear;
    }

    public String getAthletesName() {
        return athletesName;
    }

    public String getAthletesCountry() {
        return athletesCountry;
    }

    public String getSportsDiscipline() {
        return sportsDiscipline;
    }

    public int getEventsYear() {
        return eventsYear;
    }

    public boolean isHasSportsCareer() {
        return hasSportsCareer;
    }

    public void setAthletesName(String athletesName) {
        this.athletesName = athletesName;
    }

    public void setAthletesCountry(String athletesCountry) {
        this.athletesCountry = athletesCountry;
    }

    public void setSportsDiscipline(String sportsDiscipline) {
        this.sportsDiscipline = sportsDiscipline;
    }

    public void setEventsYear(int eventsYear) {
        this.eventsYear = eventsYear;
    }

    public void setSportsCareer(boolean sportsCareer) {
        this.hasSportsCareer = sportsCareer;
    }
}
