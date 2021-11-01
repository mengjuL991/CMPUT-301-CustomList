import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestListCity {
    private CustomList list;

    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        createList();
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    public void testHasCity(){
        createList();
        City mockCity = new City("Halifax", "NS");
        assertFalse(list.hasCity(mockCity));
        list.addCity(mockCity);
        assertTrue(list.hasCity(mockCity));
    }
    /*
    @Test
    public void deleteCityTest(){
        createList();
        list.addCity(new City("Halifax", "NS"));
        list.addCity(new City("Edmonton", "AB"));
        int listSize = list.getCount();
        list.deleteCity(new City("Edmonton", "AB"));
        assertEquals(1, listSize - 1);
    }

    @Test
    public void testCountCities(){
        createList();
        list.addCity(new City("Halifax", "NS"));
        int listSize = list.getCount();
        assertEquals(1, listSize);
    }

     */
}
