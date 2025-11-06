package modul_6.praktikum_4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<LibraryItem> libraryItems = new ArrayList<>();
        initializeLibrary(libraryItems);

        while (true) {
            displayMenu();
            int choice = -1;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                scanner.next(); // Bersihkan input yang salah
                continue;
            }
            scanner.nextLine(); // Konsumsi newline

            switch (choice) {
                case 1:
                    displayAllItems(libraryItems);
                    break;
                case 2:
                    borrowItem(scanner, libraryItems);
                    break;
                case 3:
                    returnItem(scanner, libraryItems);
                    break;
                case 4:
                    callSpecialMethod(scanner, libraryItems);
                    break;
                case 5:
                    addNewItem(scanner, libraryItems);
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan. Sampai jumpa!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.println(); // Beri spasi untuk keterbacaan
        }
    }

    private static void displayMenu() {
        System.out.println("===== SISTEM MANAJEMEN PERPUSTAKAAN =====");
        System.out.println("1. Tampilkan semua item");
        System.out.println("2. Pinjam item");
        System.out.println("3. Kembalikan item");
        System.out.println("4. Panggil method khusus (sample/trailer/browse)");
        System.out.println("5. Tambah item baru");
        System.out.println("6. Keluar");
        System.out.print("Masukkan pilihan Anda (1-6): ");
    }

    private static void initializeLibrary(ArrayList<LibraryItem> items) {
        items.add(new Book("B001", "Harry Potter and the Philosopher's Stone", 1997, "J.K. Rowling", "978-0747532699", 223));
        items.add(new Book("B002", "The Lord of the Rings", 1954, "J.R.R. Tolkien", "978-0618640157", 1178));
        items.add(new Magazine("M001", "National Geographic", 2023, "National Geographic Society", 10, "Sains & Alam"));
        items.add(new DVD("D001", "Inception", 2010, "Christopher Nolan", 148, "Sci-Fi"));
        items.add(new DVD("D002", "The Shawshank Redemption", 1994, "Frank Darabont", 142, "Drama"));
    }

    private static void displayAllItems(ArrayList<LibraryItem> items) {
        System.out.println("\n===== DAFTAR SEMUA ITEM DI PERPUSTAKAAN =====");
        if (items.isEmpty()) {
            System.out.println("Perpustakaan kosong.");
            return;
        }
        for (LibraryItem item : items) {
            item.displayInfo();
            System.out.println(); // Spasi antar item
        }
    }

    private static LibraryItem findItemById(String id, ArrayList<LibraryItem> items) {
        for (LibraryItem item : items) {
            if (item.getItemId().equalsIgnoreCase(id)) {
                return item;
            }
        }
        return null;
    }

    private static void borrowItem(Scanner scanner, ArrayList<LibraryItem> items) {
        System.out.print("Masukkan ID item yang ingin dipinjam: ");
        String id = scanner.nextLine();
        LibraryItem item = findItemById(id, items);

        if (item != null) {
            item.borrowItem();
        } else {
            System.out.println("Item dengan ID " + id + " tidak ditemukan.");
        }
    }

    private static void returnItem(Scanner scanner, ArrayList<LibraryItem> items) {
        System.out.print("Masukkan ID item yang ingin dikembalikan: ");
        String id = scanner.nextLine();
        LibraryItem item = findItemById(id, items);

        if (item != null) {
            item.returnItem();
        } else {
            System.out.println("Item dengan ID " + id + " tidak ditemukan.");
        }
    }

    private static void callSpecialMethod(Scanner scanner, ArrayList<LibraryItem> items) {
        System.out.print("Masukkan ID item untuk method khusus: ");
        String id = scanner.nextLine();
        LibraryItem item = findItemById(id, items);

        if (item != null) {
            if (item instanceof Book) {
                ((Book) item).readSample();
            } else if (item instanceof Magazine) {
                ((Magazine) item).browseArticles();
            } else if (item instanceof DVD) {
                ((DVD) item).playTrailer();
            } else {
                System.out.println("Item ini tidak memiliki method khusus.");
            }
        } else {
            System.out.println("Item dengan ID " + id + " tidak ditemukan.");
        }
    }

    private static void addNewItem(Scanner scanner, ArrayList<LibraryItem> items) {
        System.out.println("\nPilih tipe item yang ingin ditambahkan:");
        System.out.println("1. Buku");
        System.out.println("2. Majalah");
        System.out.println("3. DVD");
        System.out.print("Pilihan (1-3): ");
        int typeChoice = -1;

        try {
            typeChoice = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid.");
            scanner.next(); // clear
            return;
        }
        scanner.nextLine(); // consume newline

        System.out.print("Masukkan ID (misal B003, M002, D003): ");
        String id = scanner.nextLine();
        if (findItemById(id, items) != null) {
            System.out.println("Error: Item dengan ID " + id + " sudah ada.");
            return;
        }

        System.out.print("Masukkan Judul: ");
        String title = scanner.nextLine();
        System.out.print("Masukkan Tahun Terbit: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // consume newline

        try {
            switch (typeChoice) {
                case 1: // Buku
                    System.out.print("Masukkan Penulis: ");
                    String author = scanner.nextLine();
                    System.out.print("Masukkan ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Masukkan Jumlah Halaman: ");
                    int pages = scanner.nextInt();
                    scanner.nextLine();
                    items.add(new Book(id, title, year, author, isbn, pages));
                    System.out.println("Buku baru berhasil ditambahkan.");
                    break;
                case 2: // Majalah
                    System.out.print("Masukkan Penerbit: ");
                    String publisher = scanner.nextLine();
                    System.out.print("Masukkan Nomor Edisi: ");
                    int issue = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Kategori: ");
                    String category = scanner.nextLine();
                    items.add(new Magazine(id, title, year, publisher, issue, category));
                    System.out.println("Majalah baru berhasil ditambahkan.");
                    break;
                case 3: // DVD
                    System.out.print("Masukkan Sutradara: ");
                    String director = scanner.nextLine();
                    System.out.print("Masukkan Durasi (menit): ");
                    int duration = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Genre: ");
                    String genre = scanner.nextLine();
                    items.add(new DVD(id, title, year, director, duration, genre));
                    System.out.println("DVD baru berhasil ditambahkan.");
                    break;
                default:
                    System.out.println("Pilihan tipe tidak valid.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Input tidak valid. Pastikan angka dimasukkan dengan benar.");
            scanner.nextLine(); // Clear buffer
        }
    }
}