package collections;

/**
 * n = 4
 *
 *  =  s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
 *  = J*31^3 +A*31^2 + V*31^1 + A
 *  = 2204534 +  62465 + 2666 +65
 *  = 2269730&(4-1)
 *
 *  1000101100100100110010
 *                    0011
 *  ------------------------
 *                    0010
 */
public class CalculateHashcode {
    public static void main(String[] args) {
        String str = "JAVA";
        System.out.println("Hashcode is "+str.hashCode());
    }
}
