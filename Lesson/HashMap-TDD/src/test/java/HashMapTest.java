import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HashMapTest {

    @Test
    void 생성() {
        HashMap hashMap = new HashMap();
    }

    @Test
    void 생성_2() {
        HashMap<String, Integer> hashMap = new HashMap<>();
    }

    @Test
    void put() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("철수", 22);
    }

    @Test
    void get() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("철수", 22);
        Integer rs = hashMap.get("철수");

        assertEquals(22, rs);
    }

    @Test
    void size() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("철수", 22);
        hashMap.put("영희", 23);

        int rs = hashMap.size();
        assertEquals(2, rs);
    }

    @Test
    void remove() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("철수", 22);
        hashMap.put("영희", 23);
        int rs1 = hashMap.size();

        hashMap.remove("영희");
        int rs2 = hashMap.size();

        assertEquals(2, rs1);
        assertEquals(1, rs2);
    }

    @Test
    void put_2() {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("철수", 22);
        Integer rs1 = hashMap.get("철수");

        hashMap.put("철수", 40);
        Integer rs2 = hashMap.get("철수");

        assertEquals(22, rs1);
        assertEquals(40, rs2);
    }

    @Test
    void keySet() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("철수", 22);
        hashMap.put("영희", 23);

        List<String> keySet = hashMap.keySet();

        assertEquals("철수", keySet.get(0));
        assertEquals("영희", keySet.get(1));
    }

    @Test
    void test() {
        HashMap<String, Object> monkeyList = new HashMap<>();

        Monkey monkey1 = new Monkey("코코");
        Monkey monkey2 = new Monkey("키키");
        monkeyList.put("코코", monkey1);
        monkeyList.put("키키", monkey2);

        assertEquals(monkeyList.get("코코"), monkey1);
        assertEquals(monkeyList.get("키키"), monkey2);
    }

    @Test
    void test2() {
        HashMap<Object, Object> hashMap = new HashMap<>();

        hashMap.put("키키", new Monkey("키키"));
        hashMap.put("존", new Person("존"));

        Monkey monkey = (Monkey) hashMap.get("키키");
        Person person = (Person) hashMap.get("존");

        monkey.run();
        person.run();
    }
}

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    void run() {
        System.out.println("사람");
    }
}

class Monkey{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    void run() {
        System.out.println("원숭이");
    }
}