package cesar.github.praticas;

public abstract class Mídia {
    private Preço price;
    private String name;
    private String cod;

    public void setName(String name) {
        this.name = name;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setPrice(Preço price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCod() {
        return cod;
    }

    public double getPrice() {
        return price.preço();
    }

    @Override
    public String toString() {
        return getName() + ", " + getPrice() + ", " + getCod() + " ]";
    }
}
