package com.ignite.exception;

public class EmployeeNotFound extends  Exception {
    public EmployeeNotFound() {
        super();
    }

    public EmployeeNotFound(String message) {
        super(message);
    }

    public EmployeeNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeNotFound(Throwable cause) {
        super(cause);
    }
}
