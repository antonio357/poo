package cesar.github.praticas;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class CitiesProcessor {
    private Set<City> citySet;

    public void setCitySet(Set<City> citySet) {
        this.citySet = citySet;
    }

    public TreeSet<City> buildSetOfCities(Path filePath) {
        List<String> list;
        City city;
        String[] string;
        TreeSet<City> citiesb = new TreeSet<>();

        try {
            list = Files.readAllLines(filePath, Charset.defaultCharset());

            for (String str: list) {
                string = str.split(", ");
                city = new City();
                city.setName(string[0]);
                city.setState(string[1]);
                city.setCod(Integer.parseInt(string[2]));
                citiesb.add(city);
            }
        }
        catch (Exception e) {
            System.err.println(e);
            System.exit(1);
        }

        return citiesb;
    }

    public void writeSetOFCities(Path pathDestino, Comparator<City> comparator) {
        List<City> tempCitylist = new ArrayList<>(citySet);
        tempCitylist.sort(comparator);
        List<String> list = new ArrayList<>();
        for (City city: tempCitylist) list.add(city.toString());

        try {
            Files.write(pathDestino, list , Charset.defaultCharset(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING,
                    StandardOpenOption.WRITE);
        }
        catch (Exception e) {
            System.err.println(e);
            System.exit(1);
        }
    }
}
