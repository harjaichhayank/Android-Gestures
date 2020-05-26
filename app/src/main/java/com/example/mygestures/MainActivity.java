package com.example.mygestures;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private TextView textView;
    private GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        this.gestureDetector = new GestureDetector(this, this);
        gestureDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        textView.setText(R.string.onSingleTapConfirmed);
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        textView.setText(R.string.onDouleTap);
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        textView.setText(R.string.onDoubleTapEvent);
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        textView.setText(R.string.onDown);
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        textView.setText(R.string.onShowPress);
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        textView.setText(R.string.onSingleTapUp);
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        textView.setText(R.string.onScroll);
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        textView.setText(R.string.onLongPress);
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        textView.setText(R.string.onFling);
        return false;
    }
}
