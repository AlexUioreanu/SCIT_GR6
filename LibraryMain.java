package AlexUioTemaOOP;

import org.apache.commons.lang3.ArrayUtils;

public class LibraryMain {
    public static void main(String[] args) {

        Library library1 = new Library();
        library1.setName("Diverta");
        library1.setAdress("Strada Eroilor");
        library1.setBooks(createBooks());

        listBooks(library1.getBooks());
    }

    private static void listBooks(Book[] book) {
        System.out.println("This are the Books: ");
        for (Book books : book) {
            listAlbums(books.getAlbums());
            listNovels(books.getNovels());
        }
    }

    private static void listNovels(Novel[] novel) {
        for (Novel novels : novel) {
            System.out.println("Novel: " + novels.getName());
        }
    }

    private static void listAlbums(Album[] album) {
        for (Album albums : album) {
            System.out.println("Album: " + albums.getName());
        }
    }

    private static Book[] createBooks() {
        Book book2 = new Book();
        book2.setNovels(createNovels());
        book2.setAlbums(createAlbum());

        return new Book[]{book2};
    }

    private static Album[] createAlbum() {
        Album album1 = new Album();
        album1.setName("Celebrity");
        album1.setPages(10);
        album1.setPaperquality("Good");

        Album album2 = new Album();
        album2.setName("Politicians");
        album2.setPages(30);
        album2.setPaperquality("Moderate");

        Album album3 = new Album();
        album3.setName("BasketBall");
        album3.setPages(10);
        album3.setPaperquality("Poor");

        Album album4 = new Album();
        album4.setName("Football");
        album4.setPages(20);
        album4.setPaperquality("Good");

        Album album5 = new Album();
        album5.setName("Family");
        album5.setPages(100);
        album5.setPaperquality("Excelent");

        Album[] albumList = new Album[]{album1, album2, album3, album4};

        // albumList = addAlbum(album5, albumList);
        // albumList = removeAlbum(albumList);

        return albumList;
    }

    private static Album[] addAlbum(Album album, Album[] albumList) {
        albumList = ArrayUtils.add(albumList, album5);
        return albumList;
    }

    private static Album[] removeAlbum(Album[] albumList) {
        albumList = ArrayUtils.remove(albumList, albumList.length - 1);
        return albumList;
    }

    public static Novel[] createNovels() {
        Novel novel1 = new Novel();
        novel1.setName("Zombie invasion");
        novel1.setPages(100);
        novel1.setType("SF");

        Novel novel2 = new Novel();
        novel2.setName("Secrets of Eqipt");
        novel2.setPages(500);
        novel2.setType("Mystery");

        Novel novel3 = new Novel();
        novel3.setName("Tom&Jerry");
        novel3.setPages(10);
        novel3.setType("Kids");

        Novel novel4 = new Novel();
        novel4.setName("Tom Rider");
        novel4.setPages(20);
        novel4.setType("Adventure");

        Novel novel5 = new Novel();
        novel5.setName("Detective");
        novel5.setPages(30);
        novel5.setType("Mystery");

        Novel[] novelList = new Novel[]{novel1, novel2, novel3, novel4};

        // novelList = addNovels(novel5, novelList);
        // novelList = removeNovel(novelList);
        return novelList;
    }

    private static Novel[] addNovels(Novel novel, Novel[] novelList) {
        novelList = ArrayUtils.add(novelList, novel5);
        return novelList;
    }

    private static Novel[] removeNovel(Novel[] novelList) {
        novelList = ArrayUtils.remove(novelList, novelList.length - 1);
        return novelList;
    }
}
