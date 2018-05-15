package codingtest.tui.com.codewarschallenge.Model;

import codingtest.tui.com.codewarschallenge.API.CodeWarsAPI;
public interface ApplicationModelContract {

    void requestDataFromServer(CodeWarsAPI codeWarsAPI, String userId);

    void setUserResponse(User user);
}
