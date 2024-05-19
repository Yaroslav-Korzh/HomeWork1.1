public class Method {

    public void dublicat(int[] num) {
        boolean x = false;
        int result = 0;
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] == num[i + 1]) {
                x = true;
                result = num[i];
            }
        }
        if (x == true) {
            System.out.println("Result: " + x);
            System.out.println("Число " + result + " повторяется 2 раза");
        } else if (x == false) {
            System.out.println("Result: " + x);
            System.out.println("Дубликатов нет");
        }
    }
}
