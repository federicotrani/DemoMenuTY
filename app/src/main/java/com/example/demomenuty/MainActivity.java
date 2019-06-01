package com.example.demomenuty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_options_mainactivity, menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_acerca:
                levantarAcercaDe();
                return true;
            case R.id.action_salir:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }

    private void levantarAcercaDe() {
        Intent i = new Intent(MainActivity.this, HomeActivity.class );
        i.putExtra("PARAM_EMAIL","email@gmail.com");
        startActivity(i);

    }

    public void mostrarPopup(View v){
        ImageView imgAvatar = (ImageView) findViewById(R.id.imageView);
        PopupMenu popupMenu = new PopupMenu(this, imgAvatar);
        popupMenu.getMenuInflater().inflate(R.menu.menu_contextual_main,popupMenu.getMenu());

        //metodo de escucha para evento click del menu popup
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()){
                    case R.id.action_acerca:
                        Toast.makeText(MainActivity.this,"Ver Imagen!!",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_salir:
                        Toast.makeText(MainActivity.this,"Ver Detalle Imagen!!",Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });

        //mostramos el menu
        popupMenu.show();
    }
}
