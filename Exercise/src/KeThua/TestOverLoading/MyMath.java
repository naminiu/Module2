package KeThua.TestOverLoading;

public class MyMath {
    public int timMin(int a, int b){
        if(a<b){
            return a;
        } else {
            return b;
        }
    }
    public double timMin(double a, double b){
        if(a<b){
            return a;
        } else {
            return b;
        }
    }
}
