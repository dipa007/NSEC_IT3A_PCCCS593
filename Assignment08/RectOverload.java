public class RectOverload {
    static void rect(int n, char ch){
        for(int i=0;i<n;i++){ for(int j=0;j<n;j++) System.out.print(ch); System.out.println(); }
    }
    static void rect(int l, int b, char ch){
        for(int i=0;i<b;i++){ for(int j=0;j<l;j++) System.out.print(ch); System.out.println(); }
    }
    public static void main(String[] args){
        rect(4,'#');
        System.out.println();
        rect(6,3,'@');
    }
}
