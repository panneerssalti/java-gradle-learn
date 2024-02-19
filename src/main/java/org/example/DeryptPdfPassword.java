package org.example;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardDecryptionMaterial;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DeryptPdfPassword {
    public static void main(String[] args) {
        getPDFPaths("D:\\Users\\pshanmugam\\Desktop\\decrypt").forEach(p-> {
            System.out.println("In the file "+p);
            try {
                decrypt(p);
            } catch (IOException e) {
                System.out.println("Issue in Decryption");
            }
        });
    }

    private static void decrypt(String fileName) throws IOException {
        File file = new File(fileName);

        // Load the PDF file
        PDDocument pdd = PDDocument.load(file, "yourpassword");

        // removing all security from PDF file
        pdd.setAllSecurityToBeRemoved(true);

        // Save the PDF file
        pdd.save(file);

        // Close the PDF file
        pdd.close();
        System.out.println("Decryption Done...");
    }

    private static List<String> getPDFPaths(String folderPath) {
        List<String> pdfFilesList = new ArrayList<>();

        // Create a File object representing the folder
        File folder = new File(folderPath);

        // Check if the provided path is a directory
        if (folder.isDirectory()) {
            // Get a list of files in the directory
            File[] files = folder.listFiles();

            // Iterate through the files
            if (files != null) {
                for (File file : files) {
                    // Check if the file is a PDF file
                    if (file.isFile() && file.getName().toLowerCase().endsWith(".pdf")) {
                        // Add the absolute path of PDF files to the list
                        pdfFilesList.add(file.getAbsolutePath());
                    }
                }
            } else {
                System.err.println("Failed to list files in the directory.");
            }
        } else {
            System.err.println("Provided path is not a directory.");
        }

        return pdfFilesList;
    }
}
