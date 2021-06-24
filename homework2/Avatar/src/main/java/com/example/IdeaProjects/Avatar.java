package com.example.IdeaProjects;

import com.talanlabs.avatargenerator.SquareAvatar;
import com.talanlabs.avatargenerator.TriangleAvatar;
import javafx.beans.property.adapter.JavaBeanBooleanPropertyBuilder;

import javax.imageio.ImageIO;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "create Avatar", value = "/createAvatar")
public class Avatar extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int b =Integer.parseInt(request.getParameter("haha"));
        com.talanlabs.avatargenerator.Avatar avatar = TriangleAvatar.newAvatarBuilder().build();
        BufferedImage bufferedImage =avatar.create(b);
        ImageIO.write(bufferedImage,"jpg",response.getOutputStream());
    }
}

