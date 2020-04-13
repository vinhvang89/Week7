package AutomatedTest_TriangleClassifier;

public class Triangle {
    public static String classify( int side1 , int side2,int side3){
        if ( side1 + side2 > side3 && side2 + side3 > side1 &&
                side1 + side3 > side2) {
            if (side1 == side2 && side2 == side3)
                return "It is equilateral triangle";
            else if (side1 == side2 || side2 == side3 || side1 == side3)
                return "It is isosceles triangle";
            else return "It is normal triangle ";
        }
        else return "It is not a triangle";
    }

}
