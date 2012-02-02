package controllers;

import play.mvc.Controller;

/**
 *
 */
public class UserInput extends Controller {

    public static void handleInput(long customerId, long campaignCode) {
        render(customerId, campaignCode);
    }

}
