package group;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Double> max = new ArrayList<Double>();
        ArrayList<String> typee = new ArrayList<String>();
        ArrayList<Double> sum = new ArrayList<Double>();
        for (int i = 0; i < n; i++) {
            max.add(-1.0);
            typee.add("");
            sum.add(0.0);
        }
        for (int i = 1; i <= m; i++) { //m次操作
            int op = scanner.nextInt();
            int group = scanner.nextInt() - 1;
            if (op == 1) {
                System.out.println(max.get(group));
            } else if (op == 2) {
                System.out.println(typee.get(group));
            } else if (op == 3) {
                System.out.println(sum.get(group));
            } else { //op=4
                String s = scanner.next();
                double ax;
                double bx;
                double by;
                double cx;
                double cy;
                double cz;
                if (s.equals("1")) {
                    ax = scanner.nextDouble();
                    bx = scanner.nextDouble();
                    by = scanner.nextDouble();
                    cx = scanner.nextDouble();
                    cy = scanner.nextDouble();
                    cz = scanner.nextDouble();
                } else if (s.equals("1.1")) {
                    ax = scanner.nextDouble();
                    by = scanner.nextDouble();
                    cz = scanner.nextDouble();
                    bx = cx = cy = 0;
                } else { //s=='1.1.1'
                    ax = by = cz = scanner.nextDouble();
                    bx = cx = cy = 0;
                }
                Cube temp = new Cube(s, ax, bx, by, cx, cy, cz);
                if (max.get(group) < temp.getVolume()) {
                    max.set(group, temp.getVolume());
                    typee.set(group, s);
                }
                sum.set(group, sum.get(group) + temp.getVolume());
            }
        }

    }
}
