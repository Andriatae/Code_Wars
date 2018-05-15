package codingtest.tui.com.codewarschallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import codingtest.tui.com.codewarschallenge.API.CodeWarsAPIImplementation;
import codingtest.tui.com.codewarschallenge.DependencyInjection.AppInitializer;
import codingtest.tui.com.codewarschallenge.Model.User;
import codingtest.tui.com.codewarschallenge.Model.CodeWarsUserCallback;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
