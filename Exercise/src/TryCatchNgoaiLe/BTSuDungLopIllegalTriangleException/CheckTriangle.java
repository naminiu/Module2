package TryCatchNgoaiLe.BTSuDungLopIllegalTriangleException;

public class CheckTriangle {
    private int a;
    private int b;
    private int c;

    public CheckTriangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public CheckTriangle() {
    }

    public String checktriangle(int a, int b, int c) throws Exception {
        if (a + b < c || a + c < b || b + c < a || a < 0 || b < 0 || c < 0) {
            throw new Exception();
        } else {
            return "đây là tam giác";
        }
    }
}
