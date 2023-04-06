
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Queue queue = new Queue();
        Scanner in = new Scanner(System.in);
        try {
            queue.push(in.nextInt());
            queue.push(in.nextInt());
            queue.push(in.nextInt());
            queue.push(in.nextInt());
            queue.push(in.nextInt());
            for (int i = 0; i < queue.size(); i++) {
                int k = queue.pop();
                System.out.println(k);
                queue.push(k);
            }
        } catch (Exception e) {
        }

    }
}