package BitwiseOperations;

public class trail {
    public static void main(String[] args) {
       //decimal to binary
      // dToB(35);
    //  btoD(100011);
    boperation(5,6);
    }

    private static void boperation(int i, int j) {
        System.out.println(i & j);
    }

    private static void btoD(int i) {
        int placeValue = 1;
        int answer = 0;
        while(i > 0){
            int lastDigit = i % 10;
            answer = answer+lastDigit*placeValue;
            i = i/10;
            placeValue *= 2;

        }
        System.out.println(answer);
    }

    private static void dToB(int n) {
      int placeValue = 1;
     int answer = 0;
     while(n!= 0){
      
			int remainder = n%2;
			answer=answer+remainder*placeValue;
			n=n/2;
			placeValue*=10;

     }
     
     System.out.println(answer);

    }
}
