package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        String[] colorNames = {
                "Red", "Green", "Blue", "Yellow", "Orange",
                "Purple", "Pink", "Cyan", "Magenta", "Brown",
                "Black", "White", "Gray", "Teal", "Lime"
        };

        int index = (int)(Math.random() * colorNames.length);
        return colorNames[index];
    }

    public String getDefaultColor() {
        return "White";
    }
}
