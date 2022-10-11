import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ListForHW<String> list2 = new ListForHW<>();            //В мейне  проверим строки
        list2.addLast("a");
        list2.addLast("b");
        list2.addLast("c");
        list2.addLast("d");
        list2.addLast("e");
        System.out.println(Arrays.toString(list2.toArray()));

    }
}

