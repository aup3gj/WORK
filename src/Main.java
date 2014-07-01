import java.util.*;

public class Main {
    private List<Integer> fib = new ArrayList<>();
    {
        fib.add(0);
        fib.add(1);
    }
    
    Integer get(int n) {
        if(n >= fib.size()) for(int i = fib.size(); i <= n; i++) {
            fib.add(fib.get(i - 1) + fib.get(i - 2));
        }
        return fib.get(n);
    }
    
    public static void main(String[] args) {
        Main fibonacci = new Main();
        for(int i = 0; i < 20; i++) {
            System.out.print(fibonacci.get(i) + " ");
        }
    }}