import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Arrays;
import java.util.List;

public class Tests {



    @Test
    public void addLast() {                             //Тест по добавлению элемента на последнюю позицию
        ListForHW<Integer> list1 = new ListForHW<>();   //Создание
        list1.addLast(0);                            //Добавление
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(4);
        list1.addLast(5);
        list1.addLast(6);
        list1.addLast(7);
        list1.addLast(8);
        list1.addLast(9);
        System.out.println(Arrays.toString(list1.toArray()));   //Вывод
        Assertions.assertEquals(0, list1.get(0));       //Тест
        Assertions.assertEquals(3, list1.get(3));
        Assertions.assertEquals(9, list1.get(9));
    }


    @Test
    public void addFirst() {                            //Тест по добавлению элемента на первую позицию
        ListForHW<Integer> list1 = new ListForHW<>();
        list1.addFirst(0);
        list1.addFirst(1);
        list1.addFirst(2);
        list1.addFirst(3);
        list1.addFirst(4);
        list1.addFirst(5);
        list1.addFirst(6);
        list1.addFirst(7);
        list1.addFirst(8);
        list1.addFirst(9);
        System.out.println(Arrays.toString(list1.toArray()));
        Assertions.assertEquals(9, list1.get(0));
    }
    @Test
    public void addAll() {                                      //Тест по добавлению всех элементов
        ListForHW<Integer> list1 = new ListForHW<>();
        List listExample = List.of(0,1,2,3,4,5,6,7,8,9);
        list1.addAll(listExample);                              //Добавляем сразу все элементы
        System.out.println(Arrays.toString(list1.toArray()));
        Assertions.assertEquals(0, list1.get(0));
        Assertions.assertEquals(1, list1.get(1));
        Assertions.assertEquals(5, list1.get(5));
        Assertions.assertEquals(9, list1.get(9));
    }

    @Test
    public void iterator() {
        ListForHW<Integer> list1 = new ListForHW<>();
        List listExample = List.of(0,1,2,3,4,5,6,7,8,9);
        list1.addAll(listExample);
        System.out.println(Arrays.toString(list1.toArray()));
        for (Integer data: list1) {
            Assertions.assertEquals(data<10, true);     //Проверяем что элементы попадают в заданный диапазон
            Assertions.assertEquals(data>-1, true);

        }
    }

    @Test
    public void removeAlL() {
        ListForHW<Integer> list1 = new ListForHW<>();
        List listExample = List.of(0,1,2,3,4,5,6,7,8,9);
        list1.addAll(listExample);
        System.out.println(Arrays.toString(list1.toArray()));
        list1.removeAll(listExample);
        System.out.println(Arrays.toString(list1.toArray()));   // Убеждаемся в пустом массиве
    }



}

