package codingtest.tui.com.codewarschallenge;

import android.view.View;
import android.widget.EditText;

import codingtest.tui.com.codewarschallenge.Model.User;

public interface MainActivityContract {

    interface Presenter{
        void setUserResponse(User user);
        void requestDataFromServer(String user);
    }

    interface View {
    }
}
