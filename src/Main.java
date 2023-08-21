import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        ArrayList<City> arrayList = new ArrayList<>();
        TreeSet<City> treeSet = new TreeSet<>();
        arrayList.add(new City(1845, "Nurjigit"));
        arrayList.add(new City(1705, "Rysbek"));
        arrayList.add(new City(8103, "Aidai"));
        arrayList.add(new City(2020, "Ruslan"));
        arrayList.add(new City(2006, "Aizirek"));
        arrayList.add(new City(1996, "Azi"));

        for (int i = 0; i < arrayList.size(); i++) {
            if ((arrayList.get(i).getCode() % 2) != 0) {
                treeSet.add(arrayList.get(i));
            }
        }
        for (City c : treeSet) {
            System.out.println(c.getCode() + " | " + c.getName());
        }

    }

}
