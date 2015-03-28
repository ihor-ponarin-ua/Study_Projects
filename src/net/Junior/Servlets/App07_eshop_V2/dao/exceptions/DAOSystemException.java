package net.Junior.Servlets.App07_eshop_V2.dao.exceptions;

/**
 * Created by Mr_Faton on 27.03.2015.
 */
public class DAOSystemException extends DAOException {
    public DAOSystemException(String message) {
        super(message);
    }

    public DAOSystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public DAOSystemException(Throwable cause) {
        super(cause);
    }
}
