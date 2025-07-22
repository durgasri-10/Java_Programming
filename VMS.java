import java.util.*;
class VMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int ignore = sc.nextInt(); 
        int track = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < ignore; i++) {
            set.add(sc.nextInt());
        }
        for (int i = 0; i < track; i++) {
            set1.add(sc.nextInt());
        }
        int a = 0;
        int b = 0; 
        for (int i = 1; i <= total; i++) {
            boolean isIgnored = set.contains(i);   
            boolean isTracked = set1.contains(i);
            if (isIgnored && isTracked)
                a++;
            if (!isIgnored && !isTracked)
                b++;
        }
        System.out.println(a + " " + b);
        
    }
}