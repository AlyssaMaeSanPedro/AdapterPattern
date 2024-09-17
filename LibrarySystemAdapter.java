public class LibrarySystemAdapter implements ManageSystem {
    private LibrarySystem librarySystem;

    public LibrarySystemAdapter(LibrarySystem librarySystem){
        this.librarySystem = librarySystem;
    }

    @Override
    public String integrateSystem() {
        return librarySystem. manageBooks();
    }
}