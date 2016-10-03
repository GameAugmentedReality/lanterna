package br.eti.francisco.lanterna;

import android.hardware.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.hardware.Camera.Parameters;

public class MainActivity extends AppCompatActivity {

    private Camera mCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void ligarLanterna(View v) {
        mCamera = Camera.open();
        Parameters params;
        if( mCamera != null ){
            params = mCamera.getParameters();
            params.setFlashMode( Parameters.FLASH_MODE_TORCH );
            mCamera.setParameters(params);
            mCamera.startPreview();
            Log.i("LANTERNA", "luz ligada!!");
        }
    }

}
