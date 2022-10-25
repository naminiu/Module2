package CleanCodeRefactoring.THRefactoringDoiTenBienVaTachHang;

class CalculatorTest {
    public static void main(String[] args) {
        double result = Calculator.calculate(1,2, Calculator.ADDITION);
        System.out.println(result);
        double result1 = Calculator.calculate(3,2, Calculator.SUBTRACTION);
        System.out.println(result);
        double result2 = Calculator.calculate(5,2, Calculator.MULTIPLICATION);
        System.out.println(result);
        double result3 = Calculator.calculate(4,2, Calculator.DIVISION);
        System.out.println(  result);
    }
}


//    @Test
//    @DisplayName("Testing subtraction")
//    void testCalculateSub() {
//        int a = 2;
//        int b = 1;
//        char o = '-';
//        int expected = 1;
//
//        int result = Calculator.calculate(a, b, o);
//        assertEquals(expected, result);
//    }
//
//    @Test
//    @DisplayName("Testing multiplication")
//    void testCalculateMul() {
//        int a = 2;
//        int b = 2;
//        char o = '*';
//        int expected = 4;
//
//        int result = Calculator.calculate(a, b, o);
//        assertEquals(expected, result);
//    }
//
//    @Test
//    @DisplayName("Testing division")
//    void testCalculateDiv() {
//        int a = 6;
//        int b = 3;
//        char o = '/';
//        int expected = 2;
//
//        int result = Calculator.calculate(a, b, o);
//        assertEquals(expected, result);
//    }
//
//    @Test
//    @DisplayName("Testing division by zero")
//    void testCalculateDivByZero() {
//        int a = 2;
//        int b = 0;
//        char o = '/';
//
//        assertThrows(RuntimeException.class,
//                ()-> {Calculator.calculate(a, b, o);});
//    }
//
//    @Test
//    @DisplayName("Testing wrong operator")
//    void testCalculateWrongOperator() {
//        int a = 2;
//        int b = 0;
//        char o = '=';
//
//        assertThrows(RuntimeException.class,
//                ()-> {Calculator.calculate(a, b, o);});
//    }
