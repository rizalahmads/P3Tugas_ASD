package P3P4_Tugas;

import java.util.LinkedList;

public class MainT3 { // Tugas 3 SinglyLinkedList
    public static void main(String[] args) {
        // buat list kosong
        LinkedList<String> sLinkedList = new LinkedList<>();
        sLinkedList.addFirst("Data 1");
        sLinkedList.addFirst("Data 2");
        sLinkedList.addFirst("Data 3");
        sLinkedList.addFirst("Data 4");
        sLinkedList.addFirst("Data 5");

        // cetak list
        
        System.out.println("Output: " + sLinkedList + "Ukuran: " + sLinkedList.size());
        
        // tambah data awal dan akhir
        sLinkedList.addFirst("Data 0");
        sLinkedList.addLast("Data 6");
        
        // cetak list
        System.out.println("Output: " + sLinkedList + "Ukuran: " + sLinkedList.size());

        // set data awal dan akhir
        sLinkedList.set(0,"Data 0");
        sLinkedList.set(6, "Data 6");
        
        // cetak list
        System.out.println("Output: " + sLinkedList + "Ukuran: " + sLinkedList.size());

        // hapus data awal dan akhir
        sLinkedList.removeFirst();
        sLinkedList.removeLast();

        // cetak list
        System.out.println("Output: " + sLinkedList + "Ukuran: " + sLinkedList.size());

        // hapus data ke 3
        sLinkedList.remove(3);

        // cetak list
        System.out.println("Output: " + sLinkedList + "Ukuran: " + sLinkedList.size());

    }

}
