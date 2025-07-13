import java.util.HashMap;

public class Main {

    public static void main(String[] arg) {
        int[] nums = new int[] { 1, 5, 8, -2, 3, -4 };
        float result;
        try {
            result = avg(nums);
            System.out.println(result);
        } catch(EmptyArray e) {
            System.out.println("Your array is empty");
        } catch(NegativeEntries e) {
            HashMap<Integer, Integer> negEntries = e.getNegEntries();

            for (Integer i : negEntries.keySet()) {
                System.out.println("The " + (i + 1) + "th number " + negEntries.get(i) + " in your array is invalid");
            }
        }
    }


    public static float avg(int[] nums) throws EmptyArray, NegativeEntries {
        int sum = 0;

        if (nums == null || nums.length == 0) {
            throw new EmptyArray();
        }

        HashMap<Integer, Integer> negEntries = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                negEntries.put(i, nums[i]);
            }
            sum += nums[i];
        }
        if (!negEntries.isEmpty()) {
            throw new NegativeEntries(negEntries);
        }
        return 1.0f * sum / nums.length;
    }
}

class EmptyArray extends Exception {}

// New exception for the case when some numbers are negative
class NegativeEntries extends Exception {
    private HashMap<Integer, Integer> negEntries;

    public NegativeEntries(HashMap<Integer, Integer> map) {
        negEntries = map;
    }

    public HashMap<Integer, Integer> getNegEntries() {
        return negEntries;
    }
}



