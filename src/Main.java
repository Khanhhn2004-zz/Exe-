import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 54, 64, 25, 644, 3, 3};
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 13, 432, 53, 54, 1, 2, 343, 2));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 3, 432, 4, 42, 5, 2, 54));

        JavaString.ExeString();
//        System.out.println(tinhTrungBinhCong(arr));
//        System.out.println(tinhTrungBinhCong(list1));
//        System.out.println(tinhTrungBinhCong(list2));
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
//
//        xoaPhanTu(arr, 7);
//        xoaPhanTu(list1, 4);
//        xoaPhanTu(list2, 4);
//
//        chenPhanTu(arr, 1, 19999);
//        chenPhanTu(list1, 4, 3232);
//        chenPhanTu(list2, 3, 32321);
//
//        saoChepMang(arr);
//        saoChepMang(list1);
//        saoChepMang(list2);
//
//        System.out.println(timPhanTuXuatHienNhieuNhat(list1));
//        System.out.println(timPhanTuXuatHienNhieuNhat(list2));
//        System.out.println(timPhanTuXuatHienNhieuNhat(arr));
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
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
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

    public static void xoaPhanTu(int[] arr, int location) {
        int[] newArr = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != location) {
                newArr[j++] = arr[i];
            }
        }
        arr = newArr;
        System.out.println(Arrays.toString(arr));
    }

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
    public static void chenPhanTu(int[] arr, int location, int x) {
        int[] newArr = new int[arr.length + 1];

        if (location >= 0) System.arraycopy(arr, 0, newArr, 0, location);

        newArr[location] = x;

        if (arr.length - location >= 0) System.arraycopy(arr, location, newArr, location + 1, arr.length - location);

        System.out.println(Arrays.toString(newArr));
    }

    public static void chenPhanTu(ArrayList<Integer> list, int location, int x) {
        list.add(location, x);
        System.out.println(list);
    }

    public static void chenPhanTu(LinkedList<Integer> list, int location, int x) {
        list.add(location, x);
        System.out.println(list);
    }

    //Viết chương trình Java để sao chép một danh sách số nguyên sang một danh sách số nguyên khác,trong mảng gồm mảng tĩnh , arraylist/linkedlist
    public static void saoChepMang(int[] arr) {
        int[] newArr = new int[arr.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        System.out.println(Arrays.toString(newArr));
    }

    public static void saoChepMang(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>(list.size());
        for (int i = 0; i <= list.size() - 1; i++) {
            newList.add(list.get(i));
        }
        System.out.println(newList);
    }

    public static void saoChepMang(LinkedList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>(list.size());
        for (int i = 0; i <= list.size() - 1; i++) {
            newList.add(list.get(i));
        }
        System.out.println(newList);
    }

    //Tim kiếm phần tử xuất hiện nhiều nhất
    public static int timPhanTuXuatHienNhieuNhat(ArrayList<Integer> list) {
        Collections.sort(list);
        int soLanXuatHienMax = 0;
        int phanTuXuatHienNhieuNhat = list.get(0);
        int soLanXuatHienHienTai = 1;
        int phanTuHienTai = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(phanTuHienTai)) {
                soLanXuatHienHienTai++;
            } else {
                if (soLanXuatHienHienTai > soLanXuatHienMax) {
                    soLanXuatHienMax = soLanXuatHienHienTai;
                    phanTuXuatHienNhieuNhat = phanTuHienTai;
                }
                phanTuHienTai = list.get(i);
                soLanXuatHienHienTai = 1;
            }
        }

        if (soLanXuatHienHienTai > soLanXuatHienMax) {
            phanTuXuatHienNhieuNhat = phanTuHienTai;
        }
        System.out.println(list);
        return phanTuXuatHienNhieuNhat;
    }

    public static int timPhanTuXuatHienNhieuNhat(LinkedList<Integer> list) {
        Collections.sort(list);
        int soLanXuatHienMax = 0;
        int phanTuXuatHienNhieuNhat = list.get(0);
        int soLanXuatHienHienTai = 1;
        int phanTuHienTai = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(phanTuHienTai)) {
                soLanXuatHienHienTai++;
            } else {
                if (soLanXuatHienHienTai > soLanXuatHienMax) {
                    soLanXuatHienMax = soLanXuatHienHienTai;
                    phanTuXuatHienNhieuNhat = phanTuHienTai;
                }
                phanTuHienTai = list.get(i);
                soLanXuatHienHienTai = 1;
            }
        }

        if (soLanXuatHienHienTai > soLanXuatHienMax) {
            phanTuXuatHienNhieuNhat = phanTuHienTai;
        }
        System.out.println(list);
        return phanTuXuatHienNhieuNhat;
    }


    public static int timPhanTuXuatHienNhieuNhat(int[] arr) {
        sapXepTangDanBangNoiBot(arr);
        int soLanXuatHienMax = 0;
        int phanTuXuatHienNhieuNhat = arr[0];
        int soLanXuatHienHienTai = 1;
        int phanTuHienTai = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == (phanTuHienTai)) {
                soLanXuatHienHienTai++;
            } else {
                if (soLanXuatHienHienTai > soLanXuatHienMax) {
                    soLanXuatHienMax = soLanXuatHienHienTai;
                    phanTuXuatHienNhieuNhat = phanTuHienTai;
                }
                phanTuHienTai = arr[i];
                soLanXuatHienHienTai = 1;
            }
        }

        if (soLanXuatHienHienTai > soLanXuatHienMax) {
            phanTuXuatHienNhieuNhat = phanTuHienTai;
        }
        System.out.println(Arrays.toString(arr));
        return phanTuXuatHienNhieuNhat;
    }
}


