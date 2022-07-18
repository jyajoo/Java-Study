import java.util.ArrayList;
import java.util.List;

public class HashMap<K, V> {

    Object[] keyList;
    Object[] valueList;
    int lastIndex;

    public HashMap() {
        keyList = new Object[100];
        valueList = new Object[100];
        lastIndex = 0;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        if (index != -1) {
            keyList[index] = key;
            valueList[index] = value;
            return;
        }
        keyList[lastIndex] = key;
        valueList[lastIndex++] = value;
    }

    public V get(K key) {
        int index = getIndex(key);
        if (index == -1) {
            return null;
        }
        return (V) valueList[index];
    }

    private int getIndex(K key) {
        for (int i = 0; i < lastIndex; i++) {
            if (keyList[i] == key) {
                return i;
            }
        }
        return -1;
    }


    public int size() {
        return lastIndex;
    }

    public void remove(K key) {
        int index = getIndex(key);
        for (int i = index; i < lastIndex; i++) {
            keyList[i] = keyList[i + 1];
            valueList[i] = valueList[i + 1];
        }
        lastIndex--;
    }

    public List<K> keySet() {
        List<K> keySet = new ArrayList<>();

        for (int i = 0; i < lastIndex; i++) {
            keySet.add((K)keyList[i]);
        }
        return keySet;
    }
}

