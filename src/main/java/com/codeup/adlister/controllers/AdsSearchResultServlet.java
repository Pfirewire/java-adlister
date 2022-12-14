package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "AdsSearchResultServlet", urlPatterns = "/ads/search-result")
public class AdsSearchResultServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if(request.getSession().getAttribute("user") == null){
            response.sendRedirect("/login");
        } else {
            request.setAttribute("searchResults", DaoFactory.getAdsDao().searchAds(request.getParameter("searchBar")));
            request.getRequestDispatcher("/WEB-INF/ads/search-results.jsp").forward(request, response);
        }
    }
}
