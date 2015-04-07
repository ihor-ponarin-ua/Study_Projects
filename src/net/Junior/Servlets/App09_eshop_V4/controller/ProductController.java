//package net.Junior.Servlets.App09_eshop_V4.controller;
//
//import net.Junior.Servlets.App09_eshop_V4.dao.ProductDAO;
//import net.Junior.Servlets.App09_eshop_V4.dao.exceptions.DAOSystemException;
//import net.Junior.Servlets.App09_eshop_V4.dao.exceptions.NoSuchEntityException;
//import net.Junior.Servlets.App09_eshop_V4.dao.implementation.ProductDAOImpl;
//import net.Junior.Servlets.App09_eshop_V4.entity.CookieFinder;
//import net.Junior.Servlets.App09_eshop_V4.entity.Product;
//import net.Junior.Servlets.App09_eshop_V4.session.SessionOnClientRepository;
//import net.Junior.Servlets.App09_eshop_V4.session.Session_User;
//import net.Junior.Servlets.App09_eshop_V4.statements.Statements;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.Map;
//
///**
// * Created by Mr_Faton on 05.04.2015.
// */
//public class ProductController extends HttpServlet {
//    private ProductDAO productDAO = new ProductDAOImpl();
//    private static final SessionOnClientRepository SESSION_ON_CLIENT_REPOSITORY = SessionOnClientRepository.getInstance();
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String idStr = request.getParameter(Statements.PARAM_ID);
//        if (idStr != null) {
//            try {
//                int id = Integer.valueOf(idStr);
//                Product product = productDAO.selectById(id);
//
//                CookieFinder cookieFinder = new CookieFinder();
//                Cookie jsessionid_cookie = cookieFinder.findCookieByName(Statements.COOKIE_JSESSIONID, request);
//                if (jsessionid_cookie != null) {
//                    String sessionId = jsessionid_cookie.getValue();
//                    Session_User session_user = SESSION_ON_CLIENT_REPOSITORY.getSessionById(sessionId, false);
//                    if (session_user != null) {
//                        session_user.setExpiration();
//                        Map<Product, Integer> basket =
//                                (Map<Product, Integer>) session_user.get(Statements.ATTRIBUTE_BASKET);
//                        jsessionid_cookie.setMaxAge(Statements.COOKIE_LIFETIME);//время жизни в секундах
//                        response.addCookie(jsessionid_cookie);
//                        request.setAttribute(Statements.ATTRIBUTE_BASKET, basket);
//                    }
//                }
//
//                request.setAttribute(Statements.ATTRIBUTE_PRODUCT_TO_VIEW, product);
//                request.getRequestDispatcher(Statements.PAGE_PRODUCT).forward(request, response);
//                return;
//
//            } catch (NumberFormatException | NoSuchEntityException | DAOSystemException ex) {/*NOP*/}
//        }
//        response.sendRedirect(Statements.PAGE_ERROR);
//    }
//}
