package practice02.practice02.structural.format;

/*Адаптер для работы с PDF и DOC (конвертация между форматами)
Описание
У нас есть два типа файлов:
PDF-файл, который должен обрабатываться системой, но она работает только с DOC.
Необходимо создать адаптер, который позволит работать с файлами обоих форматов, конвертируя их при необходимости.
Задача — создать интерфейс, который будет принимать файлы с расширением PDF или DOC, а также адаптер, который будет конвертировать один формат в другой.
*/
public class Main {
    public static void main(String[] args) {
        Doc doc = new Doc();
        doc.process();
        Pdf pdf = new Pdf();
        pdf.process();

        Doc pdfToDoc = ConverterAdapter.pdfToDoc(pdf);
        pdfToDoc.process();

        Pdf docToPdf = ConverterAdapter.docToPdf(doc);
        docToPdf.process();
    }
}
