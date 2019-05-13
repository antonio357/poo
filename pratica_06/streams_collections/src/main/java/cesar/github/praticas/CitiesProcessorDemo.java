package cesar.github.praticas;

import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Set;

public class CitiesProcessorDemo {
    public static void main( String[] args ) {
        CitiesProcessor citiesProcessor = new CitiesProcessor();

        Set<City> set = citiesProcessor.buildSetOfCities(Paths.get("txts", "cities_duplicatas.txt"));
        citiesProcessor.setCitySet(set);

        citiesProcessor.writeSetOFCities(Paths.get("txts", "citiesByName.txt"), Comparator.naturalOrder());

        ComparatorByZipCode comparatorByZipCode = new ComparatorByZipCode();
        citiesProcessor.writeSetOFCities(Paths.get("txts", "citiesByZip.txt"), comparatorByZipCode);

        ComparatorByState comparatorByState = new ComparatorByState();
        citiesProcessor.writeSetOFCities(Paths.get("txts", "citiesByState.txt"), comparatorByState);
    }
}
