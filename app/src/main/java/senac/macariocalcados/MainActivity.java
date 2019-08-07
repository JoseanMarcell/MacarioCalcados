package senac.macariocalcados;

import android.app.ProgressDialog;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import senac.macariocalcados.adapters.SapatosAdapter;
import senac.macariocalcados.models.Sapato;

public class MainActivity extends AppCompatActivity {

    private List<Sapato> sapatoList = new ArrayList<>();
    private SapatosAdapter sapatosAdapter;
    private RecyclerView.LayoutManager manager;
    private RecyclerView rvSapatos;

    private TextView mTextMessage;
    private BottomNavigationView navView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        Sapato sapatotest = new Sapato("NIKE", "CASUAL","MASCULINO","INFANTIL", "30");
        sapatotest.setValor(20);
        sapatoList.add(sapatotest);

        bindView();
        setView();
        //setListener();

    }

    private void bindView(){
        mTextMessage = findViewById(R.id.message);
        navView = findViewById(R.id.nav_view);
        rvSapatos = findViewById(R.id.listaSapatos);
    }

    private void setView(){

        sapatosAdapter = new SapatosAdapter(sapatoList);
        manager = new GridLayoutManager(MainActivity.this, 2);
        rvSapatos.setLayoutManager(manager);
        rvSapatos.setAdapter(sapatosAdapter);

    }

    private void setAdapter(){


    }



    //private void setListener() {
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


    //}


}
