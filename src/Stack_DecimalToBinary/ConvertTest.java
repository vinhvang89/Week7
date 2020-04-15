package Stack_DecimalToBinary;

import java.util.Arrays;

public class ConvertTest {
    public static void main(String[] args) {
        ConvertFromDecimal abc = new ConvertFromDecimal(8);
        abc.toBinary(8);
        System.out.println(Arrays.toString(abc.getArray()));
        ConvertFromDecimal xyz = new ConvertFromDecimal(8);
        xyz.toHexadecimal(932);
        System.out.println(Arrays.toString(xyz.getArray()));
        abc.getResult();
        System.out.println();
        xyz.getResult();
    }

}
