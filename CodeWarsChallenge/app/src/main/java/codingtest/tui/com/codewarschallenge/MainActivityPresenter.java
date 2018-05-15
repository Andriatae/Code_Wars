package codingtest.tui.com.codewarschallenge;

import android.view.View;
import android.widget.EditText;

import codingtest.tui.com.codewarschallenge.API.CodeWarsAPI;
import codingtest.tui.com.codewarschallenge.API.CodeWarsAPIImplementation;
import codingtest.tui.com.codewarschallenge.Model.ApplicationModelContract;
import codingtest.tui.com.codewarschallenge.Model.User;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    ApplicationModelContract applicationModelContract;
    CodeWarsAPI codeWarsAPI;

    public MainActivityPresenter(ApplicationModelContract applicationModelContract) {
        this.applicationModelContract = applicationModelContract;
        codeWarsAPI = CodeWarsAPIImplementation.getCodeWarsApiClient();
    }

    @Override
    public void requestDataFromServer(String user) {
        applicationModelContract.requestDataFromServer(codeWarsAPI, user);
    }

    @Override
    public void setUserResponse(User user) {
        User newUser = user;
    }
}
