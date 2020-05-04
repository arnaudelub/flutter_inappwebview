package com.pichillilorenzo.flutterwebviewexample;

import com.pichillilorenzo.flutter_inappwebview.PolyWebViewFlutterPlugin;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;

public class MainActivity extends FlutterActivity {
  @Override
  public void configureFlutterEngine(FlutterEngine flutterEngine) {
    flutterEngine.getPlugins().add(new PolyWebViewFlutterPlugin());
  }
}