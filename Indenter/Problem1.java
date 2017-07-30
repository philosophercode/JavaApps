public class Problem1 {
public static void main(String[] args) {
int k = 2;
int l = 2;
even(k, l);
}
public static void even(int k, int l) {
for (int counter=0; k<30;  counter=k) {
System.out.println(k);
k = k+l;
l = k-l;
}
System.out.println();
}
}