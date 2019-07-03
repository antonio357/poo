package cesar.github.praticas;

public class City implements Comparable<City> {
    private int cod;
    private String state;
    private String name;

    @Override
    public int compareTo(City city) {
        return this.getName().compareTo(city.getName());
    }

    @Override
    public int hashCode() {
        return this.getCod();
    }

    @Override
    public boolean equals(Object obj) {
        if (this.hashCode() -  obj.hashCode() == 0) return true;
        return false;
    }

    @Override
    public String toString() {
        return getName() + ", " + getState() + ", " + getCod();
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }
}
