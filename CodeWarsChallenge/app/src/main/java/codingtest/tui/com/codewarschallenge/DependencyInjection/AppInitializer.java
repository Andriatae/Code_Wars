package codingtest.tui.com.codewarschallenge.DependencyInjection;

import android.app.Application;


public class AppInitializer extends Application {

    private DependencyComponent dependencyComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        dependencyComponent = DaggerDependencyComponent.builder().build();
    }

    public DependencyComponent getDependencyComponent() {
        return dependencyComponent;
    }
}