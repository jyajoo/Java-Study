import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    @Test
    void ArrayList_생성() {
        ArrayList arrayList = new ArrayList();
    }

    @Test
    void size() {
        ArrayList arrayList = new ArrayList();
        assertEquals(0, arrayList.size());
    }


    @Test
    void add() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
    }

    @Test
    void 배열_크기() {
        ArrayList arrayList = new ArrayList();
        assertEquals(2, arrayList.getArrayLength());
    }

    @Test
    void 배열_크기_2배_증가() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(200);
        assertEquals(2, arrayList.getArrayLength());

        arrayList.add(300);
        assertEquals(4, arrayList.getArrayLength());
    }

    @Test
    void get() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
        int rs = arrayList.get(0);
        assertEquals(100, rs);
    }

    @Test
    void add_size_증가() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        int rs = arrayList.size();
        assertEquals(3, rs);
    }

    @Test
    void get_equals_200() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(200);
        int rs = arrayList.get(1);
        assertEquals(200, rs);
    }

    @Test
    void remove() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.remove(1);
    }

    @Test
    void remove_size_감소() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        arrayList.remove(1);
        int rs = arrayList.size();
        assertEquals(2, rs);
    }

    @Test
    void remove_한칸씩_앞으로() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        assertEquals(200, arrayList.get(1));

        arrayList.remove(1);
        assertEquals(300, arrayList.get(1));
    }

    @Test
    void remove_마지막_인덱스() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        assertEquals(300, arrayList.get(2));

        arrayList.remove(2);
        assertEquals(0, arrayList.get(2));
    }

    @Test
    void showAllValues() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        ByteArrayOutputStream output = TestUtil.setOutToByteArray();
        arrayList.showAllValues();

        String rs = output.toString();

        TestUtil.clearSetOutToByteArray(output);
        assertTrue(rs.contains("== 전체 데이터 출력 =="));
        assertTrue(rs.contains("0 : 100"));
        assertTrue(rs.contains("1 : 200"));
        assertTrue(rs.contains("2 : 300"));
    }
}