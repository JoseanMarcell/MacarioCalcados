package senac.macariocalcados;

import android.app.ProgressDialog;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;

/* iniciando programação

    private RecyclerView recyclerView;
    MCAdapter adapter;

    static DatabaseReference myRef;
    private List<ListaSapatos> listasapato = new ArrayList<>();

    ProgressDialog progressDialog;

    private static boolean FIREBASE_OFFILINE;

    private ValueEventListener ListenerGeral = new ValueEventListener(){
        @Override
        public void onDataChange(@NonNull DataSnapShot dataSnapShot ){
        listasapato.clear();
            


        }


        final da programação iniciada
    } */


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_Home);
                    return true;
                case R.id.navigation_masculino:
                    mTextMessage.setText(R.string.title_Masculino);
                    return true;
                case R.id.navigation_feminino:
                    mTextMessage.setText(R.string.title_Feminino);
                    return true;
                case R.id.navigation_infantil:
                    mTextMessage.setText(R.string.title_Infantil);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
