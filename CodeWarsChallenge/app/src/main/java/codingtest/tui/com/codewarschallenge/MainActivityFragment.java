package codingtest.tui.com.codewarschallenge;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import codingtest.tui.com.codewarschallenge.DependencyInjection.AppInitializer;

import javax.inject.Inject;

public class MainActivityFragment extends Fragment implements MainActivityContract.View {

    @Inject
    MainActivityContract.Presenter presenter;

    @BindView(R.id.user_or_id)
    EditText editUserName;

    @BindView(R.id.search_user)
    Button searchUser;

    private int columns = 1;

    public MainActivityFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((AppInitializer) getActivity().getApplication()).getDependencyComponent().inject(this);
        View view = inflater.inflate(R.layout.main_activity_fragment, container, false);
        ButterKnife.bind(this, view);
        searchUser.setOnClickListener(getOnSearchUserClickListener(editUserName));

        return view;
    }

    public View.OnClickListener getOnSearchUserClickListener(final EditText editText) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String userId = editText.getText().toString();
                if(!userId.isEmpty()) {
                    presenter.requestDataFromServer(editUserName.getText().toString());
                }
            }
        };
    }
}
