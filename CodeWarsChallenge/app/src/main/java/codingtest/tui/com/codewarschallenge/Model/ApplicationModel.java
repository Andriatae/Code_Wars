package codingtest.tui.com.codewarschallenge.Model;

import javax.inject.Inject;

import codingtest.tui.com.codewarschallenge.API.CodeWarsAPI;

public class ApplicationModel implements ApplicationModelContract {

    @Override
    public void requestDataFromServer(CodeWarsAPI codeWarsAPI, String userId) {
        new CodeWarsUserCallback(this).findUser(codeWarsAPI, userId);
    }

    @Override
    public void setUserResponse(User user) {
        User newUser = user;
    }
}