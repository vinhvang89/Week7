package Stack_ChechBracket;

public class ExpressionTest {
    public static void main(String[] args) {
        Expression expression1 = new Expression(10);
        Expression expression2 = new Expression(10);
        Expression expression3 = new Expression(10);
        String situation1 = "s * (s – a) * s – b) * (s – c)";
        String situation2 = "s * (s – a * s – b) * (s – c))";
        String situation3 = "s * () * s – b) * (s – c)";
        char[] array1 = situation1.toCharArray();
        char[] array2 = situation2.toCharArray();
        char[] array3 = situation3.toCharArray();
        for (int i = 0; i < 18 ; i++) {
            expression1.push(array1[i]);
            expression2.push(array2[i]);
            expression3.push(array3[i]);
        }
        System.out.println(expression1.isExpression());
        System.out.println(expression2.isExpression());
        System.out.println(expression3.isExpression());
    }
}
