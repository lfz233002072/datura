/*
 * 继承自该类的要求控制器位置
 */
package datura.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lfz
 */
public abstract class AdminServletBase extends HttpServlet {

    protected void RenderView(HttpServletRequest request, HttpServletResponse response, String viewPath)
            throws ServletException, IOException {
        request.setAttribute("ServletTitle", this.getservletTitle());
        VirtualPathProvider provider = new VirtualPathProvider();
        viewPath = provider.getVirtualPath(this.getClass(), request, response, viewPath);
        RequestDispatcher view = request.getRequestDispatcher(viewPath);
        view.forward(request, response);
    }

    protected void RenderView(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RenderView(request, response, null);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public String getservletTitle() {
        return getServletInfo();
    }

}
