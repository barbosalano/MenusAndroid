package com.example.barbosa.menus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_principal, menu );

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.itemSalvar:
                Toast.makeText(MainActivity.this, "Item Salvar", Toast.LENGTH_LONG).show();
            break;

            case R.id.itemEditar:
                Toast.makeText(MainActivity.this, "Item Editar", Toast.LENGTH_LONG).show();
                break;

            case R.id.itemConfiguracao:
                Toast.makeText(MainActivity.this, "Item Configuração", Toast.LENGTH_LONG).show();
                break;



        }

        return super.onOptionsItemSelected(item);
    }
}
