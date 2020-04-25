package Stack_CheckBracket;

public class ExpressionTest {
    public static void main(String[] args) {
        Expression expression1 = new Expression(10);
        Expression expression2 = new Expression(10);
        Expression expression3 = new Expression(10);
        String situation1 = "s *(s – a )* (s – b)*(s – c)";
        String situation2 = "s * (s – a * s – b) * (s – c))";
        String situation3 = "s * () * s – b) * (s – c)";
        char[] array1 = situation1.toCharArray();
        char[] array2 = situation2.toCharArray();
        char[] array3 = situation3.toCharArray();
        expression1.pushArray(array1);
        expression2.pushArray(array2);
        expression3.pushArray(array3);

        System.out.println(expression1.isExpression());
        System.out.println(expression2.isExpression());
        System.out.println(expression3.isExpression());

    }
}
