class eBook{
    private String title;
    private int totalPages;
    private int currentPage;

    eBook(String title, int totalPages ){
        this.title = title;
        this.totalPages = totalPages;
        this.currentPage = 1;
    }

    public void nextPage(){
        if (currentPage < totalPages) currentPage++;
        else System.out.println("End of the book");
    }

    public void goToPage(int page){
        if (page >= 1 && page <= totalPages) this.currentPage = page;
        else System.out.println("Error: Page out of range");
    }

    public void displayProgress(){
        System.out.println("Book: " + title + " | Page: " + currentPage + " from " + totalPages + ".");
    }
}

public class eLibrary {
    public static void main(String[] args) {
        eBook book1 = new eBook("Dracula" , 500);

        book1.displayProgress();
        book1.nextPage();
        book1.displayProgress();
        book1.goToPage(12);
        book1.displayProgress();
    }
}