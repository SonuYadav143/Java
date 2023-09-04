package Client.Client1;

public class text {
    public static void main(String[] args) {
        try{
        int[] array = new int[5];
        array[0] = 55;
        array[1] = 56;
        array[2] = 58;
        array[3] = 75;
        array[4] = 70;
        array[5] = 73;

        for (int i = 0; i <= 4; i++) {
            System.out.println("this is my array" + i);
        }
    }catch (ArrayIndexOutOfBoundsException ignored){
            System.out.println("index out of bounds...");
        }
    }
}
//Client.Client1.......... file