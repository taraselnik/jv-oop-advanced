package core.basesyntax;

public class Main {
    public static final int AMOUNT_OF_FIGURERS = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < AMOUNT_OF_FIGURERS; i++) {
            if (i % 2 == 0) {
                figureSupplier.getRandomFigure().draw();
            } else {
                figureSupplier.getDefaultFigure().draw();
            }
        }
    }
}
