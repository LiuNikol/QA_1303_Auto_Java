package calculate;

public class calculate {

    public static int sum(int n, int m) {
        return n+m;
    }
    public static int sub(int n,int m) {
        return n-m;
    }
    public static int multiplication(int n, int m) {
        return n*m;
    }
    public static double division(int n, int m) { //  double = numberrs after point= ex.=3/2=1.5
        if(m != 0) { return ((double) n / (double) m); // if we have m=0 return result = 0
        } else {
            return 0;
        }
    }
    public static double percentage(int n, int m) {
        if(m != 0) { return ((double) n*100/(double) m);// if we have m=0 return result = 0
        } else {
            return 0;
        }
    }
}
