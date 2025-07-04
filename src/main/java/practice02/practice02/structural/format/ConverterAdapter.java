package practice02.practice02.structural.format;

public class ConverterAdapter {

    static Doc pdfToDoc(Pdf pdf) {
        System.out.println("Magic convert pdf to doc");
        return new Doc();
    }

    static Pdf docToPdf(Doc doc) {
        System.out.println("Magic convert doc to pdf");
        return new Pdf();
    }
}
