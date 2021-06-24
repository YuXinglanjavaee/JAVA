package com.example.Upload;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

@WebServlet(value="/upload")
@MultipartConfig
public class UploadImage extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Part part = req.getPart("File");
        part.write("C:\\Users\\哈哈哈\\Desktop\\a.jpg");
    }
}