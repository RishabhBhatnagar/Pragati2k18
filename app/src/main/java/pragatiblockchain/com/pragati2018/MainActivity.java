package pragatiblockchain.com.pragati2018;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import pragatiblockchain.com.pragati2018.Fragments.ArtworkFragment;
import pragatiblockchain.com.pragati2018.Fragments.ProfileFragment;
import pragatiblockchain.com.pragati2018.Fragments.SearchFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomSheetDialog bottomSheetDialog;

    private View bottomSheetView;
    private Button button;
    private FloatingActionButton floatingActionButton;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);

        loadFragment(new ArtworkFragment());





        button = findViewById(R.id.button);
        bottomSheetDialog = new BottomSheetDialog(this);
        View bottomSheetView = getLayoutInflater().inflate(R.layout.bottom_sheet, null);
        bottomSheetDialog.setContentView(bottomSheetView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetDialog.show();
            }
        });






    }



    private boolean loadFragment(Fragment fragment){
        if(fragment!=null){

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment fragment = null;
        switch(item.getItemId()){
            case R.id.navigation_artwork:
                fragment = new ArtworkFragment();
                button.setVisibility(View.VISIBLE);
                break;
            case R.id.navigation_profile:
                fragment = new ProfileFragment();
                button.setVisibility(View.GONE);
                break;
            case R.id.navigation_search:
                fragment = new SearchFragment();
                button.setVisibility(View.GONE);
                break;
        }
        return loadFragment(fragment);
    }


    public void imageView1(View view){
        Toast.makeText(this, "imageView1", Toast.LENGTH_SHORT).show();
    }
    public void imageView2(View view){
        Toast.makeText(this, "imageView2", Toast.LENGTH_SHORT).show();
    }
}