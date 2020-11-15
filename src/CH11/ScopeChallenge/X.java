package CH11.ScopeChallenge;

public class X {
    private int x;

    public X(int x) {
        this.x = x;
    }

    public void x(){
        for(int x = 1; x<=this.x;x++ ){
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(4);
            System.out.println(5);
            System.out.println(6);
            System.out.println(7);
            System.out.println(8);
            System.out.println(9);
            System.out.println(10);
            System.out.println(11);
            System.out.println(12);
        }
    }


}
