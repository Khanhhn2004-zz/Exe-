import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 54, 64, 25, 644, 3, 3};
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 13, 432, 53, 54, 1, 2, 343, 2));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 3, 432, 4, 42, 5, 2, 54));
////
//        System.out.println(tinhTrungBinhCong(arr));
//        System.out.println(tinhTrungBinhCong(list1));
//        System.out.println(tinhTrungBinhCong(list2));
//
//        System.out.println(timPhanTuXuatHienNhieuNhat(arr));
//        System.out.println(timPhanTuXuatHienNhieuNhat(list1));
//        System.out.println(timPhanTuXuatHienNhieuNhat(list2));
//
//        sapXepTangDanBangChen(arr);
//        sapXepTangDanBangChen(list1);
//        sapXepTangDanBangChen(list2);
//
//        sapXepTangDanBangNoiBot(arr);
//        sapXepTangDanBangNoiBot(list1);
//        sapXepTangDanBangNoiBot(list2);
//
//        daoNguocMang(arr);
//        daoNguocArrayList(list1);
//        daoNguocLinkedList(list2);
//
//        System.out.println(timKiem(arr, 644));
//        System.out.println(timKiem(list1, 3));
//        System.out.println(timKiem(list2, 55));

        xoaPhanTu(list1, 432);
        xoaPhanTu(list2, 234);

        chenPhanTu(list1, 3, 1000);
        chenPhanTu(list2, 4, 3214);

    }

    //Viết chương trình Java để tính trung bình cộng của các phần tử trong một danh sách số nguyên,trong mảng gồm mảng tĩnh , arraylist/linkedlist
    public static double tinhTrungBinhCong(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return (double) sum / arr.length;
    }

    public static double tinhTrungBinhCong(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return (double) sum / list.size();
    }

    public static double tinhTrungBinhCong(LinkedList<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return (double) sum / list.size();
    }

    //Viết chương trình Java để tìm phần tử xuất hiện nhiều nhất trong một danh sách số nguyên,trong mảng gồm mảng tĩnh , arraylist/linkedlist
    public static int timPhanTuXuatHienNhieuNhat(int[] arr) {
        int maxCount = 0;
        int maxElement = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }
        }
        return maxElement;
    }

    public static int timPhanTuXuatHienNhieuNhat(ArrayList<Integer> list) {
        int maxCount = 0;
        int maxElement = 0;
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == list.get(i)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxElement = list.get(i);
            }
        }
        return maxElement;
    }

    public static int timPhanTuXuatHienNhieuNhat(LinkedList<Integer> list) {
        int maxCount = 0;
        int maxElement = 0;
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == list.get(i)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxElement = list.get(i);
            }
        }
        return maxElement;
    }

    //Viết chương trình Java để sắp xếp một mảng theo thứ tự tăng dần bằng thuật toán chèn , sắp xếp nổi bọt, sắp xếp lựa chọn,trong mảng gồm mảng tĩnh , arraylist/linkedlist
    public static void sapXepTangDanBangChen(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void sapXepTangDanBangChen(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 1; i < n; ++i) {
            int key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }
    }

    public static void sapXepTangDanBangChen(LinkedList<Integer> list) {
        int n = list.size();
        for (int i = 1; i < n; ++i) {
            int key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }
    }

    public static void sapXepTangDanBangNoiBot(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void sapXepTangDanBangNoiBot(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void sapXepTangDanBangNoiBot(LinkedList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

    }

    //Viết chương trình Java để đảo ngược các phần tử trong một danh sách số nguyên,trong mảng gồm mảng tĩnh , arraylist/linkedlist
    public static void daoNguocMang(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void daoNguocArrayList(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void daoNguocLinkedList(LinkedList<Integer> list) {
        Collections.reverse(list);
    }

    //Viết chương trình Java để tìm kiếm một phần tử trong một danh sách số nguyên,trong mảng gồm mảng tĩnh , arraylist/linkedlist
    public static int timKiem(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int timKiem(LinkedList<Integer> list, int x) {
        return list.indexOf(x);
    }

    public static int timKiem(ArrayList<Integer> list, int x) {
        return list.indexOf(x);
    }

//Viết chương trình Java để xóa một phần tử khỏi một danh sách số nguyên,trong mảng gồm mảng tĩnh , arraylist/linkedlist

    //    public static int[] xoaPhanTu(int[] arr, int x) {
//
//    }
    public static void xoaPhanTu(ArrayList<Integer> list, int x) {
        for (int i = 0; i <= list.size() - 1; i++) {
            if (list.get(i) == x) {
                list.remove(list.get(i));
            }
        }
        System.out.println(list);
    }

    public static void xoaPhanTu(LinkedList<Integer> list, int x) {
        for (int i = 0; i <= list.size() - 1; i++) {
            if (list.get(i) == x) {
                list.remove(list.get(i));
            }
        }
        System.out.println(list);
    }

    //Viết chương trình Java để chèn một phần tử vào một vị trí cụ thể trong một danh sách số nguyên,trong mảng gồm mảng tĩnh , arraylist/linkedlist
    public static void chenPhanTu(int[] arr,int location,int x){
        for (int i = 0; i < arr.length - 1 ; i++) {
            if (location == i){

            }
        }

    }

    public static void chenPhanTu(ArrayList<Integer> list, int location, int x) {
        list.add(location, x);
        System.out.println(list);
    }

    public static void chenPhanTu(LinkedList<Integer> list, int location, int x) {
        list.add(location, x);
        System.out.println(list);
    }
}

