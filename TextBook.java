class TextBook extends Books {
    public void studyChapter() {
        System.out.println("Studying a textbook chapter...");
    }

    public static void main(String[] args) {
        Books b = new Novel();
        b.openBook();
        Novel n = (Novel)b;
        n.readStory();

        Books bt = new TextBook();
        bt.openBook();
        TextBook t = (TextBook)bt;
        t.studyChapter();

        System.out.println(n instanceof Books);
    }
}