package com.company;

public class FrontController {

    private Dispatching dispatching;

    public FrontController() {
        dispatching = new Dispatching();
    }

    private boolean isAuthenticated(Request request) {
        if (request.getHeader().getUsername().equalsIgnoreCase("admin") && request.getHeader().getPassword().equals("1234")) {
            System.out.println("Authentication successfull");
            return true;
        } else {
            System.out.println("Authentication failed");
            return false;
        }

    }

    private void trackRequest(Request request) {
        System.out.println("Requested View: " + request.getRequest());
    }

    public void dispatchRequest(Request request) {
        trackRequest(request);
        if (isAuthenticated(request)) {
            dispatching.dispatch(request);
        }
    }


}
