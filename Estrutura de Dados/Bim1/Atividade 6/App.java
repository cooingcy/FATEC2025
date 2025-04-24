public class App {
    public App() {
    }
 
    public static void main(String[] args) throws Exception {
       Deque dequeList = new Deque();
       dequeList.EnqueueL("A");
       dequeList.EnqueueL("B");
       dequeList.EnqueueL("C");
       dequeList.EnqueueR("D");
       dequeList.imprime();
       System.out.println("\n");
       dequeList.EnqueueL(dequeList.DequeueL());
       dequeList.imprime();
    }
 }
 