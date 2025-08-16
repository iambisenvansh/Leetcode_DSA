public class Max69 {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        char[] d = s.toCharArray();

        for(int i = 0; i < d.length; i++){
            if(d[i] == '6'){
                d[i] = '9';
                break;
            }
        }
        String result = new String(d);
        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        Max69 solution = new Max69();

        // Example 1
        int num1 = 9669;
        System.out.println("Input: " + num1);
        System.out.println("Output: " + solution.maximum69Number(num1));

        // Example 2
        int num2 = 9996;
        System.out.println("Input: " + num2);
        System.out.println("Output: " + solution.maximum69Number(num2));

        // Example 3
        int num3 = 9999;
        System.out.println("Input: " + num3);
        System.out.println("Output: " + solution.maximum69Number(num3));
    }
}