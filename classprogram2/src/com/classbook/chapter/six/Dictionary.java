package com.classbook.chapter.six;

/**
 * @program: classprogram
 * @Description: 继承父类Book
 * @author: 郑敏
 */
public class Dictionary extends Book {
    private int definitions;

    public Dictionary() {
    }

    public Dictionary(Book book,int definitions){
        super(book.getBookId(),book.getBookName(),book.getPages());
        this.definitions = definitions;
    }

    public Dictionary(String bookId, String bookName, int pages, int definitions) {
        super(bookId, bookName, pages);
        this.definitions = definitions;
    }

    public int getDefinitions() {
        return definitions;
    }

    public void setDefinitions(int definitions) {
        this.definitions = definitions;
    }

    @Override
    public String getBookId(){
        return DefaultValue.DICTIONARY_SKU + super.getBookId();
    }
}
