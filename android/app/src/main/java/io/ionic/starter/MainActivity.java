package io.ionic.starter;

import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {}

import com.ahm.capacitor.camera.preview.CameraPreview;

this.init(savedInstanceState, new ArrayList<Class<? extends Plugin>>() {{
      // Additional plugins you've installed go here
      // Ex: add(TotallyAwesomePlugin.class);
      add(CameraPreview.class);
}});
