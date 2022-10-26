package abstractClassAndInterface.TestEquals;

import sun.misc.SignalHandler;

public class SinhVien {
    private String name;
    public SinhVien(String name) {
        this.name = name;
    }
    public SinhVien(){}

    public boolean equals(Object obj){
        SinhVien another = (SinhVien) obj;
        if (this.name == ((SinhVien) obj).name){
            return true;
        } else {
            return false;
        }
    }

}
