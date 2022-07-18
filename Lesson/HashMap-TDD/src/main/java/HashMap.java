import java.util.ArrayList;
import java.util.List;

public class HashMap<K, V> {

    Object[] keyList;
    Object[] valueList;
    int lastIndex;

    public HashMap() {
        keyList = new Object[2];
        valueList = new Object[2];
        lastIndex = 0;
    }

    public void put(K key, V value) {
        sizeUpIfNeed();
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

    public void sizeUpIfNeed() {
        if (lastIndex == keyList.length) {
            Object[] new_KeyList = new Object[keyList.length * 2];
            Object[] new_ValueList = new Object[keyList.length * 2];

            for (int i = 0; i < keyList.length; i++) {
                new_KeyList[i] = keyList[i];
                new_ValueList[i] = valueList[i];
            }
            keyList = new_KeyList;
            valueList = new_ValueList;
        }
    }
}

