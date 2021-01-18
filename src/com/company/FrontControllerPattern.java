package com.company;

import java.util.Optional;

public class FrontControllerPattern {

    public static void main(String[] args) {

        FrontController frontController = new FrontController();
        Header request1Header = new Header("admin", "12");
        Header request2Header = new Header("admin", "1234");
        Header request3Header = new Header("admin", "1234");
        Request request = new Request("student", request1Header);
        Request request2 = new Request("student", request2Header);
        Request request3 = new Request("teacher", request3Header);
        frontController.dispatchRequest(request);
        frontController.dispatchRequest(request2);
        frontController.dispatchRequest(request3);


    }

}



