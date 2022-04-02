package code.lesson_classes;

public class ColourRedSortApples implements SortApples {

    public boolean sortApples(Apple apple) {
        if (apple.getColour().equals("red")) {
            return true;
        }

        return false;
    }


}
