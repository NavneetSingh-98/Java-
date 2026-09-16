package OOPS.ClassAndObjects.Pen;

public class TestPen {
    public static void main(String[] args) {
        Pens pens1 = new Pens();
        pens1.brand = "lenskart";
        pens1.color = "blue";
        pens1.type = "ball";

        pens1.write();
        pens1.PrintColor();
    }

}
