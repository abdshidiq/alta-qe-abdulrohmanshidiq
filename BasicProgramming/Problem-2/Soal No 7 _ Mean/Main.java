public class Main {

    private static float Mean(float[] numbers) {
        float data=0;
        int i=0;

        for(i=0;i<numbers.length;i++){
            data=data+numbers[i];
        }
        return data/numbers.length;
    }

    public static void main(String[] args) {
        float[] value = {1, 2, 3, 4};
        System.out.println(Mean(value));

    }
}
