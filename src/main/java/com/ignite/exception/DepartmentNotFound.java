package com.ignite.exception;

public class DepartmentNotFound extends Exception{
    public DepartmentNotFound() {
        super();
    }

    public DepartmentNotFound(String message) {
        super(message);
    }

    public DepartmentNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public DepartmentNotFound(Throwable cause) {
        super(cause);
    }
}
