import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger b = BigInteger.valueOf(balls);
        BigInteger s = BigInteger.valueOf(share);
        BigInteger n = new BigInteger("1"); //balls의 팩토리얼 값
        BigInteger m = new BigInteger("1"); //share의 팩토리얼 값
        BigInteger nm = new BigInteger("1"); //balls - share의 팩토리얼 값 
        BigInteger a = new BigInteger("1"); //로직 제어용
        BigInteger n_m = b.subtract(s);
        System.out.println(n_m);
        while(a.compareTo(b)==-1) {
            n = n.multiply(b);
            b = b.subtract(BigInteger.valueOf(1));
        } 
        while(a.compareTo(s)==-1) { // share의 팩토리얼 값
            m = m.multiply(s);
            s = s.subtract(BigInteger.valueOf(1));
        } 
        while(a.compareTo(n_m)==-1) { // balls - share의 팩토리얼
            nm = nm.multiply(n_m);
            n_m = n_m.subtract(BigInteger.valueOf(1));
        }
        return n.divide(nm.multiply(m));
    }
}