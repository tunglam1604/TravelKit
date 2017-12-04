package tunglam.travelkit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity tag", "now running onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity tag", "now running onStart");

    }

    protected void onPause() {
        super.onPause();
        Log.i("MainActivity tag", "now running onPause");

    }

    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity tag", "now running onRestart");

    }

    protected void onResume() {
        super.onResume();
        Log.i("MainActivity tag", "now running onResume");

    }

    protected void onStop() {
        super.onStop();
        Log.i("MainActivity tag", "now running onStop");

    }


    /////
    ///CLICK ON Compass LINK
    public void onClickCompass(View view){
        Intent intent = new Intent(this, Compass.class);
        startActivity(intent);
    }

    ///CLICK ON Map LINK
    public void onClickMap(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
/**
    ///CLICK ON Photo LINK
    public void onClickPhoto(View view){
        Intent intent = new Intent(this, TakingPhoto.class);
        startActivity(intent);
    }
*/
    ///CLICK ON ChitChat LINK
    public void onClickChitChat(View view){
        Intent intent = new Intent(this, ChitChat.class);
        startActivity(intent);
    }
/**
    ///CLICK ON Weather LINK
    public void onClickWeather(View view){
        Intent intent = new Intent(this, Weather.class);
        startActivity(intent);
    }
 */


}
