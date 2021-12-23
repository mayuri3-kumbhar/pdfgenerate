package com.company;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.html.table.Table;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.stream.Stream;



public class Main {

    public static  void main(String[] args) throws FileNotFoundException, DocumentException {

            Document doc = new Document();
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("/home/perennial/Documents/helloWorld.pdf"));
            doc.open();
            doc.add(new Paragraph("Hello World"));
            doc.close();
        }





        /*String pdfFile ="/home/perennial/Documents/helloWorld.pdf";
        Main main=new Main();
        if (args.length < 1)
        {
            System.err.println("Usage: java "+ main.getClass().getName()+
                    " PDF_Filename");
            System.exit(1);
        }
        pdfFile = args[0].trim();
        main.createPDF(pdfFile);
    }


    private void createPDF (String pdfFile){
        Document doc = new Document();
        PdfWriter docWriter = null;

        DecimalFormat df = new DecimalFormat("0.00");

        try {

            //special font sizes
            Font bfBold12 = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, new BaseColor(0, 0, 0));
            Font bf12 = new Font(Font.FontFamily.TIMES_ROMAN, 12);

            //file path
            String path = "docs/" + pdfFile;
            docWriter = PdfWriter.getInstance(doc , new FileOutputStream(path));


            doc.open();

            //create a paragraph
            Paragraph paragraph = new Paragraph("Employee salary slip");


            float[] columnWidths = {1.5f, 2f, 5f, 2f};
            PdfPTable table = new PdfPTable(columnWidths);
            table.setWidthPercentage(90f);


            //insert an empty row
            insertCell(table, "", Element.ALIGN_LEFT, 4, bfBold12);
            insertCell(table, "Total ...", Element.ALIGN_LEFT, 4, bfBold12);
            double Total, total = 0;

            //just some random data to fill
            for(int x=1; x<5; x++){

                insertCell(table, "10010" + x, Element.ALIGN_RIGHT, 1, bf12);
                insertCell(table, "ABC00" + x, Element.ALIGN_LEFT, 1, bf12);
                insertCell(table, "This is Customer Number ABC00" + x, Element.ALIGN_LEFT, 1, bf12);

               Total = Double.valueOf(df.format(Math.random() * 1000));
                total = total + Total;
                insertCell(table, df.format(Total), Element.ALIGN_RIGHT, 1, bf12);

            }
            //merge the cells to create a footer for that section
            insertCell(table, "New York Total...", Element.ALIGN_RIGHT, 3, bfBold12);
            insertCell(table, df.format(total), Element.ALIGN_RIGHT, 1, bfBold12);

            //repeat the same as above to display another location
            insertCell(table, "", Element.ALIGN_LEFT, 4, bfBold12);
            insertCell(table, "California Orders ...", Element.ALIGN_LEFT, 4, bfBold12);
            Total = 0;

            for(int x=1; x<7; x++){

                insertCell(table, "20020" + x, Element.ALIGN_RIGHT, 1, bf12);
                insertCell(table, "XYZ00" + x, Element.ALIGN_LEFT, 1, bf12);
                insertCell(table, "This is Customer Number XYZ00" + x, Element.ALIGN_LEFT, 1, bf12);

                Total = Double.valueOf(df.format(Math.random() * 1000));
                total = total + Total;
                insertCell(table, df.format(Total), Element.ALIGN_RIGHT, 1, bf12);

            }
            insertCell(table, "Total...", Element.ALIGN_RIGHT, 3, bfBold12);
            insertCell(table, df.format(total), Element.ALIGN_RIGHT, 1, bfBold12);

            //add the PDF table to the paragraph
            paragraph.add(table);
            // add the paragraph to the document
            doc.add(paragraph);

        }
        catch (DocumentException dex)
        {
            dex.printStackTrace();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            if (doc != null){
                //close the document
                doc.close();
            }
            if (docWriter != null){
                //close the writer
                docWriter.close();
            }
        }
    }

    private void insertCell(PdfPTable table, String text, int align, int colspan, Font font){

        //create a new cell with the specified Text and Font
        PdfPCell cell = new PdfPCell(new Phrase(text.trim(), font));
        //set the cell alignment
        cell.setHorizontalAlignment(align);
        //set the cell column span in case you want to merge two or more cells
        cell.setColspan(colspan);
        //in case there is no text and you wan to create an empty row
        if(text.trim().equalsIgnoreCase("")){
            cell.setMinimumHeight(10f);
        }
        //add the call to the table
        table.addCell(cell);

    }
*/
}


