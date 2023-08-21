import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        Temp t = new Temp("first");
        HashMap m = new HashMap();
        m.put(t, "durga");
        t.setL("second");
        System.out.println(m);
        System.out.println(t);
    }
}
 class Temp {
    String l;
        public Temp(String k) {
            this.l = k;
        }
        public String toString() {
            return this.l;
        }
        void setL(String s) {
            this.l = s;
        }
}
