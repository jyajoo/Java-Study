public class ArrayList {

    int[] dataList;
    int lastIndex;

    public ArrayList() {
        dataList = new int[2];
        lastIndex = 0;
    }

    public int size() {
        return lastIndex;
    }

    public void add(int data) {
        sizeUp();
        dataList[lastIndex++] = data;
    }

    private void sizeUp() {
        if (lastIndex == dataList.length) {
            int[] new_DataList = new int[dataList.length * 2];
            for (int i = 0; i < dataList.length; i++) {
                new_DataList[i] = dataList[i];
            }
            dataList = new_DataList;
        }
    }

    public int get(int i) {
        return dataList[i];
    }

    public void remove(int i) {
        for (int x = i; x < lastIndex; x++) {
            dataList[x - 1] = dataList[x];
            if (x == lastIndex - 1) {
                dataList[x] = 0;
            }
        }
        lastIndex--;
    }

    public int getArrayLength() {
        return dataList.length;
    }

    public void showAllValues() {
        System.out.println("== 전체 데이터 출력 ==");
        for (int i = 0; i < lastIndex; i++) {
            System.out.printf("%d : %d\n", i, dataList[i]);
        }
    }
}
