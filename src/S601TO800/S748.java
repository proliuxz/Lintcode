package S601TO800;


import java.util.HashSet;
import java.util.Set;

public class S748 {
    private Set<Book> books;
    private EBookReaderFactory readerFactory;
    public S748() {
        books = new HashSet<>();
        readerFactory = new EBookReaderFactory();
    }

    public String readBook(Book book) throws Exception {
        uploadBook(book);
        if (!books.contains(book))
            throw new Exception("Book Unknown");
        EBookReader reader = readerFactory.createReader(book);
        if (reader == null)
            throw new Exception("Format Unknown");
        return reader.displayReaderType() + ", book content is: " + reader.readBook();
    }

    public void downloadBook(Book b) {
        books.add(b);
    }

    public void uploadBook(Book b) {
        books.add(b);
    }

    public void deleteBook(Book b) {
        books.remove(b);
    }
}

enum Format {
    EPUB("epub"), PDF("pdf"), MOBI("mobi");

    private String content;

    Format(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

class Book {
    private Format format;

    public Book(Format format) {
        this.format = format;
    }

    public Format getFormat() {
        return format;
    }
}

abstract class EBookReader {

    protected Book book;

    public EBookReader(Book b){
        this.book = b;
    }

    public abstract String readBook();
    public abstract String displayReaderType();
}

class EBookReaderFactory {

    public EBookReader createReader(Book b) {
        switch (b.getFormat())
        {
            case EPUB:
                return new EpubReader(b);
            case PDF:
                return new PdfReader(b);
            case MOBI:
                return new MobiReader(b);
        }
        return null;
    }
}

class EpubReader extends EBookReader{

    public EpubReader(Book b) {
        super(b);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String readBook() {
        return book.getFormat().getContent();
    }

    @Override
    public String displayReaderType() {
        // TODO Auto-generated method stub
        return "Using EPUB reader";
    }
}

class MobiReader extends EBookReader {

    public MobiReader(Book b) {
        super(b);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String readBook() {
        return book.getFormat().getContent();
    }

    @Override
    public String displayReaderType() {
        // TODO Auto-generated method stub
        return "Using MOBI reader";
    }

}
class PdfReader extends EBookReader{

    public PdfReader(Book b) {
        super(b);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String readBook() {
        return book.getFormat().getContent();
    }

    @Override
    public String displayReaderType() {
        // TODO Auto-generated method stub
        return "Using PDF reader";
    }
}
